package com.example.roboticsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roboticsapp.databinding.ViewBinding

class Adapter(private val binding: ViewBinding, val robot:List<RobotData>): RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(binding: ViewBinding, view: View) : RecyclerView.ViewHolder(view) {
        var title = binding.title
        var robotimg = binding.logo
        var galaxy = binding.galaxy
        var distance = binding.distance
        var gravity = binding.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(binding, itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.title.text = robot[position].title
        holder.galaxy.text = robot[position].galaxy
        holder.distance.text = robot[position].distance + " m km"
        holder.gravity.text = robot[position].title + " m/ss"

        when (robot[position].title!!.toLowerCase()) {
            "mars" -> {
                dummyImage = R.drawable.image_editor
            }
            "neptune" -> {
                dummyImage = R.drawable.image_editor
            }
            "earth" -> {
                dummyImage = R.drawable.image_editor
            }
            "moon" -> {
                dummyImage = R.drawable.image_editor
            }
            "venus" -> {
                dummyImage = R.drawable.image_editor
            }
            "jupiter" -> {
                dummyImage = R.drawable.image_editor
            }
            "saturn" -> {
                dummyImage = R.drawable.image_editor
            }
            "uranus" -> {
                dummyImage = R.drawable.image_editor
            }
            "mercury" -> {
                dummyImage = R.drawable.image_editor
            }
            "sun" -> {
                dummyImage = R.drawable.image_editor
            }
        }
        holder.robotimg.setImageResource(dummyImage!!)
    }

    override fun getItemCount(): Int {
        return robot.size
    }
}