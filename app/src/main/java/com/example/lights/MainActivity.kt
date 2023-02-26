package com.example.lights

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Инициализация кнопок
        val redButton = findViewById<Button>(R.id.red_btn)
        val yellowButton = findViewById<Button>(R.id.yellow_btn)
        val greenButton = findViewById<Button>(R.id.green_btn)
        val backButton = findViewById<Button>(R.id.back_chkbx)
        val layout = findViewById<ConstraintLayout>(R.id.layout)
        backButton.visibility = View.INVISIBLE

        //Устанавливаю цвета кнопок
        redButton.setBackgroundColor(Color.parseColor("#fc0313"))
        yellowButton.setBackgroundColor(Color.parseColor("#fff700"))
        greenButton.setBackgroundColor(Color.parseColor("#0dff00"))
        backButton.setTextColor(Color.parseColor("#000000"))


        //Обработчики кнопок
        redButton.setOnClickListener {
            layout.setBackgroundColor(Color.parseColor("#fc0313"))//Установка цвета
            backButton.visibility = View.VISIBLE//Прячу кнопку назад
            //Прячу кнопки светофора
            redButton.visibility = View.INVISIBLE
            yellowButton.visibility = View.INVISIBLE
            greenButton.visibility = View.INVISIBLE
        }

        yellowButton.setOnClickListener {
            layout.setBackgroundColor(Color.parseColor("#fff700"))//Установка цвета
            backButton.visibility = View.VISIBLE//Прячу кнопку назад
            //Прячу кнопки светофора
            redButton.visibility = View.INVISIBLE
            yellowButton.visibility = View.INVISIBLE
            greenButton.visibility = View.INVISIBLE
        }

        greenButton.setOnClickListener {
            layout.setBackgroundColor(Color.parseColor("#0dff00"))//Установка цвета
            backButton.visibility = View.VISIBLE//Прячу кнопку назад
            //Прячу кнопки светофора
            redButton.visibility = View.INVISIBLE
            yellowButton.visibility = View.INVISIBLE
            greenButton.visibility = View.INVISIBLE
        }

        backButton.setOnClickListener {
            layout.setBackgroundColor(Color.parseColor("#ffffff"))//Установка цвета
            backButton.visibility = View.INVISIBLE//Прячу кнопку назад
            //Делаю кнопки светофора снова видимыми
            redButton.visibility = View.VISIBLE
            yellowButton.visibility = View.VISIBLE
            greenButton.visibility = View.VISIBLE
        }


    }
}