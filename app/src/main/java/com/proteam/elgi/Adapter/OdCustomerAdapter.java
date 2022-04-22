package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proteam.elgi.Model.OdCustomerModel;
import com.proteam.elgi.R;

public class OdCustomerAdapter  extends RecyclerView.Adapter<OdCustomerAdapter.ViewHolder>{


    private OdCustomerModel[] listdata;
    private Context context;

    public OdCustomerAdapter(OdCustomerModel[] listdata) {
        this.listdata = listdata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.od_customers_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final OdCustomerModel odCustomerModel = listdata[position];

        holder.tv_od_childCode.setText(listdata[position].getOd_childCode());
        holder.tv_od_custName.setText(listdata[position].getOd_custName());
        holder.tv_od_overdue.setText(listdata[position].getOd_overdue());
        holder.tv_od_zero.setText(listdata[position].getOd_zero());
        holder.tv_od_three.setText(listdata[position].getOd_three());
        holder.tv_od_sixOne.setText(listdata[position].getOd_sixOne());
        holder.tv_od_nineOne.setText(listdata[position].getOd_nineOne());
        holder.tv_od_oneEight.setText(listdata[position].getOd_oneEight());
        holder.tv_od_threeSix.setText(listdata[position].getOd_threeSix());
        holder.tv_od_greaterSeven.setText(listdata[position].getOd_greaterSeven());


    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_od_childCode,tv_od_custName,tv_od_overdue,tv_od_zero,tv_od_three,tv_od_sixOne,tv_od_nineOne,
                tv_od_oneEight,tv_od_threeSix,tv_od_greaterSeven;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_od_childCode = (TextView) itemView.findViewById(R.id.tv_od_childCode);
            this.tv_od_custName = (TextView) itemView.findViewById(R.id.tv_od_custName);
            this.tv_od_overdue = (TextView) itemView.findViewById(R.id.tv_od_overdue);
            this.tv_od_zero = (TextView) itemView.findViewById(R.id.tv_od_zero);
            this.tv_od_three = (TextView) itemView.findViewById(R.id.tv_od_three);
            this.tv_od_sixOne = (TextView) itemView.findViewById(R.id.tv_od_sixOne);
            this.tv_od_nineOne = (TextView) itemView.findViewById(R.id.tv_od_nineOne);
            this.tv_od_oneEight = (TextView) itemView.findViewById(R.id.tv_od_oneEight);
            this.tv_od_threeSix = (TextView) itemView.findViewById(R.id.tv_od_threeSix);
            this.tv_od_greaterSeven = (TextView) itemView.findViewById(R.id.tv_od_greaterSeven);
        }
    }
}
