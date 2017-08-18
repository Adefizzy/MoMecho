package com.example.android.momecho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View.OnClickListener mHomePage = new View.OnClickListener(){
            @Override

            public void onClick(final View view){

                Intent aboutUs = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(aboutUs);
            }

        };
        findViewById(R.id.aboutUS).setOnClickListener(mHomePage);
    }
}
