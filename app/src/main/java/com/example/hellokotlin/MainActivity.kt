package com.example.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)      //オーバーライド
        setContentView(R.layout.activity_main)  //Rクラスってやつです。resフォルダと対応しているって考えましょう

        var textMessage = findViewById<TextView>(R.id.textMessage)

        var buttonCat = findViewById<Button>(R.id.buttonCat)
        var buttonDog = findViewById<Button>(R.id.buttonDog)


        buttonCat.setOnClickListener {
            textMessage.setText(R.string.text_message_cat)
        }

        buttonDog.setOnClickListener {
            textMessage.setText(R.string.text_message_dog)
        }
    }
}