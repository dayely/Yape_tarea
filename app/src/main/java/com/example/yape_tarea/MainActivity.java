package com.example.yape_tarea;
import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.idboton1);
        btn2 = findViewById(R.id.idboton2);
        btn3 = findViewById(R.id.idboton3);
        btn4 = findViewById(R.id.idboton4);
        btn5 = findViewById(R.id.idboton5);
        btn6 = findViewById(R.id.idboton6);
        btn7 = findViewById(R.id.idboton7);
        btn8 = findViewById(R.id.idboton8);
        btn9 = findViewById(R.id.idboton9);
        btn10 = findViewById(R.id.idboton10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("9");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje("0");
            }
        });
    }
        public void mensaje(String msg){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Confirmacion");
            alert.setMessage(msg);
            alert.show();

    }
}