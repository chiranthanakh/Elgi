package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proteam.elgi.Model.CollectionSummaryCustomerModel;
import com.proteam.elgi.Model.CollectionSummaryResponsibilityModel;
import com.proteam.elgi.R;

public class CollectionSummaryCustomerAdapter extends RecyclerView.Adapter<CollectionSummaryCustomerAdapter.ViewHolder> {

    private CollectionSummaryCustomerModel[] listdata;
    private Context context;

    public CollectionSummaryCustomerAdapter(CollectionSummaryCustomerModel[] listdata) {
        this.listdata = listdata;
        this.context = context;
    }

    @NonNull
    @Override
    public CollectionSummaryCustomerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.collection_summary_customer, parent, false);
        CollectionSummaryCustomerAdapter.ViewHolder viewHolder = new CollectionSummaryCustomerAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionSummaryCustomerAdapter.ViewHolder holder, int position) {

        holder.tv_cluster_customer.setText(listdata[position].getCluster_customer());
        holder.tv_vertical_customer.setText(listdata[position].getVertical_customer());
        holder.tv_childCode_customer.setText(listdata[position].getChildCode_customer());
        holder.tv_custName_customer.setText(listdata[position].getCustName_customer());
        holder.tv_EntCollection_customer.setText(listdata[position].getEntCollection_customer());
        holder.tv_odFtmPlan_customer.setText(listdata[position].getOdFtmPlan_customer());
        holder.tv_coverage_customer.setText(listdata[position].getCoverage_customer());
        holder.tv_totalPlan_customer.setText(listdata[position].getTotalPlan_customer());
        holder.tv_totalCollection_customer.setText(listdata[position].getTotalCollection_customer());
        holder.tv_achievement_customer.setText(listdata[position].getAchievement_customer());
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_cluster_customer,tv_vertical_customer,tv_childCode_customer,tv_custName_customer,
                tv_EntCollection_customer,tv_odFtmPlan_customer,tv_coverage_customer,tv_totalPlan_customer,
                tv_totalCollection_customer,tv_achievement_customer;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_cluster_customer = (TextView) itemView.findViewById(R.id.tv_cluster_customer);
            this.tv_vertical_customer = (TextView) itemView.findViewById(R.id.tv_vertical_customer);
            this.tv_childCode_customer = (TextView) itemView.findViewById(R.id.tv_childCode_customer);
            this.tv_custName_customer = (TextView) itemView.findViewById(R.id.tv_custName_customer);
            this.tv_EntCollection_customer = (TextView) itemView.findViewById(R.id.tv_EntCollection_customer);
            this.tv_odFtmPlan_customer = (TextView) itemView.findViewById(R.id.tv_odFtmPlan_customer);
            this.tv_coverage_customer = (TextView) itemView.findViewById(R.id.tv_coverage_customer);
            this.tv_totalPlan_customer = (TextView) itemView.findViewById(R.id.tv_totalPlan_customer);
            this.tv_totalCollection_customer = (TextView) itemView.findViewById(R.id.tv_totalCollection_customer);
            this.tv_achievement_customer = (TextView) itemView.findViewById(R.id.tv_achievement_customer);
        }
    }
}
