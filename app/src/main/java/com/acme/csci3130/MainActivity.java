package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import java.lang.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int verifyPassword(String x){

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


        return count;
    }
}
