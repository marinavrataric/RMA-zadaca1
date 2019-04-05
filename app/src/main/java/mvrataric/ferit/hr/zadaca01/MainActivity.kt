package mvrataric.ferit.hr.zadaca01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iwGosling.setOnClickListener { message1() }
        iwJobs.setOnClickListener { message2() }
        iwRubin.setOnClickListener { message3() }
    }

    private fun message3() {
        Toast.makeText(this, "When the opportunity comes, this is like aligning the stars.", Toast.LENGTH_LONG).show()
    }

    private fun message2() {
        Toast.makeText(this, "That’s been one of my mantras – focus and simplicity.", Toast.LENGTH_LONG).show()
    }

    private fun message1() {
        Toast.makeText(this,"Java is C++ without the guns, clubs and knives.", Toast.LENGTH_LONG).show()
    }
}
