package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Objects;

public class FamiliaActivity extends AppCompatActivity {

    public String resultFamilia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);
        DataClass data = getIntent().getParcelableExtra("data");

        Button btn_fam = findViewById(R.id.btn_familia);

        btn_fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Objects.requireNonNull(data).familia=Double.valueOf(resultFamilia);
                Intent it = new Intent(getApplicationContext(), ColesterolActivity.class);
                it.putExtra("data", data);
                startActivity(it);
            }
        });

    }

    public void onClickFml(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.Fml1:
                if (checked) {
                    resultFamilia = String.valueOf(1);
                }
                break;
            case R.id.Fml2:
                if (checked) {
                    resultFamilia = String.valueOf(2);
                }
                break;
            case R.id.Fml3:
                if (checked) {
                    resultFamilia = String.valueOf(3);
                }
                break;
            case R.id.Fml4:
                if (checked) {
                    resultFamilia = String.valueOf(4);
                }
                break;
            case R.id.Fml5:
                if (checked) {
                    resultFamilia = String.valueOf(6);
                }
                break;
            case R.id.Fml6:
                if (checked) {
                    resultFamilia = String.valueOf(7);
                }
                break;
        }
    }
}