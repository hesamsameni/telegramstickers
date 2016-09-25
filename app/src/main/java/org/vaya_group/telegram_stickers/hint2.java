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
public class hint2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint2);

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");

        TextView tv2 = (TextView) findViewById(R.id.hintcontext2);
        tv2.setTypeface(tf3);
        TextView tv = (TextView) findViewById(R.id.hinttitle2);
        tv.setTypeface(tf2);

    }

    public void returnToHints (View view) {
        Intent i = new Intent(getApplicationContext(), hintlist.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }

}