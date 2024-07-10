package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTecnico = findViewById(R.id.btnTecnico);
        btnTecnico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tecnico = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(tecnico);
            }
        });
        Button btnLinguagens = findViewById(R.id.btnLinguagens);
        btnLinguagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tecnico = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(tecnico);
            }
        });
        Button btnCN = findViewById(R.id.btnCN);
        btnLinguagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CN = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(CN);
            }
        });
        Button btnMat = findViewById(R.id.btnMat);
        btnMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mat = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(Mat);
            }
        });
        Button btnPP = findViewById(R.id.btnPP);
        btnPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PP = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(PP);
            }
        });
        Button btnPV = findViewById(R.id.btnPV);
        btnPV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PV = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(PV);
            }
        });
        Button btnCH = findViewById(R.id.btnCH);
        btnCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CH = new Intent( getApplicationContext(), TecnicoActivity.class);
                startActivity(CH);
            }
        });
    }

}