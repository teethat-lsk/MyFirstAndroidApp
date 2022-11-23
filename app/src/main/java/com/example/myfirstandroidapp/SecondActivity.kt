package com.example.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstandroidapp.MainActivity.Companion.TEXT_DATA
import com.example.myfirstandroidapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding: ActivitySecondBinding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val receivedText = intent.getStringExtra(TEXT_DATA)
        receivedText?.let { text -> binding.tvHello.text = text }
    }
}