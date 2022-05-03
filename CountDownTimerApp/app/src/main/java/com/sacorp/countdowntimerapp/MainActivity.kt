package com.sacorp.countdowntimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvCounter:TextView =findViewById(R.id.tvTimer)


        object : CountDownTimer(1500000, 1000) {

            // Callback function, fired on regular interval
            override fun onTick(millisUntilFinished: Long) {

                val minutes = millisUntilFinished / 1000 / 60
                val seconds = millisUntilFinished / 1000 % 60

             //   tvCounter.setText("seconds remaining: " + millisUntilFinished / 1000)

                tvCounter.setText("${minutes}"+":"+"${seconds}")
            }

            // Callback function, fired
            // when the time is up
            override fun onFinish() {
                tvCounter.setText("done!")
            }
        }.start()
    }
}