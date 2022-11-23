package com.example.myfirstandroidapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.affirmations.data.DataSource
import com.example.myfirstandroidapp.adapter.AffirmationRecViewAdapter
import com.example.myfirstandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val dataSource = DataSource().loadAffirmations()
        val affiremationAdapter = AffirmationRecViewAdapter(this, dataSource)
        val snapHelper = LinearSnapHelper();
        binding.recView.adapter = affiremationAdapter
        snapHelper.attachToRecyclerView(binding.recView)

    }
}