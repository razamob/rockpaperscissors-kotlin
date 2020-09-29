package sheridan.razamob.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_output.*

class OutputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val pChoice = intent.getStringExtra("pChoice")
        val usrChoice = intent.getStringExtra("usrChoice")
        val winner = intent.getStringExtra("winner")

        useChoice.text = usrChoice
        compChoice.text = pChoice
        winnerTitle.text = winner

        val playAgain = findViewById<Button>(R.id.playAgain)
        val intent = Intent(this, MainActivity::class.java)
        playAgain.setOnClickListener{
            startActivity(intent)
        }
    }
}