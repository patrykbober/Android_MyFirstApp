package pl.patrykbober.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
        val textView2 = findViewById<TextView>(R.id.textView2).apply {
            text = message
        }
        val textView3 = findViewById<TextView>(R.id.textView3).apply {
            text = message
        }
    }
}
