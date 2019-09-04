package com.robertoc.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "Hello world"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        hello.setText(TAG)

        hello.setOnClickListener {
            var n = (0..2).random()
            val cores = this.resources.getIntArray(R.array.cores)
            myLayout.setBackgroundColor(cores[n])
        }
    }
}
