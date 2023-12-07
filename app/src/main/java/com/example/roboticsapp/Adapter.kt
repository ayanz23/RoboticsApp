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
        val itemView = ViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return myViewHolder(itemView, itemView.root)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        System.out.println("robot[position].title" + robot[position].title)
        // set the text of the textViews from our data class.
        holder.title.setText(robot[position].title)
        holder.galaxy.setText(robot[position].galaxy)
        holder.distance.setText(robot[position].distance)
        holder.gravity.setText(robot[position].gravity)

        System.out.println(" What I see " + holder.title.text.toString())

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

        // make holder view update visually
    }

    override fun getItemCount(): Int {
        return robot.size
    }
}