package com.example.kutibari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    /**
     * create a button
     */
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * now create logic for going to login page
         */
        button= (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginpage();
            }
        });

    }

    /**
     * open login activity
     */
    public void openLoginpage(){
        Intent intent= new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}