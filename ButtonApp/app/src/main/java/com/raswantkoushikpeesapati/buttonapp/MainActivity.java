package com.raswantkoushikpeesapati.buttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickerFun(View view) // declaring a function with View library.
    {
        EditText text = findViewById(R.id.enteryournametext); // using Editext to create a var and assigning plaintext id to that var)

        Log.i("Info", text.getText().toString()); // using Log library to get the information of the user to the log.

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
