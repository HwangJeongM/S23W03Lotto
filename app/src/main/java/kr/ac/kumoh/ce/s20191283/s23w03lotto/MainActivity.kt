package kr.ac.kumoh.ce.s20191283.s23w03lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.ce.s20191283.s23w03lotto.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnGenerate.setOnClickListener {
            main.num1.text = Random.nextInt(1,46).toString()
            main.num1.text = Random.nextInt(1,46).toString()
            main.num1.text = Random.nextInt(1,46).toString()
            main.num1.text = Random.nextInt(1,46).toString()
            main.num1.text = Random.nextInt(1,46).toString()
            main.num1.text = Random.nextInt(1,46).toString()
        }
    }
}