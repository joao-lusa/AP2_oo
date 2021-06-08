package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class AtividadeActivity extends AppCompatActivity {

    public String resultAtividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_act = findViewById(R.id.btn_act);

        btn_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).atividade=Double.valueOf(resultAtividade);
                Intent it = new Intent(getApplicationContext(), FumoActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });

    }

    public void onClickAtividade(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Atividade1:
                if (checked) {
                    resultAtividade = String.valueOf(1);
                }
            break;
            case R.id.Atividade2:
                if (checked) {
                    resultAtividade = String.valueOf(2);
                }
            break;
            case R.id.Atividade3:
                if (checked) {
                    resultAtividade = String.valueOf(3);
                }
            break;
            case R.id.Atividade4:
                if (checked) {
                    resultAtividade = String.valueOf(5);
                }
                break;
            case R.id.Atividade5:
                if (checked) {
                    resultAtividade = String.valueOf(6);
                }
            break;
            case R.id.Atividade6:
                if (checked) {
                    resultAtividade = String.valueOf(8);
                }
            break;
        }
    }
}