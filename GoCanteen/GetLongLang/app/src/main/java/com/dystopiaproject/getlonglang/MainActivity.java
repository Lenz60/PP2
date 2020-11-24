package com.dystopiaproject.getlonglang;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static  final int REQUEST_LOCATION=1;

    Button getlocationBtn,resetLocationBtn;
    TextView showLocationTxt;

    LocationManager locationManager;
    String latitude,longitude,lat1S,lat2S,lat3S,lat4S,long1S,long2S,long3S,long4S;
    double lat1,lat2,lat3,lat4;
    double long1,long2,long3,long4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this,new String[]
                {Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);

        showLocationTxt=findViewById(R.id.show_location);
        getlocationBtn=findViewById(R.id.getLocation);
        resetLocationBtn=findViewById(R.id.resetLocation);

        getlocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                locationManager=(LocationManager) getSystemService(Context.LOCATION_SERVICE);

                //Check gps is enable or not

                if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
                {
                    //Write Function To enable gps

                    OnGPS();
                }
                else
                {
                    //GPS is already On then

                    getLocation();
                }
            }
        });
        resetLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetLoc();
            }
        });
    }

    private void resetLoc() {
        showLocationTxt.setText("");
    }


    private void getLocation() {


        lat1 = -7.7572465;
        long1 = 110.4726518;

        lat2 = -7.7572464;
        long2 = 110.4726521;

        lat3 = -7.7572461;
        long3 = 110.4726524;

        lat4 = -7.7572461;
        long4 = 110.4726533;

        //Check Permissions again

        if (ActivityCompat.checkSelfPermission(MainActivity.this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this,

                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]
                    {Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        }
        else
        {
            Location LocationGps= locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Location LocationNetwork=locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            Location LocationPassive=locationManager.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);

            if (LocationGps !=null)
            {
                double lat=LocationGps.getLatitude();
                double longi=LocationGps.getLongitude();

                latitude=String.valueOf(lat);
                longitude=String.valueOf(longi);
                /*
                lat1S = String.valueOf(lat1);
                lat2S = String.valueOf(lat2);
                lat3S = String.valueOf(lat3);
                lat4S = String.valueOf(lat4);

                long1S = String.valueOf(long1);
                long2S = String.valueOf(long2);
                long3S = String.valueOf(long3);
                long4S = String.valueOf(long4);
                */

                if (lat > lat1 && lat < lat3 || longi > long2 && longi < long1)
                {
                    showLocationTxt.setText("Your Location:"+"\n"+"Position: A"+ "\n"+"Latitude= "+latitude+"\n"+"Longitude= "+longitude);
                }
                else {
                    showLocationTxt.setText("Your Location:"+"\n"+"Position: None"+ "\n"+"Latitude= "+latitude+"\n"+"Longitude= "+longitude);
                }
            }
            else if (LocationNetwork !=null)
            {

                double lat=LocationNetwork.getLatitude();
                double longi=LocationNetwork.getLongitude();

                latitude=String.valueOf(lat);
                longitude=String.valueOf(longi);

                if (lat > lat1 && lat < lat3 || longi > long2 && longi < long1)
                {
                    showLocationTxt.setText("Your Location:"+"\n"+"Position: A"+ "\n"+"Latitude= "+latitude+"\n"+"Longitude= "+longitude);
                }
                else {
                    showLocationTxt.setText("Your Location:"+"\n"+"Position: None"+ "\n"+"Latitude= "+latitude+"\n"+"Longitude= "+longitude);
                }
            }
            else if (LocationPassive !=null)
            {
                double lat=LocationPassive.getLatitude();
                double longi=LocationPassive.getLongitude();

                latitude=String.valueOf(lat);
                longitude=String.valueOf(longi);

                if (lat > lat1 && lat < lat3 || longi > long2 && longi < long1)
                {
                    showLocationTxt.setText("Your Location:"+"\n"+"Position: A"+ "\n"+"Latitude= "+latitude+"\n"+"Longitude= "+longitude);
                }
                else {
                    showLocationTxt.setText("Your Location:"+"\n"+"Position: None"+ "\n"+"Latitude= "+latitude+"\n"+"Longitude= "+longitude);
                }
            }
            else
            {
                Toast.makeText(this, "Can't Get Your Location", Toast.LENGTH_SHORT).show();
            }

            //Thats All Run Your App
        }

    }

    private void OnGPS() {

        final AlertDialog.Builder builder= new AlertDialog.Builder(this);

        builder.setMessage("Enable GPS").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        final AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }

}
