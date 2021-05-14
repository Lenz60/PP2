package com.example.pesanpalgading20.ViewMenuHome;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.ToppingAdapter.ToppingAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MakananMenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MakananMenuFragment extends Fragment {

    ExpandableListView expandableListTopping;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    ToppingAdapter toppingAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MakananMenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MakananMenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MakananMenuFragment newInstance(String param1, String param2) {
        MakananMenuFragment fragment = new MakananMenuFragment();
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

    public MakananMenuFragment(String mParam1) {
        this.mParam1 = mParam1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_makanan_menu, container, false);

        expandableListTopping = viewRoot.findViewById(R.id.ExpandableTopping);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();

        toppingAdapter = new ToppingAdapter(getActivity().getApplicationContext(),listGroup,listItem);
        expandableListTopping.setAdapter(toppingAdapter);
        initListDataMieAyam();


        // Inflate the layout for this fragment
        return viewRoot;

    }
    private void initListDataMieAyam(){
        //list group Topping
        listGroup.add(getResources().getString(R.string.toppingMieAyam));
        //listGroup.add(getString(R.string.toppingBakso));
        //add more topping based on menu ex toppingbakso,toppingsoto dll

        String[] array;

        //getting array from string topping
        List<String> topping1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.toppingMieAyam);
        for (String item : array){
            topping1.add(item);
        }
//        List<String> ToppingBaksoList = new ArrayList<>();
//        array = getResources().getStringArray(R.array.toppingBakso);
//        for (String item : array){
//            ToppingBaksoList.add(item);
//        }
        // add more array topping

        //hash the array
        listItem.put(listGroup.get(0),topping1);
        //listItem.put(listGroup.get(1),ToppingBaksoList);

        toppingAdapter.notifyDataSetChanged();
    }
}