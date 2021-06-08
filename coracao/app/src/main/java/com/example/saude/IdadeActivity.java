package com.example.saude;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class IdadeActivity extends AppCompatActivity {

    public String resultIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idade);

        Button btn_idade = findViewById(R.id.btn_idade);

    btn_idade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            DataClass data = new DataClass();
            data.idade=Double.valueOf(resultIdade);
            Intent it = new Intent(getApplicationContext(), SexoActivity.class);
            it.putExtra("data", data);
            startActivity(it);
        }
    });
    }

    public void onClickIdade(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.Idade1:
                if(checked) {
                    resultIdade = String.valueOf(1);
                }
            break;
            case R.id.Idade2:
                if(checked) {
                    resultIdade = String.valueOf(2);
                }
            break;
            case R.id.Idade3:
                if(checked) {
                    resultIdade = String.valueOf(3);
                }
            break;
            case R.id.Idade4:
                if(checked) {
                    resultIdade = String.valueOf(4);
                }
            break;
            case R.id.Idade5:
                if(checked) {
                    resultIdade = String.valueOf(6);
                }
            break;
            case R.id.Idade6:
                if(checked) {
                    resultIdade = String.valueOf(8);
                }
            break;
        }
    }
}