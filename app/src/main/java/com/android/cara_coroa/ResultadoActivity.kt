package com.android.cara_coroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    lateinit var imagemMoeda : ImageView;
    lateinit var btVoltar     : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        imagemMoeda = findViewById(R.id.ivMoeda);
        btVoltar = findViewById(R.id.btVoltar);

        val numero  = intent.getIntExtra("NUMERO", -1);

        when(numero){
            0 -> imagemMoeda.setImageResource(R.drawable.moeda_cara);
            1 -> imagemMoeda.setImageResource(R.drawable.moeda_coroa);
            else -> {
                imagemMoeda.setImageResource(R.drawable.moeda_sem_cara);
            }

        }

        //Configurando botão voltar
        btVoltar.setOnClickListener({
            finish();
        })
    }


}


