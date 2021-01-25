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
            latak10,longak10,latbk10,longbk10,latck10,longck10,latdk10,longdk10;
    String posnalat, posnalong, posnaconfirm,
            posk1lat, posk1long, posk1confirm,
            posk10lat, posk10long, posk10confirm;

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
        ////////
        ////// kursi 1//

        latak1 = -7.7281523;
        longak1 = 110.4112713;

        latbk1 = -7.7280952;
        longbk1 = 110.4112897;

        latck1 = -7.7280927;
        longck1 = 110.4112961;

        latdk1 = -7.7281049;
        longdk1 = 110.4112986;



        /////// kursi 10 //
        latak10 = -7.7283082;
        longak10 = 110.4109395;

        latbk10 = -7.7280874;
        longbk10 = 110.4113458;

        latck10 = -7.7281005;
        longck10 = 110.4113335;

        latdk10 = -7.7281972;
        longdk10 = 110.4112845;

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
                                if (latitude < latak1 && latitude > latdk1 || longitude < longbk1 && longitude > longak1 ){
                                    posk1lat = "true";
                                    posk1long = "true";
                                }
                                    //latitude > latb && latitude < latc || longitude > longc && longitude < longd
                                else if (latitude < latbk1 && latitude > latck1 || longitude < longck1 && longitude > longdk1){
                                    posk1lat = "true";
                                    posk1long = "true";
                                }
                                else {
                                    posk1lat = "false";
                                    posk1long = "false";
                                }
                                /////////////////// kursi 10 ////////////////
                                if (latitude < latak10 && latitude > latdk10 || longitude < longbk10 && longitude > longak10 ){
                                    posk10lat = "true";
                                    posk10long = "true";
                                }
                                //latitude > latb && latitude < latc || longitude > longc && longitude < longd
                                else if (latitude < latbk10 && latitude > latck10 || longitude < longck10 && longitude > longdk10){
                                    posk10lat = "true";
                                    posk10long = "true";
                                }
                                else {
                                    posk10lat = "false";
                                    posk10long = "false";
                                }

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


                                if (posk1confirm.equals("true"))
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 1 \n " +
                                                            "posk1lat : %s \n posk1long : %s \n posk1confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    posk1lat,
                                                    posk1long,
                                                    posk1confirm
                                            )
                                    );
                                }
                                else if (posk10confirm.equals("true"))
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 1 \n " +
                                                            "posk10lat : %s \n posk10long : %s \n posk10confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    posk10lat,
                                                    posk10long,
                                                    posk10confirm
                                            )
                                    );
                                }
                                else {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location Unavailable \n " +
                                                            "pos n/a lat : %s \n pos n/a long : %s \n pos n/a confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    posnalat,
                                                    posnalong,
                                                    posnaconfirm
                                            )
                                    );
                                }

                        }
                        progressBar.setVisibility(View.GONE);
                    }
                }, Looper.getMainLooper());
    }
}
