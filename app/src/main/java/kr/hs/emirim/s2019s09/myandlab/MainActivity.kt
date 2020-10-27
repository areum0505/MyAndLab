package kr.hs.emirim.s2019s09.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kr.hs.emirim.s2019s09.myandlab.ch04widget.CalActivity

class MainActivity : AppCompatActivity() {
    lateinit var mProfile : ImageView
    lateinit var mButton1 : Button
    lateinit var mButton2 : Button
    lateinit var mButton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mButton3 = findViewById(R.id.button3)

        mButton1.setOnClickListener {
            //val intent = Intent(this, FourbuttonActivity::class.java)
            startActivity(Intent(this, FourbuttonActivity::class.java))
        }

        mButton2.setOnClickListener {
            startActivity(Intent(this, Fourbutton2Activity::class.java))
        }

        mButton3.setOnClickListener {
            startActivity(Intent(this, CalActivity::class.java))
        }
    }
}