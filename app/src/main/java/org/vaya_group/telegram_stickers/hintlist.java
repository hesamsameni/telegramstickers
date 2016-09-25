package org.vaya_group.telegram_stickers;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sameni on 25/09/2016.
 */
public class hintlist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hintlist);


        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");

        TextView tv2 = (TextView) findViewById(R.id.hintListText);
        tv2.setTypeface(tf2);

        Button a = (Button) findViewById(R.id.h1);
        a.setTypeface(tf3);
        Button a1 = (Button) findViewById(R.id.h2);
        a1.setTypeface(tf3);
        Button a2 = (Button) findViewById(R.id.h3);
        a2.setTypeface(tf3);
        Button a3 = (Button) findViewById(R.id.h4);
        a3.setTypeface(tf3);
        Button a4 = (Button) findViewById(R.id.h5);
        a4.setTypeface(tf3);
        Button a6 = (Button) findViewById(R.id.h6);
        a6.setTypeface(tf3);
        Button a5 = (Button) findViewById(R.id.h7);
        a5.setTypeface(tf3);
        Button a7 = (Button) findViewById(R.id.h8);
        a7.setTypeface(tf3);
        Button a8 = (Button) findViewById(R.id.h9);
        a8.setTypeface(tf3);
        Button a9 = (Button) findViewById(R.id.h10);
        a9.setTypeface(tf3);
        Button b = (Button) findViewById(R.id.h11);
        b.setTypeface(tf3);
        Button b1 = (Button) findViewById(R.id.h12);
        b1.setTypeface(tf3);
        Button b2 = (Button) findViewById(R.id.h13);
        b2.setTypeface(tf3);
        Button b3 = (Button) findViewById(R.id.h14);
        b3.setTypeface(tf3);
        Button b4 = (Button) findViewById(R.id.h15);
        b4.setTypeface(tf3);
        Button b5 = (Button) findViewById(R.id.h16);
        b5.setTypeface(tf3);
        Button b6 = (Button) findViewById(R.id.h17);
        b6.setTypeface(tf3);
        Button b7 = (Button) findViewById(R.id.h18);
        b7.setTypeface(tf3);
        Button b8 = (Button) findViewById(R.id.h19);
        b8.setTypeface(tf3);
        Button b9 = (Button) findViewById(R.id.h20);
        b9.setTypeface(tf3);
        Button c = (Button) findViewById(R.id.menu);
        c.setTypeface(tf3);


    }

    public void hint1 (View view) {
        Intent i = new Intent(getApplicationContext(), hint1.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint2 (View view) {
        Intent i = new Intent(getApplicationContext(), hint2.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint3 (View view) {
        Intent i = new Intent(getApplicationContext(), hint3.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint4 (View view) {
        Intent i = new Intent(getApplicationContext(), hint4.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint5 (View view) {
        Intent i = new Intent(getApplicationContext(), hint5.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint6 (View view) {
        Intent i = new Intent(getApplicationContext(), hint6.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint7 (View view) {
        Intent i = new Intent(getApplicationContext(), hint7.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint8 (View view) {
        Intent i = new Intent(getApplicationContext(), hint8.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint9 (View view) {
        Intent i = new Intent(getApplicationContext(), hint9.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint10 (View view) {
        Intent i = new Intent(getApplicationContext(), hint10.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint11 (View view) {
        Intent i = new Intent(getApplicationContext(), hint11.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint12 (View view) {
        Intent i = new Intent(getApplicationContext(), hint12.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint13 (View view) {
        Intent i = new Intent(getApplicationContext(), hint13.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint14 (View view) {
        Intent i = new Intent(getApplicationContext(), hint14.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint15 (View view) {
        Intent i = new Intent(getApplicationContext(), hint15.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint16 (View view) {
        Intent i = new Intent(getApplicationContext(), hint16.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint17 (View view) {
        Intent i = new Intent(getApplicationContext(), hint17.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint18 (View view) {
        Intent i = new Intent(getApplicationContext(), hint18.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint19 (View view) {
        Intent i = new Intent(getApplicationContext(), hint19.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void hint20 (View view) {
        Intent i = new Intent(getApplicationContext(), hint20.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }


    public void menu (View view){
        Intent i = new Intent(getApplicationContext(), first_menu.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }



}
