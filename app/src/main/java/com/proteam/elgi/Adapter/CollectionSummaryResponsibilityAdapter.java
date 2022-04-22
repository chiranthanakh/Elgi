package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proteam.elgi.Model.CollectionSummaryResponsibilityModel;
import com.proteam.elgi.Model.CollectionSummryVerticalModel;
import com.proteam.elgi.R;

public class CollectionSummaryResponsibilityAdapter extends RecyclerView.Adapter<CollectionSummaryResponsibilityAdapter.ViewHolder>{


    private CollectionSummaryResponsibilityModel[] listdata;
    private Context context;

    public CollectionSummaryResponsibilityAdapter(CollectionSummaryResponsibilityModel[] listdata) {
        this.listdata = listdata;
        this.context = context;
    }


    @NonNull
    @Override
    public CollectionSummaryResponsibilityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.colletion_summary_responsibility, parent, false);
        CollectionSummaryResponsibilityAdapter.ViewHolder viewHolder = new CollectionSummaryResponsibilityAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionSummaryResponsibilityAdapter.ViewHolder holder, int position) {
        final CollectionSummaryResponsibilityModel collectionSummaryResponsibilityModel = listdata[position];

        holder.tv_cluster_responsibility.setText(listdata[position].getCluster_responsibility());
        holder.tv_vertical_responsibility.setText(listdata[position].getVertical_responsibility());
        holder.tv_responsibility_responsibility.setText(listdata[position].getResponsibility_responsibility());
        holder.tv_entCollection_responsibility.setText(listdata[position].getEntCollection_responsibility());
        holder.tv_OdFtmPlan_responsibility.setText(listdata[position].getOdFtmPlan_responsibility());
        holder.tv_coverage_responsibility.setText(listdata[position].getCoverage_responsibility());
        holder.tv_totalPlan_responsibility.setText(listdata[position].getTotalPlan_responsibility());
        holder.tv_totalCollection_responsibility.setText(listdata[position].getTotalCollection_responsibility());
        holder.tv_achievement_responsibility.setText(listdata[position].getAchievement_responsibility());
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_cluster_responsibility,tv_vertical_responsibility,tv_responsibility_responsibility,
                tv_entCollection_responsibility,tv_OdFtmPlan_responsibility,tv_coverage_responsibility,
                tv_totalPlan_responsibility,tv_totalCollection_responsibility,tv_achievement_responsibility;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_cluster_responsibility = (TextView) itemView.findViewById(R.id.tv_cluster_responsibility);
            this.tv_vertical_responsibility = (TextView) itemView.findViewById(R.id.tv_vertical_responsibility);
            this.tv_responsibility_responsibility = (TextView) itemView.findViewById(R.id.tv_responsibility_responsibility);
            this.tv_entCollection_responsibility = (TextView) itemView.findViewById(R.id.tv_entCollection_responsibility);
            this.tv_OdFtmPlan_responsibility = (TextView) itemView.findViewById(R.id.tv_OdFtmPlan_responsibility);
            this.tv_coverage_responsibility = (TextView) itemView.findViewById(R.id.tv_coverage_responsibility);
            this.tv_totalPlan_responsibility = (TextView) itemView.findViewById(R.id.tv_totalPlan_responsibility);
            this.tv_totalCollection_responsibility = (TextView) itemView.findViewById(R.id.tv_totalCollection_responsibility);
            this.tv_achievement_responsibility = (TextView) itemView.findViewById(R.id.tv_achievement_responsibility);
        }
    }
}
