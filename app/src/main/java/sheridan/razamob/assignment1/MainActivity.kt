package sheridan.razamob.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun playGame(intent: Intent){
        val play = findViewById<Button>(R.id.playButton)
        play.setOnClickListener{
            startActivity(intent)
        }
    }

    fun passData(pChoice: String, usrChoice: String, winner: String){
            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("pChoice", pChoice)
            intent.putExtra("usrChoice", usrChoice)
            intent.putExtra("winner", winner)
            playGame(intent)
    }
    //0 = paper 1 = rock 2 = scissors
    fun paperBTn(view: View){
        val oppChoice = Random.nextInt(2)
        var pChoice = ""
        var usrChoice = "I picked Paper"
        var winner = ""
        when(oppChoice){
              0->  pChoice = "PC picked Paper"
              1-> pChoice = "PC picked Rock"
              2-> pChoice = "PC picked Scissors"
//            0-> pcChoice.text = "PC picked Paper"
//            1 -> pcChoice.text = "PC picked Rock"
//            2 -> pcChoice.text = "PC picked Scissors"
        }
        //userChoice.text = "I picked Paper"

        when(oppChoice){
              0 -> winner = "It's a Draw!"
              1 -> winner = "You Win!"
              2 -> winner = "PC Wins!"
//            0 -> gameTitle.text = "It's a Draw!"
//            1 -> gameTitle.text = "You Win!"
//            2 -> gameTitle.text = "PC Wins!"
        }

        passData(pChoice, usrChoice, winner)
    }
    fun rockBTn(view: View){
        val oppChoice = Random.nextInt(2)
        var pChoice = ""
        var usrChoice = "I picked Rock"
        var winner = ""

        when(oppChoice){
            0->  pChoice = "PC picked Paper"
            1-> pChoice = "PC picked Rock"
            2-> pChoice = "PC picked Scissors"
//            0-> pcChoice.text = "PC picked Paper"
//            1 -> pcChoice.text = "PC picked Rock"
//            2 -> pcChoice.text = "PC picked Scissors"
        }
//        userChoice.text = "I picked Rock"

        when(oppChoice){
            0 -> winner = "PC Wins!"
            1 -> winner = "It's a Draw!"
            2 -> winner = "You Win!"
//            0 -> gameTitle.text = "PC Wins!"
//            1 -> gameTitle.text = "It's a Draw!"
//            2 -> gameTitle.text = "You Win!"
        }
        passData(pChoice, usrChoice, winner)
    }
    fun scissorsBTn(view: View){
        val oppChoice = Random.nextInt(2)
        var pChoice = ""
        var usrChoice = "I picked Scissors"
        var winner = ""

        when(oppChoice){
            0->  pChoice = "PC picked Paper"
            1-> pChoice = "PC picked Rock"
            2-> pChoice = "PC picked Scissors"
//            0-> pcChoice.text = "PC picked Paper"
//            1 -> pcChoice.text = "PC picked Rock"
//            2 -> pcChoice.text = "PC picked Scissors"
        }
//        userChoice.text = "I picked Scissors"

        when(oppChoice){
            0 -> winner = "You Win!"
            1 -> winner = "PC Wins!"
            2 -> winner = "It's a Draw!"
//            0 -> gameTitle.text = "You Win!"
//            1 -> gameTitle.text = "PC Wins!"
//            2 -> gameTitle.text = "It's a Draw!"
        }
        passData(pChoice, usrChoice, winner)
    }
}