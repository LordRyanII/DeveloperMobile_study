package com.example.meuprimeiroprograma

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    
    fun sortear(view:View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado)//Encontre um item de interface pelo identificador
        val numero = java.util.Random().nextInt(100);
        textoResultado.setText("Número gerado:  $numero");
    }

    fun limparCampos(view:View){
        val numeroSorteado = findViewById<TextView>(R.id.text_resultado);
        numeroSorteado.setText("Não há números sorteados ainda!");

    }
}

