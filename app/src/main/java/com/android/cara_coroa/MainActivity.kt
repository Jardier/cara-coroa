package com.android.cara_coroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var btJogar : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btJogar =  findViewById(R.id.btJogar);

        //Action
        btJogar.setOnClickListener{

            val intent = Intent(applicationContext, ResultadoActivity::class.java);

            val numero : Int = Random.nextInt(2);
            intent.putExtra("NUMERO", numero);
            startActivity(intent);
        }
    }
}
