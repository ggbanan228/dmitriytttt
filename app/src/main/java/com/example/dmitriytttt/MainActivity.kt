package com.example.dmitriytttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    var trueLogin : String = "hello"
    var truePassword : String = "12345"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick (v: View) {
        var userLogin: EditText = findViewById(R.id.login)
        var userPassword: EditText = findViewById(R.id.password)
        var res: TextView = findViewById(R.id.button)

        if (trueLogin == userLogin.text.toString() && truePassword == userPassword.text.toString() ) {
            var next: Intent = Intent(this, dimat::class.java)


            startActivity(next);

            res.setText("вы авторизоввались")
        } else
            res.setText("ХАРАШО")


    }
    fun output (text: String){
        var res: TextView = findViewById(R.id.button)
res.setText(text)



    }
    fun sum (s1 :String) :



}



















