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
public class hints extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hints);

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");


        Button tv2 = (Button) findViewById(R.id.hintListButton);
        tv2.setTypeface(tf3);
        Button tv3 = (Button) findViewById(R.id.menu);
        tv3.setTypeface(tf3);

        TextView tv5 = (TextView) findViewById(R.id.hints);
        tv5.setTypeface((tf2));


    }

    public void hintList (View view){
        Intent i = new Intent(getApplicationContext(), hintlist.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }


    public void menu (View view){
        Intent i = new Intent(getApplicationContext(), first_menu.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }



}
