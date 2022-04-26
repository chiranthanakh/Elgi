package com.proteam.elgi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.proteam.elgi.Adapter.MonthEndArAdapter;
import com.proteam.elgi.Adapter.OdCustomerAdapter;
import com.proteam.elgi.Model.MonthEndArModel;
import com.proteam.elgi.Model.OdCustomerModel;
import com.proteam.elgi.R;

public class MonthEndARActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_aractivity);

        MonthEndArModel[] monthEndArModels = new MonthEndArModel[]{
                new MonthEndArModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44","testing","testing","testing"),
                new MonthEndArModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44","testing","testing","testing"),
                new MonthEndArModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44","testing","testing","testing")

        };


       RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Od_Customer_list);
        MonthEndArAdapter adapter = new MonthEndArAdapter(monthEndArModels);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}