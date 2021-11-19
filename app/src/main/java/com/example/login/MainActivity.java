package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        Button log = findViewById(R.id.loginbtn);



        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = user.getText().toString().trim();
                String Password = pass.getText().toString().trim();
               if(Username.isEmpty()){
                   user.setError("Enter username!");
                   user.requestFocus();
                   return;
               }
               if(Password.isEmpty()){
                   pass.setError("Enter password!");
                   pass.requestFocus();
                   return;
               }
               if(Username.equals(Password)){
                   Toast.makeText(MainActivity.this , "Login Successful!" , Toast.LENGTH_LONG).show();
               }
               if(!Username.equals(Password)){
                   Toast.makeText(MainActivity.this , "Login failed, Try Again!" , Toast.LENGTH_LONG).show();
               }
            }
        });
    }
}