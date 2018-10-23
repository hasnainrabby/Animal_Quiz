package com.antor.aspire.animal_quiz;

//Hasnain Rabby batch20  Date:18/10/2018
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class Splash_Activity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                splash();
            }
        }, 1000);
        }
public void splash(){
        setContentView(R.layout.splashscreen);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash_Activity.this,MainActivity.class);
               startActivity(intent);
              finish();
            }
        },2000);
}
}






