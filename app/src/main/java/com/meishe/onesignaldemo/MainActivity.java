package com.meishe.onesignaldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.onesignal.OSNotificationOpenedResult;
import com.onesignal.OneSignal;

import org.json.JSONException;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OneSignal.setNotificationOpenedHandler(
                new OneSignal.OSNotificationOpenedHandler() {
                    @Override
                    public void notificationOpened(OSNotificationOpenedResult result) {
                        // Capture Launch URL (App URL) here
//                        String launchUrl = result.getNotification().getLaunchURL();
//                        Log.i("OneSignalExample", "launchUrl set with value: " + result.getAction().toString());
                        Log.i("OneSignalExample", "id:::::notificationOpened:::::::: ");

                        if (result.getNotification() != null) {
                            if (result.getNotification().getAdditionalData() != null) {

                                if (result.getNotification() != null) {
                                    if (result.getNotification().getAdditionalData() != null) {
                                    }
                                }

                            }
                        }


                    }
                }
        );


    }
}