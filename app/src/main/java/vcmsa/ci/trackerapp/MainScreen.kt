//Nosicelo Ngubane
//ST10483775

package vcmsa.ci.trackerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    //EditTexts fields for user input
    private lateinit var editTxtWater: EditText
    private lateinit var editTxtExercise: EditText
    private lateinit var editTxtSleep: EditText
    private lateinit var textView: TextView

    //Buttons for navigation and clearing data
    private lateinit var btnNext: Button
    private lateinit var btnClear: Button

    //Parallel Arrays for 7 days of numbers
    private val waterIntake = IntArray(7)
    private val exerciseInput = IntArray(7)
    private val sleepMinutes = IntArray(7)

    //Track which day we're entering data for (0-6)
    private var currentDay = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        //All UI components
        editTxtWater = findViewById(R.id.editTxtWater)
        editTxtExercise = findViewById(R.id.editTxtExercise)
        editTxtSleep = findViewById(R.id.editTxtSleep)
        btnNext = findViewById(R.id.btnNext)
        btnClear = findViewById(R.id.btnClear)
        textView = findViewById(R.id.textView)

        //Next button saves input and moves to next day, or the details screen
        btnNext.setOnClickListener {
            if (currentDay < 7) {
                if (savesInputsForDay(currentDay)) {
                    currentDay++
                    if (currentDay == 7) {
                       textView.text = "All days entered!"
                       btnNext.text = "View Details"
                    }else {
                        textView.text = "Enter data for day {$currentDay + 1}"
                        clearInputsFields()
                    }
                }
            } else {
                val intent = Intent(this, ViewScreen::class.java)
                intent.putExtra("waterIntake", waterIntake)
                intent.putExtra("exerciseInput", exerciseInput)
                intent.putExtra("sleepMinutes", sleepMinutes)
                startActivity(intent)
            }
        }

        btnClear.setOnClickListener {
        clearAllData()
        }
    }

    private fun savesInputsForDay(day: Int): Boolean {
        val water = editTxtWater.text.toString()
        val exercise = editTxtExercise.text.toString()
        val sleep = editTxtSleep.text.toString()

        if (water.isBlank() || exercise.isBlank() || sleep.isBlank()) {
            textView.text = "Please fill in all fields"
            return false
        }
        try {
            waterIntake[day] = water.toInt()
            exerciseInput[day] = exercise.toInt()
            sleepMinutes[day] = sleep.toInt()
        } catch (e: NumberFormatException) {
            textView.text = "Please enter valid numbers"
            return false
        }
            return true
    }

    private fun clearInputsFields() {
        editTxtWater.text.clear()
        editTxtExercise.text.clear()
        editTxtSleep.text.clear()
    }

    private fun clearAllData() {
        for (i in 0 until 6) {
            waterIntake[i] = 0
            exerciseInput[i] = 0
            sleepMinutes[i] = 0
        }
        currentDay = 0
        clearInputsFields()
        textView.text = "Enter data for day 1"
        btnNext.text = "Next"
    }
}




