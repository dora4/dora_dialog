package dora.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvShowDialog = findViewById<TextView>(R.id.tvShowDialog)
        tvShowDialog.setOnClickListener {
            DoraDialog.Builder(this)
                    .create(DoraDialogWindow(R.layout.dialog_sample))
                    .onAttach(object : DoraDialog.OnAttachListener {
                        override fun onAttached(window: ADialogWindow) {
                            Toast.makeText(this@MainActivity, "onAttached", Toast.LENGTH_SHORT).show()
                        }
                    })
                    .toggle()
        }
    }
}