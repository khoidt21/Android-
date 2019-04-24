package com.example.myapplication;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        // layout set left top right bottom using view
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(5,0, 0, 0);

       final String aswer1 = getResources().getString(R.string.aswer_quiz1_1);
       final String aswer2 = getResources().getString(R.string.anwer_quiz1_2);
        // DNA
       final String aswer3 = getResources().getString(R.string.aswer_quiz1_3);
       final String kqasw2 = getResources().getString(R.string.aswer_2);
       final String kqasw4 = getResources().getString(R.string.aswer_4);

        TextView view = findViewById(R.id.title);
        view.setText(R.string.quiz_app);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_size));

        TextView quiz1 = findViewById(R.id.quiz1);
        quiz1.setText(R.string.quiz_1);
        quiz1.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));
        quiz1.setLayoutParams(lp);

        final RadioGroup radioGroup = findViewById(R.id.radioGroup);

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


        final CheckBox checkBox1 = findViewById(R.id.chk1);
        checkBox1.setText(R.string.chk_Ribosome);
        final CheckBox checkBox2 = findViewById(R.id.chk2);
        checkBox2.setText(R.string.chk_Plasimds);
        final CheckBox checkBox3 = findViewById(R.id.chk3);
        checkBox3.setText(R.string.chk_Golgi);
        final CheckBox checkBox4 = findViewById(R.id.chk4);
        checkBox4.setText(R.string.chk_Diploid);

        TextView quiz4 = findViewById(R.id.quiz4);
        quiz4.setText(R.string.quiz_4);
        quiz4.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        TextView quiz5 = findViewById(R.id.quiz5);
        quiz5.setText(R.string.quiz_5);
        quiz5.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // radio asw quiz 5

        RadioButton rd4 = findViewById(R.id.radioButton4);
        rd4.setText(R.string.aswer_5_1);
        RadioButton rd5 = findViewById(R.id.radioButton5);
        rd5.setText(R.string.aswer_5_2);
        RadioButton rd6 = findViewById(R.id.radioButton6);
        rd6.setText(R.string.aswer_5_3);

        TextView quiz6 = findViewById(R.id.quiz6);
        quiz6.setText(R.string.quiz_6);
        quiz6.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // quiz 7
        TextView quiz7 = findViewById(R.id.quiz7);
        quiz7.setText(R.string.quiz_7);
        quiz7.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));
        CheckBox checkBox5 = findViewById(R.id.chk5);
        checkBox5.setText(R.string.aswer_7_1);
        CheckBox checkBox6 = findViewById(R.id.chk6);
        checkBox6.setText(R.string.aswer_7_2);
        CheckBox checkBox7 = findViewById(R.id.chk7);
        checkBox7.setText(R.string.aswer_7_3);
        CheckBox checkBox8 = findViewById(R.id.chk8);
        checkBox8.setText(R.string.aswer_7_4);

        // quiz 8
        TextView quiz8 = findViewById(R.id.quiz8);
        quiz8.setText(R.string.quiz_8);
        quiz8.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // quiz 9
        TextView quiz9 = findViewById(R.id.quiz9);
        quiz9.setText(R.string.quiz_9);
        quiz9.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        RadioButton rd7 = findViewById(R.id.radioButton7);
        rd7.setText(R.string.aswer_9_1);
        RadioButton rd8 = findViewById(R.id.radioButton8);
        rd8.setText(R.string.aswer_9_2);
        TextView quiz10 = findViewById(R.id.quiz10);
        quiz10.setText(R.string.quiz_10);
        quiz10.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean check = false;
                int n = 0;

                RadioButton selectedRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                String asquestion = selectedRadioButton == null ? "" : selectedRadioButton.getText().toString().trim();

                if(asquestion.equals(aswer3)){
                        check = true;
                        n++;
                }
                else if(asquestion.equals(aswer2)){
                        check = false;
                }
                else if(asquestion.equals(aswer1)){
                        check = false;
                }
                EditText editText = findViewById(R.id.editQuiz2);
                String edasw2 = editText.getText().toString().trim();

                if(edasw2.equals(kqasw2)){
                    check = true;
                    n++;
                }
                else{
                    check = false;
                }
                if(checkBox1.isChecked() && checkBox3.isChecked()){
                    check = true;
                    n++;
                }
                else{
                    check = false;
                }
                EditText editTextQuiz4 = findViewById(R.id.asw4);
                String edasw4 = editTextQuiz4.getText().toString().trim();
                if(edasw4.equals(kqasw4)){
                    check = true;
                    n++;
                }
                else{
                    check = false;
                }

                    String result = "Try again, You scrored " + n + " out of 10";
                    Toast.makeText(MainActivity.this,result.toString(), Toast.LENGTH_LONG).show();


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
