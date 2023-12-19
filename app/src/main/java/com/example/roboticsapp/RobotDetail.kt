package com.example.roboticsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewbinding.ViewBinding
import androidx.viewbinding.ViewBindings
import com.example.roboticsapp.databinding.ActivityRobotDetailBinding

class RobotDetail : AppCompatActivity() {
    private lateinit var obj:RobotData
    private var robotImg:Int?=null
    private lateinit var binding: ActivityRobotDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }

        binding = ActivityRobotDetailBinding.inflate(layoutInflater)
        obj= intent.getParcelableExtra("robot")!!
        robotImg=intent.getIntExtra("robotImage",-1)
        Log.d("RobotDetail", obj.id.toString())
        setData(obj, robotImg!!)

        binding.buttonInfo.setOnClickListener{
            val intent= Intent(this,finalActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)

    }
    private fun setData(obj:RobotData,robotImg:Int)
    {

        binding.titleInfo.text=obj.title
        binding.rankInfo.text="#" + obj.rank
        binding.numberInfo.text=obj.number
        binding.overviewInfo.text=obj.overview
        binding.locationInfo.text=obj.location
        binding.robotImgInfo.setImageResource(robotImg)
    }
}