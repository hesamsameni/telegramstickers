package org.vaya_group.telegram_stickers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

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