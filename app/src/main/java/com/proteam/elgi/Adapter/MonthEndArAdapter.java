package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proteam.elgi.Model.CollectionSummaryResponsibilityModel;
import com.proteam.elgi.Model.MonthEndArModel;
import com.proteam.elgi.R;

public class MonthEndArAdapter extends RecyclerView.Adapter<MonthEndArAdapter.ViewHolder>{

    private MonthEndArModel[] listdata;
    private Context context;

    public MonthEndArAdapter(MonthEndArModel[] listdata) {
        this.listdata = listdata;
        this.context = context;
    }
    @NonNull
    @Override
    public MonthEndArAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.month_end_adaptor_layout, parent, false);
        MonthEndArAdapter.ViewHolder viewHolder = new MonthEndArAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MonthEndArAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
