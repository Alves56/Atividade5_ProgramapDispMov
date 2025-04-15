package com.example.atividade5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView txtResultado = new TextView(this);
        txtResultado.setTextSize(22);
        txtResultado.setPadding(20, 200, 20, 20);

        String resposta1 = getIntent().getStringExtra("resposta1");
        String resposta2 = getIntent().getStringExtra("resposta2");

        int acertos = 0;

        if ("B - Brasília".equals(resposta1)) acertos++;
        if ("C - 25".equals(resposta2)) acertos++;

        String resultado;
        switch (acertos) {
            case 2:
                resultado = "Parabéns, você tirou nota 10!";
                break;
            case 1:
                resultado = "Você tirou nota 5.";
                break;
            default:
                resultado = "Você errou as duas questões, sua nota é 0.";
        }

        txtResultado.setText(resultado);
        setContentView(txtResultado);
    }
}
