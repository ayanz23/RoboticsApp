package com.example.roboticsapp

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roboticsapp.databinding.ViewBinding

class Adapter(private val binding: ViewBinding, val robot:List<RobotData>): RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(binding: ViewBinding, view: View) : RecyclerView.ViewHolder(view) {
        var title = binding.title
        var robotimg = binding.logo
        var location = binding.location
        var rank = binding.rank
        var number = binding.number
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = ViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return myViewHolder(itemView, itemView.root)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        System.out.println("robot[position].title" + robot[position].title)
        // set the text of the textViews from our data class.
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,RobotDetail::class.java)
            Log.d("Adapter", position.toString())
            Log.d("Adapter", robot[position].id.toString())
            intent.putExtra("robot",robot[position])
            intent.putExtra("robotImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }
        holder.title.setText(robot[position].title)
        holder.location.setText(robot[position].location)
        holder.rank.setText(robot[position].rank)
        holder.number.setText(robot[position].number)

        System.out.println(" What I see " + holder.title.text.toString())

        when (robot[position].title!!) {
            "Parallel Universe" -> {
                dummyImage = R.drawable.image_editor
            }
            "Peddie Robotics" -> {
                dummyImage = R.drawable.image_editor
            }
            "Mechanical Mustangs" -> {
                dummyImage = R.drawable.image_editor
            }
            "Krypton Cougars" -> {
                dummyImage = R.drawable.image_editor
            }
            "The MidKnight Inventors" -> {
                dummyImage = R.drawable.image_editor
            }
            "Aperture" -> {
                dummyImage = R.drawable.image_editor
            }
            "Team 1403 Cougar Robotics" -> {
                dummyImage = R.drawable.image_editor
            }
            "The Metal Moose" -> {
                dummyImage = R.drawable.image_editor
            }
            "LUNATECS" -> {
                dummyImage = R.drawable.image_editor
            }
            "The Pascack PI-oneers" -> {
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