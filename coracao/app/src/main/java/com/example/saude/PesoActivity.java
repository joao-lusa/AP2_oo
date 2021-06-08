package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class PesoActivity extends AppCompatActivity {

    public String resultPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_peso = findViewById(R.id.btn_peso);

        btn_peso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).peso=Double.valueOf(resultPeso);
                Intent it = new Intent(getApplicationContext(), AtividadeActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });
    }


    public void onClickPeso(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Peso1:
                if (checked) {
                    resultPeso = String.valueOf(0);
                }
                break;
            case R.id.Peso2:
                if (checked) {
                    resultPeso = String.valueOf(1);
                }
                break;
            case R.id.Peso3:
                if (checked) {
                    resultPeso = String.valueOf(2);
                }
                break;
            case R.id.Peso4:
                if (checked) {
                    resultPeso = String.valueOf(3);
                }
                break;
            case R.id.Peso5:
                if (checked) {
                    resultPeso = String.valueOf(5);
                }
                break;
            case R.id.Peso6:
                if (checked) {
                    resultPeso = String.valueOf(7);
                }
                break;
        }
    }
}