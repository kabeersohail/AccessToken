package com.example.accesstoken

import com.twilio.jwt.accesstoken.AccessToken
import com.twilio.jwt.accesstoken.VideoGrant

class AccessToken {

    val TWILIO_ACCOUNT_SID = "SKa31c8611edc54919f9e2cc503da7bb28"
    val TWILIO_API_KEY = "SKa8f1e74612c0158f59c3b3c4bd1f210d"
    val TWILIO_API_SECRET = "iOcdvY9etPGxToelDxyNtD3F5kfmy13c"

    fun getToken(identity: String): AccessToken =
        AccessToken.Builder(TWILIO_ACCOUNT_SID, TWILIO_API_KEY, TWILIO_API_SECRET)
            .identity(identity)
            .grant(VideoGrant().setRoom("MyRoom"))
            .build()
}