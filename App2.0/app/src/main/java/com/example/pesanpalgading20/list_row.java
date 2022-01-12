package com.example.pesanpalgading20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class list_row extends AppCompatActivity {

    TextView OrderCode,Name,
            FoodName,FoodType,
            NoTable,
            StatusStatuses,TotalPrices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_row);

        OrderCode = findViewById(R.id.TxtvStatusCode);
        Name = findViewById(R.id.TxtvStatusName);
        FoodName = findViewById(R.id.TxtvStatusFoodName);
        FoodType = findViewById(R.id.TxtvStatusFoodType);
        NoTable = findViewById(R.id.TxtvStatusNoTable);
        StatusStatuses = findViewById(R.id.TxtvStatusStatuses);
        TotalPrices = findViewById(R.id.TxtvStatusTotalPrice);

        if(FoodType.getText().toString().equals("Jajanan") || FoodType.getText().toString().equals("Es") || FoodType.getText().toString().equals("Hot")){
            FoodType.setVisibility(View.GONE);
        }
        else {
            FoodType.setVisibility(View.VISIBLE);
        }

        if(StatusStatuses.getText().toString().equals("Disiapkan")){
            StatusStatuses.setTextColor(getResources().getColor(R.color.Yellow));
        }
        else{
            StatusStatuses.setTextColor(getResources().getColor(R.color.Green));
        }



    }

}