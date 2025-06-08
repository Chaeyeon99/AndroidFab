package com.fabandroid;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.fabandroid.auth.Credentials;
import com.fabandroid.utils.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "FabAndroid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Access Token: " + Credentials.ACCESS_TOKEN);
        Log.d(TAG, "API Response: " + NetworkUtils.fakeApiCall());
    }
}
