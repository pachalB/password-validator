package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addText(View v){
        EditText etEnterText = (EditText) findViewById(R.id.etEnterText);
        Button btnAddText = (Button) findViewById(R.id.btnAddText);
        TextView helloText = (TextView) findViewById(R.id.helloText);
        helloText.setText(etEnterText.getText().toString());
    }
}
