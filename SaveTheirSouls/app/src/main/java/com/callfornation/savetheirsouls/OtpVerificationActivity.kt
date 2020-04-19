package com.callfornation.savetheirsouls


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.callfornation.savetheirsouls.dashboard.DashboardActivity



class OtpVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification)

    }



    fun proceedClicked(view: View) {
        finish()
        startActivity(Intent(this, DashboardActivity::class.java))
    }
}
