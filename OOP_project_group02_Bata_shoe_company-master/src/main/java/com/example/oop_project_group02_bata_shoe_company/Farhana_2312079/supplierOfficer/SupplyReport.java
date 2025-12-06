package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

public class SupplyReport {
    private String reportMonth, reportType,materialType,supplier,deliveryStatus;
    private int reportYear,numOfOrders,count;
    private Double spendingAmount;

    public SupplyReport(String reportMonth, String reportType, String materialType, String supplier, String deliveryStatus, int reportYear, int numOfOrders, int count, Double spendingAmount) {
        this.reportMonth = reportMonth;
        this.reportType = reportType;
        this.materialType = materialType;
        this.supplier = supplier;
        this.deliveryStatus = deliveryStatus;
        this.reportYear = reportYear;
        this.numOfOrders = numOfOrders;
        this.count = count;
        this.spendingAmount = spendingAmount;
    }

    public String getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(String reportMonth) {
        this.reportMonth = reportMonth;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public int getReportYear() {
        return reportYear;
    }

    public void setReportYear(int reportYear) {
        this.reportYear = reportYear;
    }

    public int getNumOfOrders() {
        return numOfOrders;
    }

    public void setNumOfOrders(int numOfOrders) {
        this.numOfOrders = numOfOrders;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getSpendingAmount() {
        return spendingAmount;
    }

    public void setSpendingAmount(Double spendingAmount) {
        this.spendingAmount = spendingAmount;
    }

    @Override
    public String toString() {
        return "SupplyReport{" +
                "reportMonth='" + reportMonth + '\'' +
                ", reportType='" + reportType + '\'' +
                ", materialType='" + materialType + '\'' +
                ", supplier='" + supplier + '\'' +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", reportYear=" + reportYear +
                ", numOfOrders=" + numOfOrders +
                ", count=" + count +
                ", spendingAmount=" + spendingAmount +
                '}';
    }
}
