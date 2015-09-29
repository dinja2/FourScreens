package eu.dgrigorenko.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eu.dgrigorenko.twoscreens.R;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
    }

    public void goToThirdScreen(View v){
        Intent goToThirdScreen = new Intent(this, ThirdScreen.class);
        startActivity(goToThirdScreen);
    }

}
