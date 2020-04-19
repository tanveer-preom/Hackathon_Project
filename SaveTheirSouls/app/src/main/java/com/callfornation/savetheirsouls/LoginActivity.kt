package com.callfornation.savetheirsouls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun proceedClicked(view : View) {
        finish()
        startActivity(Intent(this, OtpVerificationActivity::class.java))
    }
}
