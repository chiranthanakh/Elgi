package com.proteam.elgi.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.proteam.elgi.Adapter.ParentLevelAdapter;
import com.proteam.elgi.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_summary);


        List<String> listDataHeader = new ArrayList<>();
        String[] mItemHeaders = getResources().getStringArray(R.array.items_array_expandable_level_one);
        Collections.addAll(listDataHeader, mItemHeaders);
        final ExpandableListView mExpandableListView = (ExpandableListView) findViewById(R.id.expandableListView_Parent);
        if (mExpandableListView != null) {
            ParentLevelAdapter parentLevelAdapter = new ParentLevelAdapter(this, listDataHeader);
            mExpandableListView.setAdapter(parentLevelAdapter);
            // display only one expand item
//            mExpandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//                int previousGroup = -1;
//                @Override
//                public void onGroupExpand(int groupPosition) {
//                    if (groupPosition != previousGroup)
//                        mExpandableListView.collapseGroup(previousGroup);
//                    previousGroup = groupPosition;
//                }
//            });
        }
    }
}