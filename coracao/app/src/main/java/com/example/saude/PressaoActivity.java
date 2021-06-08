package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class PressaoActivity extends AppCompatActivity {

    public String resultPressao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressao);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_pres = findViewById(R.id.btn_pressao);

        btn_pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).pressao=Double.valueOf(resultPressao);
                Intent it = new Intent(getApplicationContext(), FamiliaActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });
    }

    public void onClickPressao(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Pressao1:
                if (checked) {
                    resultPressao = String.valueOf(1);
                }
                break;
            case R.id.Pressao2:
                if (checked) {
                    resultPressao = String.valueOf(2);
                }
                break;
            case R.id.Pressao3:
                if (checked) {
                    resultPressao = String.valueOf(3);
                }
                break;
            case R.id.Pressao4:
                if (checked) {
                    resultPressao = String.valueOf(4);
                }
                break;
            case R.id.Pressao5:
                if (checked) {
                    resultPressao = String.valueOf(6);
                }
                break;
            case R.id.Pressao6:
                if (checked) {
                    resultPressao = String.valueOf(8);
                }
                break;
        }
    }
}