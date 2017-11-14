package com.example.gbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton radioButton = findViewById(R.id.radioButton2);
        RadioButton radioButton1 = findViewById(R.id.radioButton3);
        RadioButton radioButton2 = findViewById(R.id.radioButton4);
        final TextView textView = findViewById(R.id.textView);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.radioButton2 : {
                        textView.setText("Button 1 selected");
                    }
                    break;
                    case R.id.radioButton3 : {
                        textView.setText("Button 2 selected");
                    }
                    break;
                    case R.id.radioButton4 : {
                        textView.setText("Button 3 selected");
                    }
                }
            }
        });

    }
}