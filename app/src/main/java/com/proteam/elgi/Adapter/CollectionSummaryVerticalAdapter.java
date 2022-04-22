package com.proteam.elgi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proteam.elgi.Model.CollectionSummryVerticalModel;
import com.proteam.elgi.R;

public class CollectionSummaryVerticalAdapter extends RecyclerView.Adapter<CollectionSummaryVerticalAdapter.ViewHolder> {


    private CollectionSummryVerticalModel[] listdata;
    private Context context;

    public CollectionSummaryVerticalAdapter(CollectionSummryVerticalModel[] listdata) {
        this.listdata = listdata;
        this.context = context;
    }

    @NonNull
    @Override
    public CollectionSummaryVerticalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.collection_summary_vertical_layout, parent, false);
        CollectionSummaryVerticalAdapter.ViewHolder viewHolder = new CollectionSummaryVerticalAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CollectionSummryVerticalModel collectionSummryVerticalModel = listdata[position];

        holder.tv_cluster_vertical.setText(listdata[position].getCluster_vertical());
        holder.tv_vertical_vertical.setText(listdata[position].getVertical_vertical());
        holder.tv_EntCollection_vertical.setText(listdata[position].getEntCollection_vertical());
        holder.tv_odFtmPlan_vertical.setText(listdata[position].getOdFtmPlan_vertical());
        holder.tv_coverage_vertical.setText(listdata[position].getCoverage_vertical());
        holder.tv_odFtmHo_vertical.setText(listdata[position].getOdFtmHo_vertical());
        holder.tv_totalPlan_vertical.setText(listdata[position].getTotalPlan_vertical());
        holder.tv_totalCollection_vertical.setText(listdata[position].getTotalCollection_vertical());
        holder.tv_achievement_vertical.setText(listdata[position].getAchievement_vertical());


    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_cluster_vertical,tv_vertical_vertical,tv_EntCollection_vertical,tv_odFtmPlan_vertical,
                tv_coverage_vertical,tv_odFtmHo_vertical,tv_totalPlan_vertical,tv_totalCollection_vertical,
                tv_achievement_vertical;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_cluster_vertical = (TextView) itemView.findViewById(R.id.tv_cluster_vertical);
            this.tv_vertical_vertical = (TextView) itemView.findViewById(R.id.tv_vertical_vertical);
            this.tv_EntCollection_vertical = (TextView) itemView.findViewById(R.id.tv_EntCollection_vertical);
            this.tv_odFtmPlan_vertical = (TextView) itemView.findViewById(R.id.tv_odFtmPlan_vertical);
            this.tv_coverage_vertical = (TextView) itemView.findViewById(R.id.tv_coverage_vertical);
            this.tv_odFtmHo_vertical = (TextView) itemView.findViewById(R.id.tv_odFtmHo_vertical);
            this.tv_totalPlan_vertical = (TextView) itemView.findViewById(R.id.tv_totalPlan_vertical);
            this.tv_totalCollection_vertical = (TextView) itemView.findViewById(R.id.tv_totalCollection_vertical);
            this.tv_achievement_vertical = (TextView) itemView.findViewById(R.id.tv_achievement_vertical);


        }
    }
}
