package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class SexoActivity extends AppCompatActivity {

    public String resultSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexo);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_sexo = findViewById(R.id.btn_sexo);

        btn_sexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).sexo=Double.valueOf(resultSexo);
                Intent it = new Intent(getApplicationContext(), PesoActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void onClickSexo(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Sexo1:
                if (checked) {
                    resultSexo = String.valueOf(1);
                }
                break;
            case R.id.Sexo2:
                if (checked) {
                    resultSexo = String.valueOf(2);
                }
                break;
            case R.id.Sexo3:
                if (checked) {
                    resultSexo = String.valueOf(3);
                }
                break;
            case R.id.Sexo4:
                if (checked) {
                    resultSexo = String.valueOf(4);
                }
                break;
            case R.id.Sexo5:
                if (checked) {
                    resultSexo = String.valueOf(6);
                }
                break;
            case R.id.Sexo6:
                if (checked) {
                    resultSexo = String.valueOf(7);
                }
                break;
        }
    }
}