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

public class channelsF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.channelsf);
    }


    public void boaringclass (View view){

        Uri uri = Uri.parse("https://telegram.me/boringclass"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


    public void likeyoubro (View view){

    Uri uri = Uri.parse("https://telegram.me/updateee"); // missing 'http://' will cause crashed
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
}



    public void stickerchannel (View view){

        Uri uri = Uri.parse("https://telegram.me/stickerschannel"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void gifchannel (View view){

        Uri uri = Uri.parse("https://telegram.me/gifschannel"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void musicalbum (View view){

        Uri uri = Uri.parse("https://telegram.me/fullalbums"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void programmerjokes (View view){

        Uri uri = Uri.parse("https://telegram.me/programmerjokes"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void commonmistakes (View view){

        Uri uri = Uri.parse("https://telegram.me/common_mistakes"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void crynet (View view){

        Uri uri = Uri.parse("https://telegram.me/crynet"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void tvshare (View view){

        Uri uri = Uri.parse("https://telegram.me/thetvshare"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void sickmind (View view){

        Uri uri = Uri.parse("https://telegram.me/SickMindsMedia"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void moviehd (View view){

        Uri uri = Uri.parse("https://telegram.me/moviehdchannel"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void sickosadism (View view){

        Uri uri = Uri.parse("https://telegram.me/Sickosadism"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void goback (View view){
        Intent i = new Intent(getApplicationContext(), channels.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }
}