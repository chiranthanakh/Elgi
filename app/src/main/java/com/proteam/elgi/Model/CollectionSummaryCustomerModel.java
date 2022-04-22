package com.proteam.elgi.Model;

public class CollectionSummaryCustomerModel {

    private String cluster_customer,vertical_customer,childCode_customer,custName_customer,
            EntCollection_customer,odFtmPlan_customer,coverage_customer,totalPlan_customer,
            totalCollection_customer,achievement_customer;


    public CollectionSummaryCustomerModel(String cluster_customer, String vertical_customer, String childCode_customer, String custName_customer, String entCollection_customer, String odFtmPlan_customer, String coverage_customer, String totalPlan_customer, String totalCollection_customer, String achievement_customer) {
        this.cluster_customer = cluster_customer;
        this.vertical_customer = vertical_customer;
        this.childCode_customer = childCode_customer;
        this.custName_customer = custName_customer;
        this.EntCollection_customer = entCollection_customer;
        this.odFtmPlan_customer = odFtmPlan_customer;
        this.coverage_customer = coverage_customer;
        this.totalPlan_customer = totalPlan_customer;
        this.totalCollection_customer = totalCollection_customer;
        this.achievement_customer = achievement_customer;
    }

    public String getCluster_customer() {
        return cluster_customer;
    }

    public void setCluster_customer(String cluster_customer) {
        this.cluster_customer = cluster_customer;
    }

    public String getVertical_customer() {
        return vertical_customer;
    }

    public void setVertical_customer(String vertical_customer) {
        this.vertical_customer = vertical_customer;
    }

    public String getChildCode_customer() {
        return childCode_customer;
    }

    public void setChildCode_customer(String childCode_customer) {
        this.childCode_customer = childCode_customer;
    }

    public String getCustName_customer() {
        return custName_customer;
    }

    public void setCustName_customer(String custName_customer) {
        this.custName_customer = custName_customer;
    }

    public String getEntCollection_customer() {
        return EntCollection_customer;
    }

    public void setEntCollection_customer(String entCollection_customer) {
        EntCollection_customer = entCollection_customer;
    }

    public String getOdFtmPlan_customer() {
        return odFtmPlan_customer;
    }

    public void setOdFtmPlan_customer(String odFtmPlan_customer) {
        this.odFtmPlan_customer = odFtmPlan_customer;
    }

    public String getCoverage_customer() {
        return coverage_customer;
    }

    public void setCoverage_customer(String coverage_customer) {
        this.coverage_customer = coverage_customer;
    }

    public String getTotalPlan_customer() {
        return totalPlan_customer;
    }

    public void setTotalPlan_customer(String totalPlan_customer) {
        this.totalPlan_customer = totalPlan_customer;
    }

    public String getTotalCollection_customer() {
        return totalCollection_customer;
    }

    public void setTotalCollection_customer(String totalCollection_customer) {
        this.totalCollection_customer = totalCollection_customer;
    }

    public String getAchievement_customer() {
        return achievement_customer;
    }

    public void setAchievement_customer(String achievement_customer) {
        this.achievement_customer = achievement_customer;
    }
}
