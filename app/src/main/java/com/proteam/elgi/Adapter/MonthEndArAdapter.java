package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        View listItem= layoutInflater.inflate(R.layout.month_end_ar_layout, parent, false);
        MonthEndArAdapter.ViewHolder viewHolder = new MonthEndArAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MonthEndArAdapter.ViewHolder holder, int position) {
        holder.tv_cluster_monthEnd.setText(listdata[position].getMonthEnd_cluster());
        holder.tv_vertical_monthEnd.setText(listdata[position].getMonthEnd_vertical());
        holder.tv_region_monthEnd.setText(listdata[position].getMonthEnd_region());
        holder.tv_month_monthEnd.setText(listdata[position].getMonthEnd_month());
        holder.tv_childCode_monthEnd.setText(listdata[position].getMonthEnd_childCode());
        holder.tv_customerName_monthEnd.setText(listdata[position].getMonthEnd_CusName());
        holder.tv_orgDoc_monthEnd.setText(listdata[position].getMonthEnd_OrgDocNum());
        holder.tv_invoiceDate_monthEnd.setText(listdata[position].getMonthEnd_InvoiceDate());
        holder.tv_revDueDate_monthEnd.setText(listdata[position].getMonthEnd_RevDueDate());
        holder.tv_invoiceAmount_monthEnd.setText(listdata[position].getMonthEnd_InvoiceAmount());
        holder.tv_paidAmount_monthEnd.setText(listdata[position].getMonthEnd_PaidAmount());
        holder.tv_balanceAmount_monthEnd.setText(listdata[position].getMonthEnd_BalanceAmount());
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_cluster_monthEnd,tv_vertical_monthEnd,tv_region_monthEnd,tv_month_monthEnd,tv_childCode_monthEnd,
                tv_customerName_monthEnd,tv_orgDoc_monthEnd,tv_invoiceDate_monthEnd,tv_revDueDate_monthEnd,tv_invoiceAmount_monthEnd,
                tv_paidAmount_monthEnd,tv_balanceAmount_monthEnd;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_cluster_monthEnd = (TextView) itemView.findViewById(R.id.tv_cluster_monthEnd);
            this.tv_vertical_monthEnd = (TextView) itemView.findViewById(R.id.tv_vertical_monthEnd);
            this.tv_region_monthEnd = (TextView) itemView.findViewById(R.id.tv_region_monthEnd);
            this.tv_month_monthEnd = (TextView) itemView.findViewById(R.id.tv_month_monthEnd);
            this.tv_childCode_monthEnd = (TextView) itemView.findViewById(R.id.tv_childCode_monthEnd);
            this.tv_customerName_monthEnd = (TextView) itemView.findViewById(R.id.tv_customerName_monthEnd);
            this.tv_orgDoc_monthEnd = (TextView) itemView.findViewById(R.id.tv_orgDoc_monthEnd);
            this.tv_invoiceDate_monthEnd = (TextView) itemView.findViewById(R.id.tv_invoiceDate_monthEnd);
            this.tv_revDueDate_monthEnd = (TextView) itemView.findViewById(R.id.tv_revDueDate_monthEnd);
            this.tv_invoiceAmount_monthEnd = (TextView) itemView.findViewById(R.id.tv_invoiceAmount_monthEnd);
            this.tv_paidAmount_monthEnd = (TextView) itemView.findViewById(R.id.tv_paidAmount_monthEnd);
            this.tv_balanceAmount_monthEnd = (TextView) itemView.findViewById(R.id.tv_balanceAmount_monthEnd);
        }
    }
}
