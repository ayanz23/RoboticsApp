package com.example.roboticsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roboticsapp.databinding.ActivityMainBinding
import com.example.roboticsapp.databinding.ViewBinding
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ViewBinding
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewBinding.inflate(layoutInflater)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        // Use the correct binding class
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setData.getDataIfNone()
        mainBinding.myRecycler.adapter = Adapter(binding, setData.reversedRobotList())
        mainBinding.myRecycler.layoutManager = LinearLayoutManager(this)
        setContentView(mainBinding.root)

        val addTeamButton = findViewById<Button>(R.id.addTeamButton)
        addTeamButton.setOnClickListener {
            startActivity(Intent(this, AddTeam::class.java))
        }
    }

}