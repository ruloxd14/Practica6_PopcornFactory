package molina.raul.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent: Intent = Intent(this, Catalogo::class.java)
        val buton: Button = findViewById(R.id.botonP) as Button

        buton.setOnClickListener() {
            startActivity(intent)
        }
    }
}