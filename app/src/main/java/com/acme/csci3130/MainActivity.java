package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;

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

        return count;
    }
}
