package com.semicolon.ddyzd_android.fcm

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class MsgFirebaseMessagingService : FirebaseMessagingService() {

    /**
     * FirebaseInstanceIdService is deprecated.
     * this is new on firebase-messaging:17.1.0
     */
    override fun onNewToken(p0: String) {
        val startShared =
            getSharedPreferences("device", Context.MODE_PRIVATE)
        startShared.edit().putString("device_token", p0).apply()
    }

    /**
     * this method will be triggered every time there is new FCM Message.
     */
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        if (remoteMessage.notification != null) {
            val getMessage = remoteMessage.notification!!.body
            val getTitle = remoteMessage.notification!!.title
            val getRoomId = remoteMessage.data["room_id"]
            val getUserType = remoteMessage.data["user_type"]
            val hashMap = HashMap<String, String>()
            hashMap["body"] = getMessage!!
            hashMap["title"] = getTitle!!

            if (!getRoomId.isNullOrEmpty() || !getUserType.isNullOrEmpty()) {
                hashMap["roomId"] = getRoomId.toString()
                hashMap["userType"] = getUserType.toString()
            }

            val intent = Intent("alert_data")
            intent.putExtra("msg", getMessage)
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
            sendNotification(hashMap)
        }
    }

    private fun sendNotification(data: Map<String, String>?) {
        var message = ""
        var title = ""
        var roomId = ""
        var userType = ""
        if (data != null && data.isNotEmpty()) {
            message = data["body"] ?: error("")
            title = data["title"] ?: error("")
            if (!data["roomId"].isNullOrEmpty()) {
                roomId = data["roomId"] ?: error("")
                userType = data["userType"].toString()
            }
        }
        val intent = Intent(this, MainActivity::class.java).apply {
            this.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            this.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        }

        //채팅데이터가 있을때
        if (roomId.isNotEmpty()) {
            intent.putExtra("chatRoomId", roomId)
            intent.putExtra("chatClubName", title)
            intent.putExtra("fcmClicked", true)
            if (userType == "C" || userType == "H1" || userType == "H4") {
                intent.putExtra("chatIndex", 1)
            }
        }


        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        val channelId = getString(R.string.default_notification_channel_id)
        val notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val notificationBuilder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(title)
            .setContentText(message)
            .setAutoCancel(true)
            .setSound(notificationSound)
            .setContentIntent(pendingIntent)

        val notificationManager: NotificationManager =
            this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "DDYZD",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }
        notificationManager.notify(0, notificationBuilder.build())
    }
}