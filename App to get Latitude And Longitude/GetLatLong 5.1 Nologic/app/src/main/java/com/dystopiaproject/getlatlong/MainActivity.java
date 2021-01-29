package com.dystopiaproject.getlatlong;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_LOCATION_PERMISSION = 1;
    private TextView txtLatLong;
    private ProgressBar progressBar;
    double latak1,longak1,latbk1,longbk1,latck1,longck1,latdk1,longdk1,
            latak10,longak10,latbk10,longbk10,latck10,longck10,latdk10,longdk10, latbts1, latbts2, longbts1,longbts2;
    String posnalat, posnalong, posnaconfirm,
            posk1lat, posk1long, posk1confirm,
            posk10lat, posk10long, posk10confirm,
            posaconfirm, posalat, posalong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatLong = findViewById(R.id.txtLatLong);
        progressBar = findViewById(R.id.progressBar);

        findViewById(R.id.BtnGetCurrentLocation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(
                        getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(
                            MainActivity.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                            REQUEST_CODE_LOCATION_PERMISSION
                    );
                } else {
                    getCurrentLocation();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Do something after 100ms
                            getCurrentLocation();
                        }
                    }, 1000);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Do something after 100ms
                            getCurrentLocation();
                        }
                    }, 2000);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Do something after 100ms
                            getCurrentLocation();
                        }
                    }, 3000);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Do something after 100ms
                            getCurrentLocation();
                        }
                    }, 5000);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_LOCATION_PERMISSION && grantResults.length > 0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getCurrentLocation();
            }
        } else {
            Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
        }
    }

    private void getCurrentLocation() {

        ///// test sample
        /*
        latak1 = -7.7572305;
        longak1 = 110.4726617;

        latbk1 = -7.7572311;
        longbk1 = 110.4726641;

        latck1 = -7.7572313;
        longck1 = 110.4726625;

        latdk1 = -7.7572312;
        longdk1 = 110.4726675;

         */
        latbts1 = -7.7572337;
        latbts2 = -7.7572328;

        longbts1 = 110.4726684;
        longbts2 = 110.4726690;





        progressBar.setVisibility(View.VISIBLE);
        final LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(2000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }


        LocationServices.getFusedLocationProviderClient(MainActivity.this)
                .requestLocationUpdates(locationRequest, new LocationCallback() {

                    @Override
                    public void onLocationResult(LocationResult locationResult) {
                        super.onLocationResult(locationResult);
                        LocationServices.getFusedLocationProviderClient(MainActivity.this)
                                .removeLocationUpdates(this);
                        if (locationResult != null && locationResult.getLocations().size() > 0) {
                            int latestLocationIndex = locationResult.getLocations().size() - 1;
                            double latitude =
                                    locationResult.getLocations().get(latestLocationIndex).getLatitude();
                            double longitude =
                                    locationResult.getLocations().get(latestLocationIndex).getLongitude();


                            //////////////////// kursi 1 //////////////
                                    //NO LOGIC
                                    //logic latitude > lata && latitude < latd || longitude > longb && longitude < longa
                                if (latitude > latbts1 && latitude < latbts2 ){
                                    posalat = "true";

                                    if (longitude > longbts1 && longitude < longbts2){
                                        posaconfirm = "true";
                                        posalong = "true";
                                    }
                                    else {
                                        posaconfirm = "false";
                                        posalong = "false";
                                    }
                                }
                                else {
                                    posalat = "false";
                                    posalong = "false";
                                    posaconfirm = "false";
                                }
                                    //latitude > latb && latitude < latc || longitude > longc && longitude < longd


                                /////////////////////////////
                                /*
                                if (longitude > longb && longitude < longa){
                                    posalong = "true";
                                }
                                else if (longitude > longc && longitude < longd){
                                    posalong = "true";
                                }
                                else {
                                    posalong = "false";
                                }
                                */

                                ////////////// confirm kursi 1 //////////////
                            /*
                                if (posk1lat.equals("true") && posk1long.equals("true")){
                                    posk1confirm = "true";
                                }
                                else {
                                    posk1confirm = "false";
                                }
                                ///////////// confirm kursi 10 /////////////
                                if (posk10lat.equals("true") && posk10long.equals("true")){
                                    posk10confirm = "true";
                                }
                                else {
                                    posk10confirm = "false";
                                }

                             */


                                if (posaconfirm.equals("true"))
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : A \n " +
                                                            "\n pos a lat : %s \n pos a long : %s \n posaconfirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    posalat,
                                                    posalong,
                                                    posaconfirm
                                            )
                                    );
                                }
                                else {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location Unavailable \n " +
                                                            "\n pos a lat : %s \n pos a long : %s \n posaconfirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    posalat,
                                                    posalong,
                                                    posaconfirm
                                            )
                                    );
                                }

                        }
                        progressBar.setVisibility(View.GONE);
                    }
                }, Looper.getMainLooper());
    }
}
