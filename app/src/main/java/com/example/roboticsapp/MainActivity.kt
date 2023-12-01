package com.example.roboticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roboticsapp.databinding.ActivityMainBinding
import com.example.roboticsapp.databinding.ViewBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ViewBinding
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ViewBinding.inflate(layoutInflater)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        mainBinding.myRecycler.adapter = Adapter(binding, setData.SetPlanets())
//        my_recycler.adapter=Adapter(setData.SetPlanets())
        mainBinding.myRecycler.layoutManager = LinearLayoutManager(this)
    }
}