package com.example.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.CountDownTimer;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class CustomMainActivity extends AppCompatActivity {

    RadioGroup radioGroupQuestion2,radioGroupQuestion5,radioGroupQuestion9;
    String aswer1,aswer91,aswer92,aswer3,aswer2,kqasw2,aswer5,aswer6,aswer7,kqasw4,kqasw61,kqasw62,kqasw8,kqAsw10;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_main);

        String firstName;
        String lastName;
        TextView tv1 = findViewById(R.id.firstName);
        TextView tv2 = findViewById(R.id.lastName);
        final TextView tvTime = findViewById(R.id.tvTime);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            firstName = bundle.getString("firstName");
            lastName = bundle.getString("lastName");
            tv1.setText("First Name: "+ firstName);
            tv2.setText("Last Name: "+ lastName);
        }

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(5,0, 0, 0);

        aswer1 = getResources().getString(R.string.aswer_quiz1_1);
        aswer2 = getResources().getString(R.string.anwer_quiz1_2);
        // DNA
        aswer3 = getResources().getString(R.string.aswer_quiz1_3);

        // lay cau tra loi cua cau hoi 5

        aswer5 = getResources().getString(R.string.aswer_5_1);
        aswer6 = getResources().getString(R.string.aswer_5_2);
        aswer7 = getResources().getString(R.string.aswer_5_3);


        kqasw2 = getResources().getString(R.string.aswer_2);
        kqasw4 = getResources().getString(R.string.aswer_4);

        // lay noi dung cau tra cua cau 6
        kqasw61 = getResources().getString(R.string.aswer_6_1);
        kqasw62 = getResources().getString(R.string.aswer_6_2);

        TextView view = findViewById(R.id.title);
        view.setText(R.string.quiz_app);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_size));

        TextView quiz1 = findViewById(R.id.quiz1);
        quiz1.setText(R.string.quiz_1);
        quiz1.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));
        quiz1.setLayoutParams(lp);

        radioGroupQuestion2 = findViewById(R.id.radioGroupQuestion2);
        radioGroupQuestion5 = findViewById(R.id.radioGroupQuestion5);

        final RadioButton radioAsw1 = findViewById(R.id.radioButton1);
        radioAsw1.setText(aswer1);
        final RadioButton radioAsw2 = findViewById(R.id.radioButton2);
        radioAsw2.setText(aswer2);
        final RadioButton radioAsw3 = findViewById(R.id.radioButton3);
        radioAsw3.setText(aswer3);

        TextView quiz2 = findViewById(R.id.quiz2);
        quiz2.setText(R.string.quiz_2);
        quiz2.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        TextView quiz3 = findViewById(R.id.quiz3);
        quiz3.setText(R.string.quiz_3);
        quiz3.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));


        checkBox1 = findViewById(R.id.chk1);
        checkBox1.setText(R.string.chk_Ribosome);
        checkBox2 = findViewById(R.id.chk2);
        checkBox2.setText(R.string.chk_Plasimds);
        checkBox3 = findViewById(R.id.chk3);
        checkBox3.setText(R.string.chk_Golgi);
        checkBox4 = findViewById(R.id.chk4);
        checkBox4.setText(R.string.chk_Diploid);

        TextView quiz4 = findViewById(R.id.quiz4);
        quiz4.setText(R.string.quiz_4);
        quiz4.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        TextView quiz5 = findViewById(R.id.quiz5);
        quiz5.setText(R.string.quiz_5);
        quiz5.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // radio asw quiz 5

        RadioButton rd4 = findViewById(R.id.radioButton4);
        rd4.setText(aswer5);
        RadioButton rd5 = findViewById(R.id.radioButton5);
        rd5.setText(aswer6);
        RadioButton rd6 = findViewById(R.id.radioButton6);
        rd6.setText(aswer7);

        TextView quiz6 = findViewById(R.id.quiz6);
        quiz6.setText(R.string.quiz_6);
        quiz6.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // quiz 7
        TextView quiz7 = findViewById(R.id.quiz7);
        quiz7.setText(R.string.quiz_7);
        quiz7.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));
        checkBox5 = findViewById(R.id.chk5);
        checkBox5.setText(R.string.aswer_7_1);
        checkBox6 = findViewById(R.id.chk6);
        checkBox6.setText(R.string.aswer_7_2);
        checkBox7 = findViewById(R.id.chk7);
        checkBox7.setText(R.string.aswer_7_3);
        checkBox8 = findViewById(R.id.chk8);
        checkBox8.setText(R.string.aswer_7_4);

        // quiz 8
        TextView quiz8 = findViewById(R.id.quiz8);
        quiz8.setText(R.string.quiz_8);
        quiz8.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // lay noi dung tra loi cua quiz 8
        kqasw8 = getResources().getString(R.string.aswer_8);

        // quiz 9
        radioGroupQuestion9 = findViewById(R.id.radioGroupQuestion9);
        TextView quiz9 = findViewById(R.id.quiz9);
        quiz9.setText(R.string.quiz_9);
        quiz9.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // lay noi dung tra loi cua quiz 9
        aswer91 = getResources().getString(R.string.aswer_9_1);
        aswer92 = getResources().getString(R.string.aswer_9_2);

        RadioButton rd7 = findViewById(R.id.radioButton7);
        rd7.setText(aswer91);
        RadioButton rd8 = findViewById(R.id.radioButton8);
        rd8.setText(aswer92);

        TextView quiz10 = findViewById(R.id.quiz10);
        quiz10.setText(R.string.quiz_10);
        quiz10.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // lay noi dung tra loi cau quiz 10
        kqAsw10 = getResources().getString(R.string.aswer_10);

        // xu ly khi het thoi gian

        final TextView tScore = findViewById(R.id.score);
        final Button button = findViewById(R.id.button);
        reverseTimer(60,tvTime,button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = scoreCount();
                if(count == 10){
                    String result = "Perfect, You scrored " + count + " out of 10";
                    Toast.makeText(CustomMainActivity.this,result.toString(), Toast.LENGTH_LONG).show();
                }
                else {
                    String result = "Try again, You scrored " + count + " out of 10";
                    Toast.makeText(CustomMainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void reverseTimer(int Seconds, final TextView tv, final Button button){

        new CountDownTimer(Seconds* 1000+1000, 1000) {

            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                tv.setText("TIME : " + String.format("%02d", minutes)
                        + ":" + String.format("%02d", seconds));
            }

            public void onFinish() {
                tv.setText("End Time");
                button.setEnabled(false);
                int count = scoreCount();
                if(count == 10){
                    String result = "Perfect, You scrored " + count + " out of 10";
                    Toast.makeText(CustomMainActivity.this,result.toString(), Toast.LENGTH_LONG).show();
                }
                else {
                    String result = "Try again, You scrored " + count + " out of 10";
                    Toast.makeText(CustomMainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        }.start();
    }
    public int scoreCount(){

        boolean check = false;
        int count = 0;
        // xu ly quiz 1
        RadioButton selectedRadioButton = findViewById(radioGroupQuestion2.getCheckedRadioButtonId());
        String asquestion = selectedRadioButton == null ? "" : selectedRadioButton.getText().toString().trim();
        if(asquestion.equals(aswer3)){
            check = true;
            count++;
        }
        else if(asquestion.equals(aswer2)){
            check = false;
        }
        else if(asquestion.equals(aswer1)){
            check = false;
        }
        // xu ly cau quiz 2
        EditText editText = findViewById(R.id.editQuiz2);
        String edasw2 = editText.getText().toString().trim();

        if(edasw2.equals(kqasw2)){
            check = true;
            count++;
        }
        else{
            check = false;
        }

        // xu ly cau quiz 3
        if(checkBox1.isChecked() && checkBox3.isChecked() && !checkBox2.isChecked() && !checkBox4.isChecked()){
            check = true;
            count++;
        }

        // xu ly cau quiz 4
        EditText editTextQuiz4 = findViewById(R.id.asw4);
        String edasw4 = editTextQuiz4.getText().toString().trim();
        if(edasw4.equals(kqasw4)){
            check = true;
            count++;
        }
        else{
            check = false;
        }
        // xu ly quiz 5

        RadioButton selectedRadioButtonQuiz5 = findViewById(radioGroupQuestion5.getCheckedRadioButtonId());
        String ansquestion5 = selectedRadioButtonQuiz5 == null ? "" : selectedRadioButtonQuiz5.getText().toString();
        if(ansquestion5.equals(aswer5) || ansquestion5.equals(aswer7)){
            check = false;
        }
        else if(ansquestion5.equals(aswer6)){
            check = true;
            count++;
        }
        // xu ly quiz 6
        EditText editQuiz6 = findViewById(R.id.editQuiz6);
        String edasq6 = editQuiz6.getText().toString().trim();
        if(edasq6.equals(kqasw61) || edasq6.equals(kqasw62)){
            check = true;
            count++;
        }else{
            check = false;
        }
        // xu ly cau quiz 7
        if(checkBox7.isChecked() && checkBox8.isChecked() && !checkBox5.isChecked() && !checkBox6.isChecked()){
            check = true;
            count++;
        }
        // xu ly cau quiz 8
        EditText editQuiz8 = findViewById(R.id.editQuiz8);
        String edasq8 = editQuiz8.getText().toString().trim();
        if(edasq8.equals(kqasw8)){
            check = true;
            count++;
        }else{
            check = false;
        }
        // xu ly cau quiz 9
        RadioButton selectedRadioButtonQuiz9 = findViewById(radioGroupQuestion9.getCheckedRadioButtonId());
        String asquestion9 = selectedRadioButtonQuiz9 == null ? "" : selectedRadioButtonQuiz9.getText().toString().trim();
        if(asquestion9.equals(aswer92)){
            check = true;
            count++;
        }
        else if(asquestion9.equals(aswer1)){
            check = false;
        }
        // xu ly cau quiz 10
        EditText editQuiz10 = findViewById(R.id.editQuiz10);
        String edasq10 = editQuiz10.getText().toString().trim();
        if(edasq10.equals(kqAsw10)){
            check = true;
            count++;
        }else{
            check = false;
        }
        return count;
    }
}
