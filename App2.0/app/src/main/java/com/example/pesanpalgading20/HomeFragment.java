package com.example.pesanpalgading20;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    Context context; // menyimpan appContext
    Toast toast1, toast2, toast3; // instance dari kelas Toast
    int duration; // menyimpan durasi toast ini tampil
    String myToast1, myToast2, myToast3; // menyimpan teks untuk ditampilkan di toast
    CarouselView carouselView;
    Image image1,image2,image3;
    int[] sampleImages = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3};
    TextView textView;
    //int[] samplearray = {22,212,333};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_home, container, false);

        context = getContext();
        myToast1= "gambar1";
        myToast2= "gambar2";
        myToast3= "gambar3";
        duration = Toast.LENGTH_LONG;
        toast1 = Toast.makeText(context,myToast1,duration);
        toast2 = Toast.makeText(context,myToast2,duration);
        toast3 = Toast.makeText(context,myToast3,duration);

        carouselView =  viewRoot.findViewById(R.id.carouselView);
        //textView = viewRoot.findViewById(R.id.TxtvHomeFragment);
        //textView.setText(String.valueOf(samplearray[1]));

        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(sampleImages.length);
        // Inflate the layout for this fragment


        return viewRoot;
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(final int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);

            imageView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if (position == 0){
                        toast1.show(); //intent this
                    }
                    else if (position == 1) {
                        toast2.show(); //intent this
                    }
                    else if (position == 2 ){
                        toast3.show(); //intent this
                    }
                }
            });

        }
    };
}