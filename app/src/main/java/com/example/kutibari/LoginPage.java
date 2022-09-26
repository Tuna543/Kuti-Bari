package com.example.kutibari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        /**
         * login page work
         */
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn= (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(LoginPage.this, "Login Successful",Toast.LENGTH_SHORT).show();
                }
                else{
                    //incorrect password
                    Toast.makeText(LoginPage.this, "You've provided wrong information", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView forgotpass = (TextView) findViewById(R.id.forgotpass);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openforgotpass();
                username.setText("");
                password.setText("");
            }

        });
    }

    /**
     * go to forget password page
     */
    public void openforgotpass(){

        Intent intent = new Intent(this, ForgetPassword.class);
        startActivity(intent);
    }
}