package com.example.lights

import android.app.WallpaperManager
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Инициализация кнопок
        val redButton = findViewById<Button>(R.id.red_btn)
        val yellowButton = findViewById<Button>(R.id.yellow_btn)
        val greenButton = findViewById<Button>(R.id.green_btn)
        val backButton = findViewById<CheckBox>(R.id.back_chkbx)
        val layout = findViewById<ConstraintLayout>(R.id.layout)
        val wm = WallpaperManager.getInstance(applicationContext)
        backButton.visibility = View.INVISIBLE


        //Устанавливаю цвета кнопок
        redButton.setBackgroundColor(Color.parseColor("#fc0313"))
        yellowButton.setBackgroundColor(Color.parseColor("#fff700"))
        greenButton.setBackgroundColor(Color.parseColor("#0dff00"))
        backButton.setTextColor(Color.parseColor("#000000"))


        //Обработчики кнопок
        redButton.setOnClickListener {
            wm.setResource(R.drawable.red)
            redButton.visibility = View.INVISIBLE
            yellowButton.visibility = View.INVISIBLE
            greenButton.visibility = View.INVISIBLE
            backButton.visibility = View.VISIBLE
        }

        yellowButton.setOnClickListener {
            wm.setResource(R.drawable.yellow)
            redButton.visibility = View.INVISIBLE
            yellowButton.visibility = View.INVISIBLE
            greenButton.visibility = View.INVISIBLE
            backButton.visibility = View.VISIBLE
        }

        greenButton.setOnClickListener {
            wm.setResource(R.drawable.green)
            redButton.visibility = View.INVISIBLE
            yellowButton.visibility = View.INVISIBLE
            greenButton.visibility = View.INVISIBLE
            backButton.visibility = View.VISIBLE
        }

        backButton.setOnClickListener {
            wm.setResource(R.drawable.standart)
            backButton.visibility = View.INVISIBLE
            backButton.isChecked = false
            redButton.visibility = View.VISIBLE
            yellowButton.visibility = View.VISIBLE
            greenButton.visibility = View.VISIBLE
        }


    }
}