package com.semicolon.ddyzd_android.fcm

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.semicolon.ddyzd_android.R
import com.semicolon.ddyzd_android.ul.activity.MainActivity

class MsgFirebaseMessagingService : FirebaseMessagingService() {

    private val TAG = "FirebaseService"

    /**
     * FirebaseInstanceIdService is deprecated.
     * this is new on firebase-messaging:17.1.0
     */
    override fun onNewToken(p0: String) {
        Log.d(TAG, "new Token: $p0")
        val startShared =
            getSharedPreferences("device", Context.MODE_PRIVATE)
        startShared.edit().putString("device_token",p0).apply()

    }

    /**
     * this method will be triggered every time there is new FCM Message.
     */
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.from)

        if(remoteMessage.notification != null) {
            Log.d(TAG, "Notification Message Body: ${remoteMessage.notification?.body}")
            val getMessage=remoteMessage.notification!!.body
            val hashMap=HashMap<String,String>()
            hashMap["key"]=getMessage!!

            sendNotification(hashMap)

            val intent=Intent("alert_data")
            intent.putExtra("msg",getMessage)
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
        }
    }

    private fun sendNotification(data:Map<String,String>?) {
        var message=""
        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            flags=Intent.FLAG_ACTIVITY_SINGLE_TOP
        }

        if(data!=null&& data.isNotEmpty()){
            message= data["key"] ?: error("")
        }

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        val channelId=getString(R.string.default_notification_channel_id)
        val notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val notificationBuilder = NotificationCompat.Builder(this,channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Semicolon")
            .setContentText(message)
            .setAutoCancel(true)
            .setSound(notificationSound)
            .setContentIntent(pendingIntent)

        val notificationManager: NotificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val channel=NotificationChannel(channelId,"Channel human readable title",NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(channel)
        }
        notificationManager.notify(0, notificationBuilder.build())
    }
}
