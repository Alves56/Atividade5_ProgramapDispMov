package com.example.atividade5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1, radioGroup2;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnFinalizar.setOnClickListener(view -> {
            int resposta1Id = radioGroup1.getCheckedRadioButtonId();
            int resposta2Id = radioGroup2.getCheckedRadioButtonId();

            String resposta1 = "";
            String resposta2 = "";

            if (resposta1Id != -1) {
                RadioButton rb1 = findViewById(resposta1Id);
                resposta1 = rb1.getText().toString();
            }

            if (resposta2Id != -1) {
                RadioButton rb2 = findViewById(resposta2Id);
                resposta2 = rb2.getText().toString();
            }

            Intent intent = new Intent(MainActivity.this, Resultado.class);
            intent.putExtra("resposta1", resposta1);
            intent.putExtra("resposta2", resposta2);
            startActivity(intent);
        });
    }
}
