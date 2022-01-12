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

    TextView StatusDisiapkan, StatusSelesai;

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

        StatusDisiapkan = findViewById(R.id.TxtvStatusDisiapkan);
        StatusSelesai = findViewById(R.id.TxtvStatusSelesai);

        DisplayStatus();
    }

    public void DisplayStatus() {
        if(StatusStatuses.getText().toString().equals("Disiapkan")){
            StatusDisiapkan.setVisibility(View.VISIBLE);
            StatusSelesai.setVisibility(View.INVISIBLE);
        }
        else{
            StatusDisiapkan.setVisibility(View.INVISIBLE);
            StatusSelesai.setVisibility(View.VISIBLE);
        }
    }
}