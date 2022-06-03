package com.example.appcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jogar = findViewById(R.id.btn_jogar);
        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = new Random().nextInt(2);
                Intent intent = new Intent (MainActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });

    }
}