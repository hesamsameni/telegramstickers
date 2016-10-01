package org.vaya_group.telegram_stickers;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class resourcesofapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resourcesofapp);

        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile_Bold.ttf");

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Y2K Neophyte.ttf");

        TextView tv5 = (TextView) findViewById(R.id.resourceTitle);
        tv5.setTypeface((tf2));

        TextView a = (TextView) findViewById(R.id.resource1);
        a.setTypeface((tf));
        TextView b = (TextView) findViewById(R.id.resource2);
        b.setTypeface((tf));
        TextView c = (TextView) findViewById(R.id.resource3);
        c.setTypeface((tf));
        TextView d = (TextView) findViewById(R.id.resource4);
        d.setTypeface((tf));
    }

}