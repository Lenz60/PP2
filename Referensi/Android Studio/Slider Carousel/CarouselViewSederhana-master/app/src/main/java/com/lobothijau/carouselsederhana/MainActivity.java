package com.lobothijau.carouselsederhana;

import android.content.Context;
import android.media.Image;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    Context context; // menyimpan appContext
    Toast toast1, toast2, toast3; // instance dari kelas Toast
    int duration; // menyimpan durasi toast ini tampil
    String myToast1, myToast2, myToast3; // menyimpan teks untuk ditampilkan di toast
    CarouselView carouselView;
    Image image1,image2,image3;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        context = getApplicationContext();
        myToast1= "gambar1";
        myToast2= "gambar2";
        myToast3= "gambar3";
        duration = Toast.LENGTH_LONG;
        toast1 = Toast.makeText(context,myToast1,duration);
        toast2 = Toast.makeText(context,myToast2,duration);
        toast3 = Toast.makeText(context,myToast3,duration);
        if (id == 0){
            toast1.show();
        }
        else if (id == 1 ){
            toast2.show();
        }
        else if (id == 2){
            toast3.show();
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*public void onclick(View view,int position, ImageView imageView) {
        context = getApplicationContext();
        myToast1= "gambar1";
        myToast2= "gambar2";
        myToast3= "gambar3";
        duration = Toast.LENGTH_LONG;
        toast1 = Toast.makeText(context,myToast1,duration);
        toast2 = Toast.makeText(context,myToast2,duration);
        toast3 = Toast.makeText(context,myToast3,duration);
        if (sampleImages[position] == 0){
            toast1.show();
        }
        else if (sampleImages[position] == 1 ){
            toast2.show();
        }
        else if (sampleImages[position] == 2){
            toast3.show();
        }
    }*/
}
