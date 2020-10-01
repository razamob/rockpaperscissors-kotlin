package sheridan.razamob.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_output.*
import sheridan.razamob.assignment1.databinding.ActivityMainBinding
import sheridan.razamob.assignment1.databinding.ActivityOutputBinding

class OutputActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_output)
        binding = ActivityOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val pChoice = intent.getStringExtra("pChoice")
        val usrChoice = intent.getStringExtra("usrChoice")
        val winner = intent.getStringExtra("winner")

        binding.useChoice.text = usrChoice
        binding.compChoice.text = pChoice
        binding.winnerTitle.text = winner

        //val playAgain = findViewById<Button>(R.id.playAgain)
        val intent = Intent(this, MainActivity::class.java)
        binding.playAgain.setOnClickListener{
            startActivity(intent)
        }
    }
}