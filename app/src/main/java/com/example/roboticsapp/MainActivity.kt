package com.example.roboticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roboticsapp.databinding.ActivityMainBinding
import com.example.roboticsapp.databinding.ViewBinding
import com.example.roboticsapp.Adapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ViewBinding
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewBinding.inflate(layoutInflater)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        // Use the correct binding class
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainBinding.myRecycler.adapter = Adapter(binding, setData.SetPlanets())
        mainBinding.myRecycler.layoutManager = LinearLayoutManager(this)
        setContentView(mainBinding.root)
    }

}