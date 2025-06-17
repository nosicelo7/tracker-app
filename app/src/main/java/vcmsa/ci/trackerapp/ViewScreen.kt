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
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_screen)

    val correctData = intent.getIntExtra("correctData", 0)
    val message = if (correctData > 0) {
        "Congrats! You did well today"
    }
    val txtWater = findViewById<TextView>(R.id.txtWater)
    val txtExercise = findViewById<TextView>(R.id.txtExercise)
    val txtSleep = findViewById<TextView>(R.id.txtSleep)

    txtWater.text = ""
    txtExercise.text = ""
    txtSleep.text = ""
    feedbackTextView = ""

     btnView.setOnClickListener {
         txtWater.text = "Total water intake for today: $correctData"
         txtExercise.text = "Total exercise time for today: $correctData"
         txtSleep.text = "Total sleep time for today: $correctData"
     }
     findViewById<Button>(R.id.btnMainScreen).setOnClickListener {
         finish()
     }
  }
}