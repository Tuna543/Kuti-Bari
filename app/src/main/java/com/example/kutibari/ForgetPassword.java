package com.example.kutibari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        /**
         * forgot pass page work
         */

        TextView mobile = (TextView) findViewById(R.id.mobile);
        MaterialButton confirm = (MaterialButton) findViewById(R.id.confirm_button);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mobile.getText().toString().matches("")){
                    /**
                     * not empty
                     */
                    Toast.makeText(ForgetPassword.this, "We've sent you a code", Toast.LENGTH_SHORT).show();
                    openVerification();
                    mobile.setText("");
                }
                else{
                    /**
                     * empty
                     */
                    Toast.makeText(ForgetPassword.this, "Please provide your phone number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openVerification(){
        Intent intent = new Intent(this, VerificationPage.class);
        startActivity(intent);
    }
}