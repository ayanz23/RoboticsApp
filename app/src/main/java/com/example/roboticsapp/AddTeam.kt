package com.example.roboticsapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import android.content.Intent


class AddTeam : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_team)

        val submitTeamButton = findViewById<Button>(R.id.submitTeamButton)
        submitTeamButton.setOnClickListener {
            val teamName = findViewById<EditText>(R.id.editTeamName).text.toString()
            val teamNumber = findViewById<EditText>(R.id.editTeamNumber).text.toString()

            val newRobot = RobotData(
                setData.getLastRobotID(),
                teamName,
                "Scotch Plains, New Jersey, USA",
                "78",
                teamNumber,
                "Team 1257 Parallel Universe is an unparalleled FIRST team that strives to inspire passion for STEM. We design and fabricate robots for the FIRST Robotics Competition (FRC) in order to develop talent in STEM and prepare a new generation of innovators, leaders, and entrepreneurs. Our aspiration is to create a community excited about STEM at the Union County Vocational-Technical Schools and beyond through FRC and our community outreach programs. We aim to create an environment where teamwork fuels creative problem solving."
            )

            System.out.println("New robot: " + newRobot.toString())

            // Add the new robot to the list
            setData.addRobot(newRobot)

            // Notify MainActivity to update data
            val mainActivityIntent = Intent(this, MainActivity::class.java)
            mainActivityIntent.putExtra("updateData", true)
            startActivity(mainActivityIntent)

            // Finish the activity or perform other actions as needed
            finish()
        }
    }
}