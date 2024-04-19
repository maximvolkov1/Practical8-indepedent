package com.example.practical8_independent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonTextSize16: Button = findViewById(R.id.button_16_sp)
        val ButtonTextSize24: Button = findViewById(R.id.button_24_sp)
        val ButtonTextSize32: Button = findViewById(R.id.button_32_sp)
        val textView: TextView = findViewById(R.id.textView)
        ButtonTextSize16.setOnClickListener {
            textView.setText(resources.getText(R.string.size_text_16))
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16.toFloat())
        }
        ButtonTextSize24.setOnClickListener {
            textView.setText(resources.getText(R.string.size_text_24))
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24.toFloat())
        }
        ButtonTextSize32.setOnClickListener {
            textView.setText(resources.getText(R.string.size_text_32))
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32.toFloat())
        }
    }
}