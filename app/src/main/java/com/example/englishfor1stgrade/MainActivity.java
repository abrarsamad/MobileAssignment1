package com.example.englishfor1stgrade;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setContentView(R.layout.activity_main);

        Button saveButton = findViewById(R.id.save);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String answer1 = answerTextView1.getText().toString(); this should be the answers corrected
               // String answer2 = answerTextView2.getText().toString();
                // Add more answer variables if needed

              //  Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               // intent.putExtra("answer1", answer1);
                //intent.putExtra("answer2", answer2);
                // Add more answers to the intent if needed

             //   startActivity(intent);
            }
        });

        RadioButton radioButton1 = findViewById(R.id.radio_button_1);
        RadioButton radioButton2 = findViewById(R.id.radio_button_2);
        RadioButton radioButton3 = findViewById(R.id.radio_button_3);
        RadioButton radioButton4 = findViewById(R.id.radio_button_4);
        RadioButton radioButton5 = findViewById(R.id.radio_button_5);
        RadioButton radioButton6 = findViewById(R.id.radio_button_6);
        RadioButton radioButton7 = findViewById(R.id.radio_button_7);
        RadioButton radioButton8 = findViewById(R.id.radio_button_8);
        RadioButton radioButton9 = findViewById(R.id.radio_button_9);
        RadioButton radioButton10 = findViewById(R.id.radio_button_10);
        RadioButton radioButton11 = findViewById(R.id.radio_button_11);
        RadioButton radioButton12 = findViewById(R.id.radio_button_12);
        RadioButton radioButton13 = findViewById(R.id.radio_button_13);
        RadioButton radioButton14 = findViewById(R.id.radio_button_14);
        RadioButton radioButton15 = findViewById(R.id.radio_button_15);
        RadioButton radioButton16 = findViewById(R.id.radio_button_16);
        RadioButton radioButton17 = findViewById(R.id.radio_button_17);
        RadioButton radioButton18 = findViewById(R.id.radio_button_18);
        RadioButton radioButton19 = findViewById(R.id.radio_button_19);
        RadioButton radioButton20 = findViewById(R.id.radio_button_20);
        RadioButton radioButton21 = findViewById(R.id.radio_button_21);
        RadioButton radioButton22 = findViewById(R.id.radio_button_22);
        RadioButton radioButton23 = findViewById(R.id.radio_button_23);
        RadioButton radioButton24 = findViewById(R.id.radio_button_24);
        RadioButton radioButton25 = findViewById(R.id.radio_button_25);
        RadioButton radioButton26 = findViewById(R.id.radio_button_26);
        RadioButton radioButton27 = findViewById(R.id.radio_button_27);
        RadioButton radioButton28 = findViewById(R.id.radio_button_28);
        RadioButton radioButton29 = findViewById(R.id.radio_button_29);
        RadioButton radioButton30 = findViewById(R.id.radio_button_30);
        RadioButton radioButton31 = findViewById(R.id.radio_button_31);
        RadioButton radioButton32 = findViewById(R.id.radio_button_32);

        TextView answerTextView1 = findViewById(R.id.answer_textview1);
        TextView answerTextView2 = findViewById(R.id.answer_textview2);
        TextView answerTextView3 = findViewById(R.id.answer_textview3);
        TextView answerTextView4 = findViewById(R.id.answer_textview4);
        TextView answerTextView5 = findViewById(R.id.answer_textview5);
        TextView answerTextView6 = findViewById(R.id.answer_textview6);
        TextView answerTextView7 = findViewById(R.id.answer_textview7);
        TextView answerTextView8 = findViewById(R.id.answer_textview8);

        radioButton1.setOnCheckedChangeListener(answerChecker(answerTextView1, true, radioButton2, radioButton3, radioButton4));
        radioButton2.setOnCheckedChangeListener(answerChecker(answerTextView1, false, radioButton1, radioButton3, radioButton4));
        radioButton3.setOnCheckedChangeListener(answerChecker(answerTextView1, false, radioButton1, radioButton2, radioButton4));
        radioButton4.setOnCheckedChangeListener(answerChecker(answerTextView1, false, radioButton1, radioButton2, radioButton3));
        radioButton5.setOnCheckedChangeListener(answerChecker(answerTextView2, false, radioButton6, radioButton7, radioButton8));
        radioButton6.setOnCheckedChangeListener(answerChecker(answerTextView2, true, radioButton5, radioButton7, radioButton8));
        radioButton7.setOnCheckedChangeListener(answerChecker(answerTextView2, false, radioButton5, radioButton6, radioButton8));
        radioButton8.setOnCheckedChangeListener(answerChecker(answerTextView2, false, radioButton5, radioButton6, radioButton7));
        radioButton9.setOnCheckedChangeListener(answerChecker(answerTextView3, false, radioButton10, radioButton11, radioButton12));
        radioButton10.setOnCheckedChangeListener(answerChecker(answerTextView3, false, radioButton9, radioButton11, radioButton12));
        radioButton11.setOnCheckedChangeListener(answerChecker(answerTextView3, true, radioButton9, radioButton10, radioButton12));
        radioButton12.setOnCheckedChangeListener(answerChecker(answerTextView3, false, radioButton9, radioButton10, radioButton11));
        radioButton13.setOnCheckedChangeListener(answerChecker(answerTextView4, false, radioButton14, radioButton15, radioButton16));
        radioButton14.setOnCheckedChangeListener(answerChecker(answerTextView4, false, radioButton13, radioButton15, radioButton16));
        radioButton15.setOnCheckedChangeListener(answerChecker(answerTextView4, false, radioButton13, radioButton14, radioButton16));
        radioButton16.setOnCheckedChangeListener(answerChecker(answerTextView4, true, radioButton13, radioButton14, radioButton15));
        radioButton17.setOnCheckedChangeListener(answerChecker(answerTextView5, false, radioButton18, radioButton19, radioButton20));
        radioButton18.setOnCheckedChangeListener(answerChecker(answerTextView5, true, radioButton17, radioButton19, radioButton20));
        radioButton19.setOnCheckedChangeListener(answerChecker(answerTextView5, false, radioButton17, radioButton18, radioButton20));
        radioButton20.setOnCheckedChangeListener(answerChecker(answerTextView5, false, radioButton17, radioButton18, radioButton19));
        radioButton21.setOnCheckedChangeListener(answerChecker(answerTextView6, false, radioButton22, radioButton23, radioButton24));
        radioButton22.setOnCheckedChangeListener(answerChecker(answerTextView6, false, radioButton21, radioButton23, radioButton24));
        radioButton23.setOnCheckedChangeListener(answerChecker(answerTextView6, false, radioButton21, radioButton22, radioButton24));
        radioButton24.setOnCheckedChangeListener(answerChecker(answerTextView6, true, radioButton21, radioButton22, radioButton23));
        radioButton25.setOnCheckedChangeListener(answerChecker(answerTextView7, false, radioButton26, radioButton27, radioButton28));
        radioButton26.setOnCheckedChangeListener(answerChecker(answerTextView7, false, radioButton25, radioButton27, radioButton28));
        radioButton27.setOnCheckedChangeListener(answerChecker(answerTextView7, true, radioButton25, radioButton26, radioButton28));
        radioButton28.setOnCheckedChangeListener(answerChecker(answerTextView7, false, radioButton25, radioButton26, radioButton27));
        radioButton29.setOnCheckedChangeListener(answerChecker(answerTextView8, true, radioButton30, radioButton31, radioButton32));
        radioButton30.setOnCheckedChangeListener(answerChecker(answerTextView8, false, radioButton29, radioButton31, radioButton32));
        radioButton31.setOnCheckedChangeListener(answerChecker(answerTextView8, false, radioButton29, radioButton30, radioButton32));
        radioButton32.setOnCheckedChangeListener(answerChecker(answerTextView8, false, radioButton29, radioButton30, radioButton31));
    }

    private CompoundButton.OnCheckedChangeListener answerChecker(TextView answerTextView, boolean isCorrect, RadioButton... radioButtons) {
        return new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    answerTextView.setText(isCorrect ? "Correct answer" : "Wrong answer");
                    for (RadioButton radioButton : radioButtons) {
                        radioButton.setChecked(false);
                    }
                }
            }
        };
    }
}
