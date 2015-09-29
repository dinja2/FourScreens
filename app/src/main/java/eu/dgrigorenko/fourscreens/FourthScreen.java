package eu.dgrigorenko.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eu.dgrigorenko.twoscreens.R;

public class FourthScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
    }

    public void goToFirstScreen(View v){
        Intent goToFirstScreen = new Intent(this, FirstScreen.class);
        startActivity(goToFirstScreen);

    }
}
