package com.raswantkoushikpeesapati.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void logInFunction(View v)
    {
        EditText username = findViewById(R.id.usernametext);
        EditText password = findViewById((R.id.passwordtext));

        Log.i("username", username.getText().toString());
        Log.i("password", password.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
