package org.vaya_group.telegram_stickers;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Sameni on 30/09/2016.
 */
public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String hesamsameni = "hesamsameni" ;

    @Override
    public void onTokenRefresh() {
        String recent_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(hesamsameni,recent_token);

    }
}

