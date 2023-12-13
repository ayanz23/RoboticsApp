package com.example.roboticsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.roboticsapp.databinding.ActivityRobotDetailBinding

class RobotDetail : AppCompatActivity() {
    private lateinit var obj:RobotData
    private var robotImg:Int?=null
    private lateinit var binding: ActivityRobotDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robot_detail)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }

        binding = ActivityRobotDetailBinding.inflate(layoutInflater)
        obj= intent.getParcelableExtra("robot")!!
        robotImg=intent.getIntExtra("robotImage",-1)
        setData(obj, robotImg!!)

        binding.buttonInfo.setOnClickListener{
            val intent= Intent(this,finalActivity::class.java)
            startActivity(intent)
        }
    }
    private fun setData(obj:RobotData,robotImg:Int)
    {

        binding.titleInfo.text=obj.title
        binding.distanceInfo.text=obj.distance+"m km"
        binding.gravityInfo.text=obj.gravity+" m/ss"
        binding.overviewInfo.text=obj.overview
        binding.galaxyInfo.text=obj.galaxy
        binding.robotImgInfo.setImageResource(robotImg)
    }
}