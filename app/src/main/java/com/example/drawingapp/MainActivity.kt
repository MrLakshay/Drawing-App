package com.example.drawingapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.example.drawingapp.PaintView.Companion.colorList
import com.example.drawingapp.PaintView.Companion.currentBrush
import com.example.drawingapp.PaintView.Companion.pathList
import kotlin.io.path.Path

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()


        var paintbrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn=findViewById<ImageButton>(R.id.red)
        val whiteBtn=findViewById<ImageButton>(R.id.white)
        val purpleBtn=findViewById<ImageButton>(R.id.purple)
        val blackBtn=findViewById<ImageButton>(R.id.black)
        redBtn.setOnClickListener(){
            paintbrush.setColor(Color.RED)
            currentColor(paintbrush.color)
        }
        blackBtn.setOnClickListener(){
            pathList.clear()
            colorList.clear()
            path.reset()

        }
        purpleBtn.setOnClickListener(){
            paintbrush.setColor(Color.BLUE)
            currentColor(paintbrush.color)

        }
        whiteBtn.setOnClickListener(){
            paintbrush.setColor(Color.WHITE)
            currentColor(paintbrush.color)
        }
    }
    private fun currentColor(color:Int){
        currentBrush=color
        path=Path()
    }
}