package com.example.pesanpalgading20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.pesanpalgading20.Adapter.StatusAdapter;
import com.example.pesanpalgading20.Getter.Status.Status;
import com.example.pesanpalgading20.Getter.Status.TotalFinalPrice;
import com.example.pesanpalgading20.Model.Volley.URLs;
import com.example.pesanpalgading20.Model.Volley.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StatusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StatusFragment extends Fragment {
    String TableCode;
    ListView StatusListView;
    StatusAdapter statusAdapter;
    ArrayList<Status> statusList = new ArrayList<Status>();



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StatusFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StatusFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StatusFragment newInstance(String param1, String param2) {
        StatusFragment fragment = new StatusFragment();
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

        View viewRoot = inflater.inflate(R.layout.fragment_status, container, false);

        StatusListView = viewRoot.findViewById(R.id.ListViewStatus);
        StringRequest();


        TableCode = getActivity().getIntent().getExtras().getString("kodeMeja").toString();





        return viewRoot;
    }


    public void StringRequest() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.STATUS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject obj = new JSONObject(response);
                            //if no error in response
                            if (!obj.getBoolean("error")) {
                                Toast.makeText(getContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();

                                //getting Status from response
                                JSONArray statusJson = obj.getJSONArray("status");

                                for (int i = 0; i < statusJson.length(); i++) {
                                    Status status = new Status(
                                            statusJson.getJSONObject(i).getString("OrderCode"),
                                            statusJson.getJSONObject(i).getString("GuestName"),
                                            statusJson.getJSONObject(i).getString("FoodCount"),
                                            statusJson.getJSONObject(i).getString("ProductName"),
                                            statusJson.getJSONObject(i).getString("ProductType"),
                                            statusJson.getJSONObject(i).getString("NoTable"),
                                            statusJson.getJSONObject(i).getString("Status"),
                                            statusJson.getJSONObject(i).getString("TotalPrice")
                                    );

                                    statusList.add(status);
                                }
                                statusAdapter = new StatusAdapter(getActivity(),statusList);
                                StatusListView.setAdapter(statusAdapter);
                            } else {
                                Toast.makeText(getContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getContext(),error.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<>();
                params.put("tablecode",TableCode);
                return params;
            }
        };

        VolleySingleton.getInstance(getContext()).addToRequestQueue(stringRequest);
    }
}