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
            val teamRank = findViewById<EditText>(R.id.editTeamRank).text.toString()
            val teamLocation = findViewById<EditText>(R.id.editTeamLocation).text.toString()
            val teamDescription = findViewById<EditText>(R.id.editTeamDescription).text.toString()

            val newRobot = RobotData(
                setData.getLastRobotID(),
                teamName,
                teamLocation,
                teamRank,
                teamNumber,
                teamDescription
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