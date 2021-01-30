package com.dystopiaproject.getlatlongLogic;

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
    double lat1,lat2,lat3,lat4, lat5,
            long1, long2, long3, long4, long5,long6;
    Boolean poslat1, poslat2, poslat3, poslat4, poslat5,
            poslong1, poslong2, poslong3, poslong4, poslong5,poslong6;
    Boolean posk1confirm, posk2confirm, posk10confirm,
            posk3confirm, posk6confirm, posk9confirm, posk11confirm,
                posk4confirm, posk7confirm,posk12confirm;
    String unavailable;

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
        unavailable = "Unavailable";
        //////////////////////
        lat1 = -7.7283175;
        lat2 = -7.7283155;
        lat3 = -7.7283145;
        lat4 = -7.7283110;
        lat5 = -7.7283100;

        long1 = 110.4109377;
        long2 = 110.4109404;
        long3 = 110.4109420;
        long4 = 110.4109444;
        long5 = 110.4109471;
        //////// long kursi 1 ////////////
        /// long kursi a = total long ///
        // yaitu long 5 /////////////////
        long6 = 110.4109471;


        progressBar.setVisibility(View.VISIBLE);
        final LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(1000);
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

                            poslong1 = false;
                            poslong2 = false;
                            poslong3 = false;
                            poslong4 = false;
                            poslong5 = false;
                            poslong6 = false;
                            poslat1 = false;
                            poslat2 = false;
                            poslat3 = false;
                            poslat4 = false;
                            poslat5 = false;
                            posk1confirm = false;
                            posk2confirm = false;
                            posk3confirm = false;
                            posk4confirm = false;
                            posk6confirm = false;
                            posk7confirm = false;
                            posk9confirm = false;
                            posk10confirm = false;
                            posk11confirm = false;
                            posk12confirm = false;
                            ///kursi 1 //


                            ///// kursi 2 3 4 ////
                            if (longitude > long1 && longitude < long2){
                                if (latitude > lat2 && latitude < lat3){
                                    posk2confirm = true;
                                    poslat3 = true;
                                }
                                else if (latitude > lat3 && latitude < lat4){
                                    posk3confirm = true;
                                    poslat4 = true;
                                }
                                else if (latitude > lat4 && latitude < lat5){
                                    posk4confirm = true;
                                    poslat5 = true;
                                }
                                else {
                                    posk2confirm = false;
                                    posk3confirm = false;
                                    posk4confirm = false;
                                    poslat3 = false;
                                    poslat4 = false;
                                    poslat5 = false;
                                }
                                //poslong2 = true;
                            }
                            ///// kursi 6 7 ////
                            else if (longitude > long2 && longitude < long3)  {

                                if (latitude > lat2 && latitude < lat4){
                                    posk6confirm = true;
                                    poslat4 = true;
                                }
                                else if (latitude > lat4 && latitude < lat5) {
                                    posk7confirm = true;
                                    poslat5 = true;
                                }
                                else {
                                    posk6confirm = false;
                                    posk7confirm = false;
                                    poslat4 = false;
                                    poslat5 = false;
                                }
                                poslong3 = true;
                            }
                            //// kursi 9 ///
                            else if (longitude > long3 && longitude < long4){

                                if (latitude > lat2 && latitude < lat4){
                                    posk9confirm = true;
                                    poslat4 = true;
                                }
                                else{
                                    posk9confirm = false;
                                    poslat4 = false;
                                }
                                poslong4 = true;
                            }
                            //// kursi 10 11 12 //
                            else if (longitude > long4 && longitude < long5){

                                if (latitude > lat2 && latitude < lat3){
                                    posk10confirm = true;
                                    poslat3 = true;
                                }
                                else if (latitude > lat3 && latitude < lat4){
                                    posk11confirm = true;
                                    poslat4 = true;
                                }
                                else if (latitude > lat4 && latitude < lat5){
                                    posk12confirm = true;
                                    poslat5 = true;
                                }
                                else {
                                    posk10confirm = false;
                                    posk11confirm = false;
                                    posk12confirm = false;
                                    poslat3 = false;
                                    poslat4 = false;
                                    poslat5 = false;
                                }
                                poslong5 = true;
                            }
                            /// kursi 1//

                            else if (longitude > long2 && longitude < long4){
                                //
                                if (latitude > lat1 && latitude < lat2){
                                    posk1confirm = true;
                                    poslat1 = true;
                                }
                                else{
                                    posk1confirm = false;
                                    poslat1 = false;
                                }
                                poslong4 = true;
                            }

                            else {
                                poslong1 = false;
                                poslong2 = false;
                                poslong3 = false;
                                poslong4 = true;
                                poslong5 = false;
                                poslong6 = false;
                                poslat1 = true;
                                poslat2 = false;
                                poslat3 = false;
                                poslat4 = false;
                                poslat5 = false;
                                posk1confirm = true;
                                posk2confirm = false;
                                posk3confirm = false;
                                posk4confirm = false;
                                posk6confirm = false;
                                posk7confirm = false;
                                posk9confirm = false;
                                posk10confirm = false;
                                posk11confirm = false;
                                posk12confirm = false;
                            }

                                if (posk2confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 2 \n " +
                                                            "\n pos lat3 : %s \n pos long2 : %s \n posk2confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat3,
                                                    poslong2,
                                                    posk2confirm
                                            )
                                    );
                                }
                                else if (posk3confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 3 \n " +
                                                            "\n pos lat4 : %s \n pos long2 : %s \n posk3confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat4,
                                                    poslong2,
                                                    posk3confirm
                                            )
                                    );
                                }
                                else if (posk4confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 4 \n " +
                                                            "\n pos lat5 : %s \n pos long2 : %s \n posk4confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat5,
                                                    poslong2,
                                                    posk4confirm
                                            )
                                    );
                                }
                                else if (posk6confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 6 \n " +
                                                            "\n pos lat4 : %s \n pos long3 : %s \n posk6confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat4,
                                                    poslong3,
                                                    posk6confirm
                                            )
                                    );
                                }
                                else if (posk7confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 7 \n " +
                                                            "\n pos lat5 : %s \n pos long3 : %s \n posk7confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat5,
                                                    poslong3,
                                                    posk7confirm
                                            )
                                    );
                                }
                                else if (posk9confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 9 \n " +
                                                            "\n pos lat4 : %s \n pos long4 : %s \n posk9confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat4,
                                                    poslong4,
                                                    posk9confirm
                                            )
                                    );
                                }
                                else if (posk10confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 10 \n " +
                                                            "\n pos lat3 : %s \n pos long5 : %s \n posk10confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat3,
                                                    poslong5,
                                                    posk10confirm
                                            )
                                    );
                                }
                                else if (posk11confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 11 \n " +
                                                            "\n pos lat4 : %s \n pos long5 : %s \n posk11confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat4,
                                                    poslong5,
                                                    posk11confirm
                                            )
                                    );
                                }
                                else if (posk12confirm)
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 12 \n " +
                                                            "\n pos lat5 : %s \n pos long5 : %s \n posk12confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat5,
                                                    poslong5,
                                                    posk12confirm
                                            )
                                    );
                                }
                                else
                                {
                                    txtLatLong.setText(
                                            String.format(
                                                    "Latitude: %s\nLongitude : %s \n Location : Kursi 1 \n " +
                                                            "\n pos lat1 : %s \n pos long4 : %s \n posk1confirm : %s" ,
                                                    latitude,
                                                    longitude,
                                                    poslat1,
                                                    poslong4,
                                                    posk1confirm
                                            )
                                    );
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

                                ////////////////////////////


                        }
                        progressBar.setVisibility(View.GONE);
                    }
                }, Looper.getMainLooper());
    }
}
