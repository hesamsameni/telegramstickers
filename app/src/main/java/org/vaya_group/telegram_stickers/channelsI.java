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

public class channelsI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.channelsi);
    }


    public void varzesh3 (View view){

        Uri uri = Uri.parse("https://telegram.me/varzesh3_channel"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


    public void khabarefori (View view){

        Uri uri = Uri.parse("https://telegram.me/akhbarefori"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



    public void khoroosjangi (View view){

        Uri uri = Uri.parse("https://telegram.me/Khooroosjangi"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void bedandid (View view){

        Uri uri = Uri.parse("https://telegram.me/bedandid"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void gizmiz (View view){

        Uri uri = Uri.parse("https://telegram.me/gizmiztel"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void jokefarsi (View view){

        Uri uri = Uri.parse("https://telegram.me/jokefarsiii"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void alvandmusic (View view){

        Uri uri = Uri.parse("https://telegram.me/alvandmusic"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void yjc (View view){

        Uri uri = Uri.parse("https://telegram.me/yjcnewschannel"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void pandaneh (View view){

        Uri uri = Uri.parse("https://telegram.me/pandaane"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void axojoke (View view){

        Uri uri = Uri.parse("https://telegram.me/aksojok"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void ajibvalivaghei (View view){

        Uri uri = Uri.parse("https://telegram.me/Ajibvalivaghaei"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void dirindirin (View view){

        Uri uri = Uri.parse("https://telegram.me/dirindirin"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void coffeegram (View view){

        Uri uri = Uri.parse("https://telegram.me/coffeegram"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void drsalamat (View view){

        Uri uri = Uri.parse("https://telegram.me/DrSalamatXXX"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void lezateashpazi (View view){

        Uri uri = Uri.parse("https://telegram.me/Lezat_ashpazi"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void farsna (View view){

        Uri uri = Uri.parse("https://telegram.me/farsna"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void channel90 (View view){

        Uri uri = Uri.parse("https://telegram.me/TVnavad"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void eslahatnews (View view){

        Uri uri = Uri.parse("https://telegram.me/eslahatnews"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void donyayeashpazi (View view){

        Uri uri = Uri.parse("https://telegram.me/tchef"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void isna (View view){

        Uri uri = Uri.parse("https://telegram.me/isna94"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void golagha (View view){

        Uri uri = Uri.parse("https://telegram.me/GOLAGHA"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void rajanews (View view){

        Uri uri = Uri.parse("https://telegram.me/rajanews_com"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void khandevaneh (View view){

        Uri uri = Uri.parse("https://telegram.me/kandevane"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void digiato (View view){

        Uri uri = Uri.parse("https://telegram.me/digiato_official"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void varzesh (View view){

        Uri uri = Uri.parse("https://telegram.me/VarzeshtvIRIB"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }





    public void goback (View view){
        Intent i = new Intent(getApplicationContext(), channels.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
    }
}