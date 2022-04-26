package com.proteam.elgi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.proteam.elgi.Adapter.CollectionSummaryCustomerAdapter;
import com.proteam.elgi.Adapter.CollectionSummaryResponsibilityAdapter;
import com.proteam.elgi.Adapter.OdCustomerAdapter;
import com.proteam.elgi.Adapter.CollectionSummaryVerticalAdapter;
import com.proteam.elgi.Model.CollectionSummaryCustomerModel;
import com.proteam.elgi.Model.CollectionSummaryResponsibilityModel;
import com.proteam.elgi.Model.OdCustomerModel;
import com.proteam.elgi.Model.CollectionSummryVerticalModel;
import com.proteam.elgi.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    DrawerLayout drawer_layout;
    ImageView iv_nav_view;
    Spinner sp_ar_Type,sp_consol_entity,sp_sbu,sp_cluster,sp_vertical,sp_country,sp_region;
    private CombinedChart chart;
    private final int count = 12;

    RecyclerView rv_Od_Customer_list,rv_collection_vertical,rv_collection_responsibility,rv_collection_customer;

    Button btn_filterData_dashboard;

    TextView tv_month_endAR,tv_current_ar,tv_collection_summery,tv_collection_user,tv_collection_reports;

    //Ar Bar CHart
    BarChart stackedChart;
    int[] colorClassArray = new int[]{Color.parseColor("#FC5A03"),Color.parseColor("#09B53D"),Color.parseColor("#B3B5B4"),Color.parseColor("#F0B907"),Color.parseColor("#0398FC"),Color.parseColor("#1073C4"),Color.parseColor("#A08FFF")};
    protected String[] mTitle = new String[] {
            "AR", "Coll Plan Ho", "Coll Plan User", "Collection"
    };

    String[] months = new String[] {
            "0 to 30", "31 to 60", "61 to 90", "91 to 180", "181 to 365", "366 to 730", ">731"
    };

    //Group Bar CHart
   // BarChart groupChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
       /* sp_ar_Type.setOnItemSelectedListener(OnCatSpinnerCL);
        sp_consol_entity.setOnItemSelectedListener(OnCatSpinnerCL);
        sp_sbu.setOnItemSelectedListener(OnCatSpinnerCL);
        sp_cluster.setOnItemSelectedListener(OnCatSpinnerCL);
        sp_vertical.setOnItemSelectedListener(OnCatSpinnerCL);
        sp_country.setOnItemSelectedListener(OnCatSpinnerCL);
        sp_region.setOnItemSelectedListener(OnCatSpinnerCL);*/

        //Ar bar Chart
        Stacked();

        //Group Bar CHart
        //GroupBarCHart();


        //OD Customer

        OdCustomerModel[] odCustomerModels = new OdCustomerModel[]{
                new OdCustomerModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44"),
                new OdCustomerModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44"),
                new OdCustomerModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44"),
                new OdCustomerModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44"),
                new OdCustomerModel("CU1DUMMY1","Dummy Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44"),
                new OdCustomerModel("CU1DUMMY17","Last Code for customer Name 1","53.69","0.00","0.00","53.69","0.00","81.99","34.53","34.44"),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Od_Customer_list);
        OdCustomerAdapter adapter = new OdCustomerAdapter(odCustomerModels);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        //Collection Summary Vertical

        CollectionSummryVerticalModel[] collectionSummryVerticalModels = new CollectionSummryVerticalModel[]{
                new CollectionSummryVerticalModel("India","After Market Industries","150.34","118.02","58.93%","107.54","353.45","343.34","80.88%"),
                new CollectionSummryVerticalModel("India","Railways","150.34","118.02","58.93%","107.54","353.45","343.34","80.88%"),
                new CollectionSummryVerticalModel("India","After Market Portables","150.34","118.02","58.93%","107.54","353.45","343.34","80.88%"),
                new CollectionSummryVerticalModel("India","Direct","150.34","118.02","58.93%","107.54","353.45","343.34","80.88%"),


        };

        RecyclerView recyclerView_payors = (RecyclerView) findViewById(R.id.rv_collection_vertical);
        CollectionSummaryVerticalAdapter adapter_payors = new CollectionSummaryVerticalAdapter(collectionSummryVerticalModels);
        recyclerView_payors.setHasFixedSize(true);
        recyclerView_payors.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_payors.setAdapter(adapter_payors);

        //Collection Summary Responsibility

        CollectionSummaryResponsibilityModel[] collectionSummaryResponsibilityModels = new CollectionSummaryResponsibilityModel[]{
                new CollectionSummaryResponsibilityModel("India","C&M","Sachin Gupta","118.02","58.93%","107.54","353.45","343.34","80.88%"),
                new CollectionSummaryResponsibilityModel("India","Railways","Dipankar Roy","118.02","58.93%","107.54","353.45","343.34","80.88%"),
                new CollectionSummaryResponsibilityModel("India","After Market Portables","Arnab Das","118.02","58.93%","107.54","353.45","343.34","80.88%"),
                new CollectionSummaryResponsibilityModel("India","Direct","Rajesh C","118.02","58.93%","107.54","353.45","343.34","80.88%"),


        };

        RecyclerView recyclerView_responsibility = (RecyclerView) findViewById(R.id.rv_collection_responsibility);
        CollectionSummaryResponsibilityAdapter adapter_responsibility = new CollectionSummaryResponsibilityAdapter(collectionSummaryResponsibilityModels);
        recyclerView_responsibility.setHasFixedSize(true);
        recyclerView_responsibility.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_responsibility.setAdapter(adapter_responsibility);

        //Collection Summary Customer

        CollectionSummaryCustomerModel[] collectionSummaryCustomerModels = new CollectionSummaryCustomerModel[]{
                new CollectionSummaryCustomerModel("India","Railways","CUD00008","Diesel Locomotive Works","2.85","3.91","131.55%","52.80","55.94","89.08%"),
                new CollectionSummaryCustomerModel("India","C&M","CU1M008","Shree Maruthi Associates pvt.Ltd","2.85","3.91","131.55%","52.80","55.94","89.08%"),
                new CollectionSummaryCustomerModel("India","Railways","CU1S008","Modern Hiring Services","2.85","3.91","131.55%","52.80","55.94","89.08%"),
                new CollectionSummaryCustomerModel("India","C&M","CU1B008","UniTrade India","2.85","3.91","131.55%","52.80","55.94","89.08%"),


        };

        RecyclerView recyclerView_customers = (RecyclerView) findViewById(R.id.rv_collection_customer);
        CollectionSummaryCustomerAdapter adapter_customers = new CollectionSummaryCustomerAdapter(collectionSummaryCustomerModels);
        recyclerView_customers.setHasFixedSize(true);
        recyclerView_customers.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_customers.setAdapter(adapter_customers);

    }

    private void initialize()
    {
        rv_collection_customer=findViewById(R.id.rv_collection_customer);
        rv_collection_responsibility=findViewById(R.id.rv_collection_responsibility);
        rv_collection_vertical=findViewById(R.id.rv_collection_vertical);
        rv_Od_Customer_list=findViewById(R.id.rv_Od_Customer_list);
        btn_filterData_dashboard=findViewById(R.id.btn_filterData_dashboard);
        btn_filterData_dashboard.setOnClickListener(this);
        stackedChart=findViewById(R.id.stackedChart);
        //groupChart = findViewById(R.id.groupChart);

        sp_region=findViewById(R.id.sp_region);
        sp_country=findViewById(R.id.sp_country);
        sp_vertical=findViewById(R.id.sp_vertical);
        sp_cluster=findViewById(R.id.sp_cluster);
        sp_sbu=findViewById(R.id.sp_sbu);
        sp_consol_entity=findViewById(R.id.sp_consol_entity);
        sp_ar_Type=findViewById(R.id.sp_ar_Type);

        drawer_layout = findViewById(R.id.drawer_layout_main);
        iv_nav_view = findViewById(R.id.iv_nav_view);
        iv_nav_view.setOnClickListener(this);

        tv_month_endAR=findViewById(R.id.tv_month_endAR);
        tv_current_ar = findViewById(R.id.tv_current_ar);
        tv_collection_summery = findViewById(R.id.tv_collection_summery);
        tv_collection_user = findViewById(R.id.tv_collection_summery_user);
        tv_collection_reports = findViewById(R.id.tv_collection_report);
        tv_current_ar.setOnClickListener(this);
        tv_month_endAR.setOnClickListener(this);
        tv_collection_summery.setOnClickListener(this);
        tv_collection_user.setOnClickListener(this);
        tv_collection_reports.setOnClickListener(this);
        combinedgraphset();
    }

    private void combinedgraphset() {

        chart = findViewById(R.id.groupChart);
        chart.getDescription().setEnabled(false);
        chart.setBackgroundColor(Color.WHITE);
        chart.setDrawGridBackground(false);
        chart.setDrawBarShadow(false);
        chart.setHighlightFullBarEnabled(false);

        // draw bars behind lines
        chart.setDrawOrder(new CombinedChart.DrawOrder[]{
                CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.SCATTER
        });

        Legend l = chart.getLegend();
        l.setWordWrapEnabled(true);
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setDrawInside(false);

        YAxis rightAxis = chart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)

        YAxis leftAxis = chart.getAxisLeft();
        leftAxis.setDrawGridLines(false);
        leftAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)

        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTH_SIDED);
        xAxis.setAxisMinimum(0f);
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);

        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return months[(int) value % months.length];
            }
        });

        CombinedData data = new CombinedData();

        data.setData(generateLineData());
        data.setData(generateBarData());
        //data.setData(generateBubbleData());
        // data.setData(generateScatterData());
        //data.setData(generateCandleData());
        //data.setValueTypeface(tfLight);

        xAxis.setAxisMaximum(data.getXMax() + 0.25f);

        chart.setData(data);
        chart.invalidate();

    }

    // Ar Bar CHart Stacked COde

    private void Stacked()
    {
        BarDataSet barDataSet = new BarDataSet(dataValues1(),"bar Set");
        barDataSet.setColors(colorClassArray);

        barDataSet.setStackLabels(new String[] {"OD", "FTM", "RTN","WRTN","Not Due","Same MTH","Adv."});
        barDataSet.setLabel("");
        BarData barData = new BarData(barDataSet);
        stackedChart.setData(barData);

        stackedChart.setDragEnabled(true);
        stackedChart.setScaleEnabled(false);
        stackedChart.setDrawGridBackground(false);
        stackedChart.setDrawValueAboveBar(false);
        stackedChart.animateXY(2000, 2000);
        stackedChart.getDescription().setEnabled(false);

        XAxis xAxis = stackedChart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return mTitle[(int) value % mTitle.length];
            }
        });

        YAxis leftAxis = stackedChart.getAxisLeft();
        leftAxis.setDrawGridLines(false);
        leftAxis.setAxisMaximum(5000f);
        leftAxis.setAxisMinimum(0f);

        YAxis rightAxis = stackedChart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setDrawLabels(false);
    }

    private ArrayList<BarEntry> dataValues1()
    {
        ArrayList<BarEntry> dataVals = new ArrayList<>();
        dataVals.add(new BarEntry(0,new float[]{297,801,248f,888,566,666,878}));
        dataVals.add(new BarEntry(1,new float[]{197,301,200f,878,506,446,808}));
        dataVals.add(new BarEntry(2,new float[]{207,401,248f,388,406,456,218}));
        dataVals.add(new BarEntry(3,new float[]{397,291,190f,288,306,786,378}));
        return dataVals;

    }



    private ArrayList<BarEntry> barEntries1()
    {
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(0,101));
        barEntries.add(new BarEntry(1,45));
        barEntries.add(new BarEntry(2,70));
        barEntries.add(new BarEntry(3,15));
        barEntries.add(new BarEntry(4,19));
        barEntries.add(new BarEntry(5,5));
        barEntries.add(new BarEntry(6,42));

        return barEntries;
    }

    private ArrayList<BarEntry> barEntries2()
    {
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(0,90));
        barEntries.add(new BarEntry(1,43));
        barEntries.add(new BarEntry(2,15));
        barEntries.add(new BarEntry(3,10));
        barEntries.add(new BarEntry(4,17));
        barEntries.add(new BarEntry(5,8));
        barEntries.add(new BarEntry(6,8));

        return barEntries;
    }

    /////////combined chart


    private LineData generateLineData() {

        LineData d = new LineData();

        ArrayList<Entry> entries = new ArrayList<>();

        for (int index = 0; index < count; index++)
            entries.add(new Entry(index + 0.5f, getRandom(15, 5)));

        LineDataSet set = new LineDataSet(entries, "Line DataSet");
        set.setColor(Color.rgb(126, 252, 252));
        set.setLineWidth(2.5f);
        set.setCircleColor(Color.rgb(126, 252, 252));
        set.setCircleRadius(2f);
        set.setFillColor(Color.rgb(240, 238, 70));
        set.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        set.setDrawValues(true);
        set.setValueTextSize(10f);
        set.setValueTextColor(Color.rgb(240, 238, 70));

        set.setAxisDependency(YAxis.AxisDependency.LEFT);
        d.addDataSet(set);

        return d;
    }

    private BarData generateBarData() {

        ArrayList<BarEntry> entries1 = new ArrayList<>();
        ArrayList<BarEntry> entries2 = new ArrayList<>();


        for (int index = 0; index < count; index++) {
            entries1.add(new BarEntry(0, getRandom(25, 25)));

            // stacked
            entries2.add(new BarEntry(0, new float[]{getRandom(13, 12)}));
        }

        BarDataSet set1 = new BarDataSet(entries1, "Bar 1");
        set1.setColor(Color.rgb(232, 87, 48));
        set1.setValueTextColor(Color.rgb(60, 220, 78));
        set1.setValueTextSize(10f);
        set1.setAxisDependency(YAxis.AxisDependency.LEFT);

        BarDataSet set2 = new BarDataSet(entries2, "");
        set2.setStackLabels(new String[]{"Stack 1", "Stack 2"});
        set2.setColors(Color.rgb(48, 99, 163));
        set2.setValueTextColor(Color.rgb(61, 165, 255));
        set2.setValueTextSize(10f);
        set2.setAxisDependency(YAxis.AxisDependency.LEFT);

        float groupSpace = 1.06f;
        float barSpace = 0.02f; // x2 dataset
        float barWidth = 0.45f; // x2 dataset
        // (0.45 + 0.02) * 2 + 0.06 = 1.00 -> interval per "group"

        BarData d = new BarData(set1, set2);
        d.setBarWidth(barWidth);

        // make this BarData object grouped
        d.groupBars(0, groupSpace, barSpace); // start at x = 0

        return d;
    }


    // Ar Bar CHart COde End

    // Group Bar Chart Starts

    /*private void GroupBarCHart()
    {
        BarDataSet barDataSet1 = new BarDataSet(barEntries1(),"OD Bar Chart");
        barDataSet1.setColor(Color.parseColor("#e8572a"));

        BarDataSet barDataSet2 = new BarDataSet(barEntries2(),"User Collection Plan");
        barDataSet2.setColor(Color.parseColor("#3063a3"));



        BarData data = new BarData(barDataSet1, barDataSet2);
        groupChart.setData(data);

        String[] values = new String[]{"0 To 30","31 TO 60","61 TO 90","91 TO 181","181 To 365","366 TO 730",">731"};
        XAxis xAxis = groupChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(values));
        xAxis.setCenterAxisLabels(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);


        YAxis leftAxis = groupChart.getAxisLeft();

        leftAxis.setAxisMaximum(120f);
        leftAxis.setAxisMinimum(0f);

        YAxis RightAxis = groupChart.getAxisRight();

        RightAxis.setAxisMaximum(35f);
        RightAxis.setAxisMinimum(0f);

        groupChart.setDragEnabled(true);
        groupChart.setVisibleXRangeMaximum(4);

        groupChart.setDragEnabled(true);
        groupChart.setScaleEnabled(false);
        groupChart.animateY(1000);

        float barSpace = 0.02f;
        float groupSpace =0.15f;
        data.setBarWidth(0.40f);

        groupChart.getXAxis().setAxisMaximum(0);
        groupChart.getXAxis().setAxisMaximum(0+groupChart.getBarData().getGroupWidth(groupSpace,barSpace)*7);

        groupChart.groupBars(0,groupSpace,barSpace);
        groupChart.invalidate();

        Description description = new Description();
        description.setText("");
        groupChart.setDescription(description);
    }*/

    protected float getRandom(float range, float start) {
        return (float) (Math.random() * range) + start;
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.iv_nav_view:
                drawer_layout.openDrawer(GravityCompat.START);
                break;
            case R.id.btn_filterData_dashboard:
                openFilterDialog();
                break;
            case R.id.tv_month_endAR:
                Intent intentMonthend = new Intent(MainActivity.this,MonthEndARActivity.class);
                startActivity(intentMonthend);
                break;
            case R.id.tv_current_ar:
                Intent intentMonthend1 = new Intent(MainActivity.this,MonthEndARActivity.class);
                startActivity(intentMonthend1);
                break;
            case R.id.tv_collection_summery:
                Intent intentMonthend2 = new Intent(MainActivity.this,CollectionSummaryActivity.class);
                startActivity(intentMonthend2);
                break;
            case R.id.tv_collection_summery_user:
                Intent intentMonthend3 = new Intent(MainActivity.this,CollectionSummaryActivity.class);
                startActivity(intentMonthend3);
                break;
            case R.id.tv_collection_report:
                Intent intentMonthend4 = new Intent(MainActivity.this,MonthEndARActivity.class);
                startActivity(intentMonthend4);
                break;
        }
    }

    private void openFilterDialog() {
        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.filter_data_dashboard);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();



    }

    private AdapterView.OnItemSelectedListener OnCatSpinnerCL = new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
            ((TextView) parent.getChildAt(0)).setTextSize(12);

        }

        public void onNothingSelected(AdapterView<?> parent) {
            ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
            ((TextView) parent.getChildAt(0)).setTextSize(12);
        }
    };
}