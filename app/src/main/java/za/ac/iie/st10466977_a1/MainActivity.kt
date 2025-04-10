package za.ac.iie.st10466977_a1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.accessibility.AccessibilityViewCommand.SetTextArguments

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_start: Button = findViewById(R.id.btn_start)
        val edit_text: EditText = findViewById(R.id.in_time)
        val result_text: TextView = findViewById(R.id.txt_error)
        result_text.visibility = View.GONE

        btn_start.setOnClickListener {
                val inputText = edit_text.text.toString().trim()
                if (inputText.equals("MORNING", ignoreCase = true)) {
                    result_text.visibility = View.GONE
                    GoToMorningScreen()
                } else {
                    result_text.text = "Error: you entered a invalid text!" +
                            "You must write: Morning, Mid Morning, Afternoon, Mid Afternoon, Dinner"
                    result_text.visibility = View.VISIBLE
                }
                if (inputText.equals("MID MORNING", ignoreCase = true)) {
                    result_text.visibility = View.GONE
                    GoToMidMorningScreen()
                } else {
                    result_text.text = "Error: you entered a invalid text!" +
                            "You must write: Morning, Mid Morning, Afternoon, Mid Afternoon, Dinner"
                    result_text.visibility = View.VISIBLE
                }
                if (inputText.equals("Afternoon", ignoreCase = true)) {
                    result_text.visibility = View.GONE
                    GoToAfternoonScreen()
                } else {
                    result_text.text = "Error: you entered a invalid text!" +
                            "You must write: Morning, Mid Morning, Afternoon, Mid Afternoon, Dinner"
                    result_text.visibility = View.VISIBLE
                }
                if (inputText.equals("Mid Afternoon", ignoreCase = true)) {
                    result_text.visibility = View.GONE
                    GotoMidAfternoonScreen()
                } else {
                    result_text.text = "Error: you entered a invalid text!" +
                            "You must write: Morning, Mid Morning, Afternoon, Mid Afternoon, Dinner"
                    result_text.visibility = View.VISIBLE
                }
                if (inputText.equals("Dinner", ignoreCase = true)) {
                    result_text.visibility = View.GONE
                    GoToDinnerScreen()
                } else {
                    result_text.text = "Error: you entered a invalid text!" +
                            "You must write: Morning, Mid Morning, Afternoon, Mid Afternoon, Dinner"
                    result_text.visibility = View.VISIBLE
                }
        }
    }

    private fun GoToMorningScreen() {
        val morningScreen = Intent(this, Morning::class.java)
        startActivity(morningScreen)
    }
    private fun GoToMidMorningScreen() {
        val midmorningScreen = Intent(this, MidMorning::class.java)
        startActivity(midmorningScreen)
    }
    private fun GoToAfternoonScreen() {
        val afternoonScreen = Intent(this, Afternoon::class.java)
        startActivity(afternoonScreen)
    }
    private fun GotoMidAfternoonScreen() {
        val midafternoonScreen = Intent(this, MidAfternoon::class.java)
        startActivity(midafternoonScreen)
    }
    private fun GoToDinnerScreen(){
        val dinnerScreen = Intent(this, Dinner::class.java)
        startActivity(dinnerScreen)
    }
}
