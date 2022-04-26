package com.proteam.elgi.Model;

public class MonthEndArModel {

    String Consol, center ,Cluster, Vertical, Country, Ar_Type, Console, Area, Region, DPST, Org_TT, Month, Sales_Engg_Name;

    public MonthEndArModel(String consol, String center, String cluster, String vertical, String country, String ar_Type, String console, String area, String region, String DPST, String org_TT, String month, String sales_Engg_Name) {
        Consol = consol;
        this.center = center;
        Cluster = cluster;
        Vertical = vertical;
        Country = country;
        Ar_Type = ar_Type;
        Console = console;
        Area = area;
        Region = region;
        this.DPST = DPST;
        Org_TT = org_TT;
        Month = month;
        Sales_Engg_Name = sales_Engg_Name;
    }

    public String getConsol() {
        return Consol;
    }

    public void setConsol(String consol) {
        Consol = consol;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getCluster() {
        return Cluster;
    }

    public void setCluster(String cluster) {
        Cluster = cluster;
    }

    public String getVertical() {
        return Vertical;
    }

    public void setVertical(String vertical) {
        Vertical = vertical;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAr_Type() {
        return Ar_Type;
    }

    public void setAr_Type(String ar_Type) {
        Ar_Type = ar_Type;
    }

    public String getConsole() {
        return Console;
    }

    public void setConsole(String console) {
        Console = console;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getDPST() {
        return DPST;
    }

    public void setDPST(String DPST) {
        this.DPST = DPST;
    }

    public String getOrg_TT() {
        return Org_TT;
    }

    public void setOrg_TT(String org_TT) {
        Org_TT = org_TT;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getSales_Engg_Name() {
        return Sales_Engg_Name;
    }

    public void setSales_Engg_Name(String sales_Engg_Name) {
        Sales_Engg_Name = sales_Engg_Name;
    }
}
