package com.sooclear.androidid;

import android.os.Bundle;
import android.app.Activity;
import android.provider.Settings;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvId = null;
        String androidId = null;

            androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            tvId = (TextView)findViewById(R.id.tvId);
            tvId.setText(androidId);
            tvId.setTextSize(30.0f);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
