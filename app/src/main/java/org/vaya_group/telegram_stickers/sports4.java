package org.vaya_group.telegram_stickers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;



public class sports4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports4);


        Button getSticker = (Button) findViewById(R.id.getsticker);
        ImageView stickerImage = (ImageView) findViewById(R.id.stickerImage);


        String imageUrl = "https://www.stickerstelegram.com/wp-content/uploads/2016/06/Screenshot_20160601-14190101-945x1280.png";
        ///___ displaying image from url using PICASSO____////
        Picasso.with(getApplicationContext()).load(imageUrl).placeholder(R.drawable.placeholder).into(stickerImage);
        ////_____HesamSameni____/////
    }


    public void getthesticker(View view) {

        Uri uri = Uri.parse("https://telegram.me/addstickers/Cro_Football"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


    public void nxt(View view) {
        Intent i = new Intent(getApplicationContext(), sports5.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }

    public void pre(View view) {
        Intent i = new Intent(getApplicationContext(), sports3.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);


    }


    public void categories(View view) {
        Intent i = new Intent(getApplicationContext(), categories.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);

    }

}