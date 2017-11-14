package com.example.gbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButton2 : {
                        textView.setText("Option 1 selected");
                        Toast.makeText(MainActivity.this, "Computer Science", Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.radioButton3 : {
                        textView.setText("Option 2 selected");
                        Toast.makeText(MainActivity.this, "BMS", Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.radioButton4 : {
                        textView.setText("Option 3 selected");
                        Toast.makeText(MainActivity.this, "BBS", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}