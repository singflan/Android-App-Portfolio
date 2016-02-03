package com.example.dustinflanary.myappportfolio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user touches the button
    public void sendMessage(View view) {
            Button button = (Button)view;
            Toast.makeText(this, "This button will launch the " + button.getText(), Toast.LENGTH_SHORT).show();

    }




}

