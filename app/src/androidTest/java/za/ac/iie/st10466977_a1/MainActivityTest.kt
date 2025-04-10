package za.ac.iie.st10466977_a1

import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var activityScenario: ActivityScenario<MainActivity>
    @Before
    fun setup() {
// Launch the activity before each test
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    }
    @Test
    fun testButtonClickUpdatesTextView() {
        activityScenario.onActivity { activity ->
// Set up references to UI elements
            val btn_start: Button = activity.findViewById(R.id.btn_start)
            val txt_error: TextView = activity.findViewById(R.id.txt_error)
            val editText: EditText = activity.findViewById(R.id.in_time)
// Simulate user input
            editText.setText("Morning")
// Perform button click
            btn_start.performClick()
// Check if the TextView's text was updated
            assertEquals("Hello, John! Button was clicked!", txt_error.text)
            assertEquals(Color.RED, txt_error.currentTextColor)
        }
    }
}
