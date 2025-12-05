package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

public class SupplierPerformance {
    private String supplierName;
    private int totalOrders, onTimeDeliveries;
    private double performance;

    public SupplierPerformance(String supplierName, int totalOrders, double performance, int onTimeDeliveries) {
        this.supplierName = supplierName;
        this.totalOrders = totalOrders;
        this.performance = performance;
        this.onTimeDeliveries = onTimeDeliveries;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public int getOnTimeDeliveries() {
        return onTimeDeliveries;
    }

    public void setOnTimeDeliveries(int onTimeDeliveries) {
        this.onTimeDeliveries = onTimeDeliveries;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "SupplierPerformance{" +
                "supplierName='" + supplierName + '\'' +
                ", totalOrders=" + totalOrders +
                ", onTimeDeliveries=" + onTimeDeliveries +
                ", performance=" + performance +
                '}';
    }
}
