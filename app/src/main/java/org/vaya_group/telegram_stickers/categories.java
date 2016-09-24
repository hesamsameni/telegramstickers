package org.vaya_group.telegram_stickers;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);


        ////___ This is the way to set a custom font to several TextViews ____/////

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");

        Button tv = (Button) findViewById(R.id.animals);
        tv.setTypeface(tf3);
        Button tv1 = (Button) findViewById(R.id.love);
        tv1.setTypeface(tf3);
        Button tv2 = (Button) findViewById(R.id.movies);
        tv2.setTypeface(tf3);
        Button tv3 = (Button) findViewById(R.id.sports);
        tv3.setTypeface(tf3);
        Button tv4 = (Button) findViewById(R.id.cartoons);
        tv4.setTypeface(tf3);
        Button tv5 = (Button) findViewById(R.id.videogames);
        tv5.setTypeface(tf3);
        Button tv6 = (Button) findViewById(R.id.other);
        tv6.setTypeface(tf3);

    }

    public void animals (View view){

        Intent i = new Intent(getApplicationContext(), animals.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void love (View view){

        Intent i = new Intent(getApplicationContext(), love.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void movies (View view){

        Intent i = new Intent(getApplicationContext(), movies.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void sports (View view){

        Intent i = new Intent(getApplicationContext(), sports.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void cartoons (View view){

        Intent i = new Intent(getApplicationContext(), cartoons.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void videogames (View view){

        Intent i = new Intent(getApplicationContext(), videogames.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void others (View view){

        Intent i = new Intent(getApplicationContext(), others.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }

}