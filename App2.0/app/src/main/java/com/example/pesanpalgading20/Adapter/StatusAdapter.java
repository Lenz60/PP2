package com.example.pesanpalgading20.Adapter;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.pesanpalgading20.Getter.Status.Status;
import com.example.pesanpalgading20.R;

import org.w3c.dom.Text;

import java.util.List;

public class StatusAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Status>  statusItems;

    public StatusAdapter(Activity activity, List<Status> statusItems){
        this.activity = activity;
        this.statusItems = statusItems;
    }

    @Override
    public int getCount() {
        return statusItems.size();
    }

    @Override
    public Object getItem(int location){
        return statusItems.get(location);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.activity_list_row, null);

        TextView OrderCode = (TextView) convertView.findViewById(R.id.TxtvStatusCode);
        TextView Name = (TextView) convertView.findViewById(R.id.TxtvStatusName);
        TextView FoodName = (TextView) convertView.findViewById(R.id.TxtvStatusFoodName);
        TextView FoodType = (TextView) convertView.findViewById(R.id.TxtvStatusFoodType);
        TextView NoTable = (TextView) convertView.findViewById(R.id.TxtvStatusNoTable);
        TextView Status = (TextView) convertView.findViewById(R.id.TxtvStatusStatuses);
        TextView TotalPrice = (TextView) convertView.findViewById(R.id.TxtvStatusTotalPrice);

        //getting movie data for the row
        Status s = statusItems.get(position);

        //OrderCode
        OrderCode.setText(s.getOrderCode());

        //Name
        Name.setText(s.getName());

        //FoodName
        FoodName.setText(s.getFoodName());

        //FoodType
        FoodType.setText(s.getTypeFood());

        //Notable
        NoTable.setText(s.getNoTable());

        //Status
        Status.setText(s.getStatus());

        //TotalPrice
        TotalPrice.setText(s.getTotalPrice());

        return convertView;
    }

}
