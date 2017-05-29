package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import java.lang.*;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity {

    Button btnEnter;
    TextView tvAnswer;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enter = (Button) findViewById(R.id.btnEnter);
        enter.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                verifyPassword(v);
            }
        });
    }

    public void verifyPassword(View v){
        TextView answer = (TextView) findViewById(R.id.tvAnswer);
        EditText password = (EditText) findViewById(R.id.etPassword);
        String x = password.getText().toString();

        answer.setText("");
        int count = 0;

        if (!x.equals("password")){
            count++;
        }
        if (x.length()>=8){
            count ++;
        }
        //check for a digit
        if (x.matches(".*\\d.*")){
            count ++;
        }
        //check for upper and lower case
        if (x.matches("^.*[A-Z]*[a-z].*")){
            count ++;
        }
        //cant end in 123
        if (!x.matches(".*(123)$")){
            count ++;
        }

        if (count==5){
            answer.setText("Password is good");
        }
        else{
            answer.setText("Password is weak");
        }
    }
}
