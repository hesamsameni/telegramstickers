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

public class channels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.channels);

        ////___ This is the way to set a custom font to several TextViews ____/////

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");


        Button tv2 = (Button) findViewById(R.id.khareji);
        tv2.setTypeface(tf3);
        Button tv3 = (Button) findViewById(R.id.irani);
        tv3.setTypeface(tf3);





    }



    public void khareji (View view){
        Intent i = new Intent(getApplicationContext(), channelsF.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void irani (View view){
        Intent i = new Intent(getApplicationContext(), channelsI.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

    public void menu (View view){
        Intent i = new Intent(getApplicationContext(), first_menu.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }





}


