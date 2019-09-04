package com.robertoc.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hello_world = JSONObject("""{"0":"Hello world","1":"Olá mundo","2": "Hola mundo"}""")


        hello.setText("teste")
        hello.setOnClickListener {
            var r = (0..2).random().toString()
            var resultado = hello_world.get(r)  as String?
            hello.setText(resultado)

            var n = (0..2).random()
            val cores = this.resources.getIntArray(R.array.cores)
            myLayout.setBackgroundColor(cores[n])
        }
    }
}
