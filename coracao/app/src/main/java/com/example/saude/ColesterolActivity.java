package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class ColesterolActivity extends AppCompatActivity {

    public String resultColesterol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colesterol);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_col = findViewById(R.id.btn_colesterol);

        btn_col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).colesterol=Double.valueOf(resultColesterol);
                Intent it = new Intent(getApplicationContext(), FinishActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });
    }

    public void onClickColesterol(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Colesterol1:
                if (checked) {
                    resultColesterol = String.valueOf(1);
                }
                break;
            case R.id.Colesterol2:
                if (checked) {
                    resultColesterol = String.valueOf(2);
                }
                break;
            case R.id.Colesterol3:
                if (checked) {
                    resultColesterol = String.valueOf(3);
                }
                break;
            case R.id.Colesterol4:
                if (checked) {
                    resultColesterol = String.valueOf(4);
                }
                break;
            case R.id.Colesterol5:
                if (checked) {
                    resultColesterol = String.valueOf(5);
                }
                break;
            case R.id.Colesterol6:
                if (checked) {
                    resultColesterol = String.valueOf(7);
                }
                break;
        }
    }
}