package com.example.aulafrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Bom dia",
            "Boa noite",
            "Até amanhã",
            "Que seu dia seja belo",
            "Que chova!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numerosAleatorios = new Random().nextInt(3);
        String frase = frases[numerosAleatorios];
        texto.setText(frase);

    }
    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textoResultados = "";
        for(String frase:frases){
            textoResultados = textoResultados + frase + "\n";
            texto.setText(textoResultados);
        }
    };
}


