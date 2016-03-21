package com.joaonogueira.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        final Button buttonOne = (Button) findViewById(R.id.buttonAppOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                ButtonToast(buttonOne);
            }
        });

        final Button buttonTwo = (Button) findViewById(R.id.buttonAppTwo);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                ButtonToast(buttonTwo);
            }
        });

        final Button buttonThree = (Button) findViewById(R.id.buttonAppThree);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                ButtonToast(buttonThree);
            }
        });

        final Button buttonFour = (Button) findViewById(R.id.buttonAppFour);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ButtonToast(buttonFour);
            }
        });

        final Button buttonFive = (Button) findViewById(R.id.buttonAppFive);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                ButtonToast(buttonFive);
            }
        });

        final Button buttonSix = (Button) findViewById(R.id.buttonAppSix);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                ButtonToast(buttonSix);
            }
        });
    }
    //Make the toast message
    private void ButtonToast(Button buttonName){
        Context context = getApplicationContext();
        String text = buttonName.getText().toString();;
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }



}


