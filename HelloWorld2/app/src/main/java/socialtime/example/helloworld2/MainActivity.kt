package socialtime.example.helloworld2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_button.setOnClickListener {
            val message = message_edittexGt.text.toString()
            message_edittexGt.setText("")
            message_textview.text = message
        }
    }
}