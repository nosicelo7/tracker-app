package vcmsa.ci.trackerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    val button = findViewById<Button>(R.id.button)
    val textView = findViewById<TextView>(R.id.textView)
    val textView2 = findViewById<TextView>(R.id.textView2)
    val textView3 = findViewById<TextView>(R.id.textView3)

    button.setOnClickListener {
        val intent = Intent(this, MainScreen::class.java)
        startActivity(intent)
       }
    }
}