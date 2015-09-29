package eu.dgrigorenko.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eu.dgrigorenko.twoscreens.R;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void goToSecondScreen(View v){
        Intent goSecondIntent = new Intent(this, SecondScreen.class);
        startActivity(goSecondIntent);

    }
}
