package lat.pam.arch

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(ViewModel::class.java)

        var num = 0
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView.text = viewModel.num.toString()

        button.setOnClickListener {
            viewModel.addNum()
            textView.text = viewModel.num.toString()
        }
    }
}