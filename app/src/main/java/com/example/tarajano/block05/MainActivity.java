package com.example.tarajano.block05;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("BGCOLOR_PREF", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();


        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//        RadioButton radioButtonRed = (RadioButton) findViewById(R.id.radioButtonRed);
//        RadioButton radioButtonBlue = (RadioButton) findViewById(R.id.radioButtonBlue);
//        RadioButton radioButtonGreen = (RadioButton) findViewById(R.id.radioButtonGreen);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                int colorCode = 0;
                switch (checkedId) {
                    case R.id.radioButtonBlue:
                        colorCode = Color.BLUE;
                        break;
                    case R.id.radioButtonGreen:
                        colorCode = Color.GREEN;
                        break;
                    case R.id.radioButtonRed:
                        colorCode = Color.RED;
                        break;

                }
                relativeLayout.setBackgroundColor(colorCode);
            }
        });

        relativeLayout.setOnClickListener(new RelativeLayout.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.WHITE);
//                RadioButton radioButton = (RadioButton) findViewById ( radioGroup.getCheckedRadioButtonId() );
//                Log.e("selected button: ", radioButton.toString());
//                radioButton.setSelected(false);
            }
        });

    }
}
