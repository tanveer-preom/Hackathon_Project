package com.callfornation.savetheirsouls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.callfornation.savetheirsouls.register.RegisterActivity

class LoginOrRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_or_registration)
    }

    fun onRegistrationClicked(view: View) {
        finish()
        startActivity(Intent(this, RegisterActivity::class.java))
    }

    fun onLoginClicked(view: View) {
        finish()
        startActivity(Intent(this, LoginActivity::class.java))
    }
}
