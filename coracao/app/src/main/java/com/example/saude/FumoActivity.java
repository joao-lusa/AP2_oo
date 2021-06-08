package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class FumoActivity extends AppCompatActivity {

    public String resultFumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fumo);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_fumo = findViewById(R.id.btn_fumo);

        btn_fumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).fumo=Double.valueOf(resultFumo);
                Intent it = new Intent(getApplicationContext(), PressaoActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });
    }

    public void onClickFumo(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Fumo1:
                if (checked) {
                    resultFumo = String.valueOf(0);
                }
                break;
            case R.id.Fumo2:
                if (checked) {
                    resultFumo = String.valueOf(1);
                }
                break;
            case R.id.Fumo3:
                if (checked) {
                    resultFumo = String.valueOf(2);
                }
                break;
            case R.id.Fumo4:
                if (checked) {
                    resultFumo = String.valueOf(4);
                }
                break;
            case R.id.Fumo5:
                if (checked) {
                    resultFumo = String.valueOf(6);
                }
                break;
            case R.id.Fumo6:
                if (checked) {
                    resultFumo = String.valueOf(10);
                }
                break;
        }
    }
}