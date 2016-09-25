package org.vaya_group.telegram_stickers;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class first_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_menu);

        ////___ This is the way to set a custom font to several TextViews ____/////

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");

        Button tv2 = (Button) findViewById(R.id.stickerButton);
        tv2.setTypeface(tf3);
        Button tv3 = (Button) findViewById(R.id.hintButton);
        tv3.setTypeface(tf3);
        Button tv4 = (Button) findViewById(R.id.groupButton);
        tv4.setTypeface(tf3);
        TextView tv5 = (TextView) findViewById(R.id.app_name);
        tv5.setTypeface((tf2));





    }



    public void stickers (View view){
        Intent i = new Intent(getApplicationContext(), categories.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void groups (View view){
        Intent i = new Intent(getApplicationContext(), channels.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }
    public void hints (View view){
        Intent i = new Intent(getApplicationContext(), hints.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }




}


