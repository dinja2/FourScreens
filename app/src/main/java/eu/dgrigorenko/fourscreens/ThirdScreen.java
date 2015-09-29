package eu.dgrigorenko.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eu.dgrigorenko.twoscreens.R;

public class ThirdScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
    }

    public void goToFourthScreen(View v){
        Intent goToFourthScreen = new Intent(this, FourthScreen.class);
        startActivity(goToFourthScreen);

    }
}
