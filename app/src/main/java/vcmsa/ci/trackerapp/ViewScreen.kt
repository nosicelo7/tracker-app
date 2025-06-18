package vcmsa.ci.trackerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_screen)
        //Get arrays from intent(passed from Main Screen)
        val waterIntake = intent.getIntArrayExtra("waterIntake") ?: IntArray(7)
        val exerciseInput = intent.getIntArrayExtra("exerciseInput") ?: IntArray(7)
        val sleepMinutes = intent.getIntArrayExtra("sleepMinutes") ?: IntArray(7)

        val txtDetails = findViewById<TextView>(R.id.txtDetails)

        val sb = StringBuilder()  //sb is a string builder
        for (i in 0 until 7) {
            sb.append("Day ${i + 1}: \n")
            sb.append("Water Intake: ${waterIntake[i]} ml\n")
            sb.append("Exercise: ${exerciseInput[i]} min\n")
            sb.append(" Sleep - ${sleepMinutes[i]} minutes")
        }
        txtDetails.text = sb.toString()

        val btnMainScreen = findViewById<Button>(R.id.btnMainScreen)
        btnMainScreen.setOnClickListener {
            finish()
        }
    }
}