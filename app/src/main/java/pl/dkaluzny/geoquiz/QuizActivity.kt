package pl.dkaluzny.geoquiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        true_button.setOnClickListener{
            Toast.makeText(this@QuizActivity, R.string.true_button, Toast.LENGTH_LONG).show()
        }
        false_button.setOnClickListener {
            Toast.makeText(this@QuizActivity, R.string.false_button, Toast.LENGTH_LONG).show()
        }

    }
}
