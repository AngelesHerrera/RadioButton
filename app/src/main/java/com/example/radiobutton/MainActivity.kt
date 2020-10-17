package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var vtxtNum1: EditText
    lateinit var vtxtNum2: EditText
    lateinit var  vrdSuma: RadioButton
    lateinit var  rrdResta: RadioButton
    lateinit var  rrdMulti: RadioButton
    lateinit var  rrdDiv: RadioButton
    lateinit var  bOperacion: Button
    lateinit var  vtxtResultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vtxtNum1 = findViewById(R.id.txtNum1)
        vtxtNum2 = findViewById(R.id.txtNum2)
        vrdSuma = findViewById(R.id.rdSuma)
        rrdResta = findViewById(R.id.rdResta)
        rrdMulti = findViewById(R.id.rdMulti)
        rrdDiv = findViewById(R.id.rdDiv)
        bOperacion = findViewById(R.id.btnOperacion)
        vtxtResultado = findViewById(R.id.txtResultado)

        bOperacion.setOnClickListener {
           val num1:Int = txtNum1.text.toString().toInt()
           val num2:Int = txtNum2.text.toString().toInt()
            var res:Int=0
            if(vrdSuma.isChecked)
                res= num1+num2
            else if (rrdResta.isChecked)
                res=num1-num2
            else if (rrdMulti.isChecked)
                res=num1*num2
            else if (rrdDiv.isChecked)
                res=num1/num2
            vtxtResultado.text="$res"
        }


    }
}