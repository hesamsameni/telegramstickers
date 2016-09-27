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

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        ////___ This is the way to set a custom font to several TextViews ____/////

        Typeface tf3 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Light.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");

        Button tv2 = (Button) findViewById(R.id.mailus);
        tv2.setTypeface(tf3);
        Button tv3 = (Button) findViewById(R.id.telegramus);
        tv3.setTypeface(tf3);
        Button tv1 = (Button) findViewById(R.id.returnToHints);
        tv1.setTypeface(tf3);
        TextView tv5 = (TextView) findViewById(R.id.contactusText);
        tv5.setTypeface((tf2));
    }

    public void mailus (View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"vaya.deco@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "From TelegramVaya app");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void telegramus (View view){

        Uri uri = Uri.parse("https://telegram.me/hesamsameni2"); // missing 'http://' will cause crashed
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void returnToHints (View view) {
        Intent i = new Intent(getApplicationContext(), first_menu.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }


}