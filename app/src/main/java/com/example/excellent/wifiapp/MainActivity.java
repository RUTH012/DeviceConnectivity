package com.example.excellent.wifiapp;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton wifiOnOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifiOnOff=(ToggleButton) findViewById(R.id.toggleButton);
        wifiOnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    WifiManager onwifi=(WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
                    onwifi.setWifiEnabled(true);
                }
                else{
                    WifiManager offwifi=(WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
                    offwifi.setWifiEnabled(false);
                }

            }
        });
    }
}
