package com.proteam.elgi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.proteam.elgi.Adapter.CurrentArAdapter;
import com.proteam.elgi.Adapter.MonthEndArAdapter;
import com.proteam.elgi.Model.CurrentArModel;
import com.proteam.elgi.Model.MonthEndArModel;
import com.proteam.elgi.R;

public class CurrentArActivity extends AppCompatActivity {

    ImageView iv_nav_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_ar);
        iv_nav_view = findViewById(R.id.iv_nav_view);
        iv_nav_view.setOnClickListener(view -> onBackPressed());


        CurrentArModel[] currentArModels = new CurrentArModel[]{
                new CurrentArModel("DUMMY","DUMMY","South","31/03/2022","CU1DUMMY","DUMMY-TRAIL UNITS SALES-CUSTOMERS","401_IJC_16000006","31/03/2016","01/04/2016","-234953.82","0.00","-234953.82"),

        };


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_currentAR);
        CurrentArAdapter currentAradapter = new CurrentArAdapter(currentArModels);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(currentAradapter);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(CurrentArActivity.this,MainActivity.class);
        startActivity(intent);
        finishAffinity();
    }

}