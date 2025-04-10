package za.ac.iie.st10466977_a1

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MidAfternoon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mid_afternoon)
        val btn_exit: Button = findViewById(R.id.btn_exit)

        btn_exit.setOnClickListener {
            finish()
        }
    }
}