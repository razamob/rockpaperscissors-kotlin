package sheridan.razamob.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //0 = paper 1 = rock 2 = scissors
    fun paperBTn(view: View){
        val oppChoice = Random.nextInt(2)
        when(oppChoice){
            0-> pcChoice.text = "PC picked Paper"
            1 -> pcChoice.text = "PC picked Rock"
            2 -> pcChoice.text = "PC picked Scissors"
        }
        userChoice.text = "I picked Paper"

        when(oppChoice){
            0 -> gameTitle.text = "It's a Draw!"
            1 -> gameTitle.text = "You Win!"
            2 -> gameTitle.text = "PC Wins!"
        }
    }
    fun rockBTn(view: View){
        val oppChoice = Random.nextInt(2)
        when(oppChoice){
            0-> pcChoice.text = "PC picked Paper"
            1 -> pcChoice.text = "PC picked Rock"
            2 -> pcChoice.text = "PC picked Scissors"
        }
        userChoice.text = "I picked Rock"

        when(oppChoice){
            0 -> gameTitle.text = "PC Wins!"
            1 -> gameTitle.text = "It's a Draw!"
            2 -> gameTitle.text = "You Win!"
        }
    }
    fun scissorsBTn(view: View){
        val oppChoice = Random.nextInt(2)
        when(oppChoice){
            0-> pcChoice.text = "PC picked Paper"
            1 -> pcChoice.text = "PC picked Rock"
            2 -> pcChoice.text = "PC picked Scissors"
        }
        userChoice.text = "I picked Scissors"

        when(oppChoice){
            0 -> gameTitle.text = "You Win!"
            1 -> gameTitle.text = "PC Wins!"
            2 -> gameTitle.text = "It's a Draw!"
        }
    }
}