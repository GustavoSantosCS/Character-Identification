package com.example.character_identification;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private PaintView paintView;
    private ImageView image;
    private Button btnProcessar;
    private Button btnLimpar;
    private TextView previsao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.rederizado);
        paintView = (PaintView) findViewById(R.id.paintView);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnProcessar = findViewById(R.id.btnProcessar);
        previsao = findViewById(R.id.previsao);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
        initListeners();
    }

    private void initListeners() {
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintView.limpar();
            }
        });

        btnProcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintView.processar(image, previsao);
            }
        });
    }

}