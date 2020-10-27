package kr.hs.emirim.s2019s09.myandlab.ch04widget

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kr.hs.emirim.s2019s09.myandlab.R
import kotlin.Exception
import kotlin.NullPointerException

class CalActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var textResult : TextView
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        title = "초간단 계산기"
        edit1 = findViewById(R.id.edNum1)
        edit2 = findViewById(R.id.edNum2)
        textResult = findViewById(R.id.tvResult)

        edit1.setText(0)
        edit2.setText(0)

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            try {
                textResult.text = (Integer.parseInt(edit1.text.toString()) + Integer.parseInt(edit2.text.toString())).toString()
            } catch (e: NullPointerException) {
                Toast.makeText(this, "무언가를 입력해주세요", Toast.LENGTH_SHORT).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Toast.makeText(this, "알 수 없는 예외 발생", Toast.LENGTH_SHORT).show()
            }
        }
        findViewById<Button>(R.id.btnMinus).setOnClickListener {
            try {
                textResult.text = (Integer.parseInt(edit1.text.toString()) - Integer.parseInt(edit2.text.toString())).toString()
            } catch (e: NullPointerException) {
                Toast.makeText(this, "무언가를 입력해주세요", Toast.LENGTH_SHORT).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Toast.makeText(this, "알 수 없는 예외 발생", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onClick(v: View?) {

    }


}