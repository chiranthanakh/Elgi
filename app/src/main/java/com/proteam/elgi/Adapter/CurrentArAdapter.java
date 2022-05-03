package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proteam.elgi.Model.CurrentArModel;
import com.proteam.elgi.Model.MonthEndArModel;
import com.proteam.elgi.R;


public class CurrentArAdapter extends RecyclerView.Adapter<CurrentArAdapter.ViewHolder> {

    private CurrentArModel[] listdata;
    private Context context;

    public CurrentArAdapter(CurrentArModel[] listdata) {
        this.listdata = listdata;
        this.context = context;
    }

    @NonNull
    @Override
    public CurrentArAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.current_ar_layout, parent, false);
        CurrentArAdapter.ViewHolder viewHolder = new CurrentArAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CurrentArAdapter.ViewHolder holder, int position) {
        holder.tv_cluster_currentAr.setText(listdata[position].getCluster_currentAr());
        holder.tv_vertical_currentAr.setText(listdata[position].getVertical_currentAr());
        holder.tv_region_currentAr.setText(listdata[position].getRegion_currentAr());
        holder.tv_month_currentAr.setText(listdata[position].getMonth_currentAr());
        holder.tv_childCode_currentAr.setText(listdata[position].getChildCode_currentAr());
        holder.tv_customerName_currentAr.setText(listdata[position].getCustomerName_currentAr());
        holder.tv_orgDoc_currentAr.setText(listdata[position].getOrgDoc_currentAr());
        holder.tv_invoiceDate_currentAr.setText(listdata[position].getInvoiceDate_currentAr());
        holder.tv_revDueDate_currentAr.setText(listdata[position].getRevDueDate_currentAr());
        holder.tv_invoiceAmount_currentAr.setText(listdata[position].getInvoiceAmount_currentAr());
        holder.tv_paidAmount_currentAr.setText(listdata[position].getPaidAmount_currentAr());
        holder.tv_balanceAmount_currentAr.setText(listdata[position].getBalanceAmount_currentAr());
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_cluster_currentAr,tv_vertical_currentAr,tv_region_currentAr,tv_month_currentAr,
                tv_childCode_currentAr,tv_customerName_currentAr,tv_orgDoc_currentAr,tv_invoiceDate_currentAr,
                tv_revDueDate_currentAr,tv_invoiceAmount_currentAr,tv_paidAmount_currentAr,tv_balanceAmount_currentAr;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_cluster_currentAr = (TextView) itemView.findViewById(R.id.tv_cluster_currentAr);
            this.tv_vertical_currentAr = (TextView) itemView.findViewById(R.id.tv_vertical_currentAr);
            this.tv_region_currentAr = (TextView) itemView.findViewById(R.id.tv_region_currentAr);
            this.tv_month_currentAr = (TextView) itemView.findViewById(R.id.tv_month_currentAr);
            this.tv_childCode_currentAr = (TextView) itemView.findViewById(R.id.tv_childCode_currentAr);
            this.tv_customerName_currentAr = (TextView) itemView.findViewById(R.id.tv_customerName_currentAr);
            this.tv_orgDoc_currentAr = (TextView) itemView.findViewById(R.id.tv_orgDoc_currentAr);
            this.tv_invoiceDate_currentAr = (TextView) itemView.findViewById(R.id.tv_invoiceDate_currentAr);
            this.tv_revDueDate_currentAr = (TextView) itemView.findViewById(R.id.tv_revDueDate_currentAr);
            this.tv_invoiceAmount_currentAr = (TextView) itemView.findViewById(R.id.tv_invoiceAmount_currentAr);
            this.tv_paidAmount_currentAr = (TextView) itemView.findViewById(R.id.tv_paidAmount_currentAr);
            this.tv_balanceAmount_currentAr = (TextView) itemView.findViewById(R.id.tv_balanceAmount_currentAr);
        }
    }
}
