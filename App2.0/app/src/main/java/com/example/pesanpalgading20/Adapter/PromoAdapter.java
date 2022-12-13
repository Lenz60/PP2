package com.example.pesanpalgading20.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pesanpalgading20.Getter.Makanan.MieAyam;
import com.example.pesanpalgading20.Getter.Promo.Promo;
import com.example.pesanpalgading20.R;

import java.util.ArrayList;

public class PromoAdapter extends ArrayAdapter<Promo> {
    private static final String LOG_TAG = PromoAdapter.class.getSimpleName();
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     *
     */
    public PromoAdapter(Activity context, ArrayList<Promo> promo){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super (context, 0, promo);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_menu, parent, false);
        }

        Promo currentPromo = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.TxtvNamaListMenuItem);
        nameTextView.setText(currentPromo.getmPromoName());

        TextView hargaTextView = (TextView) listItemView.findViewById(R.id.TxtvHargaListMenuItem);
        hargaTextView.setText(String.valueOf(currentPromo.getmPromoHarga()));

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.ImageViewImageListMenuItem);
        iconView.setImageResource(currentPromo.getmImageResourceId());

        return listItemView;
    }
}
