package com.example.accesstoken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val accessToken: String = AccessToken().getToken("kabeer").toJwt()
        Toast.makeText(this,accessToken,Toast.LENGTH_SHORT).show()

    }
}