package com.semicolon.ddyzd_android.fcm

import android.content.ContentValues
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MsgFireBaseIdService: FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        val refreshToken=FirebaseInstanceId.getInstance().getToken()
        Log.d(ContentValues.TAG, "Refreshed token: $refreshToken")
    }
}