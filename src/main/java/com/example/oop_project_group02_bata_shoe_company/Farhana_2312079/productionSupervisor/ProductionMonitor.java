package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

public class ProductionMonitor {
    private String batchID, shoeModel,status,notes;
    private int targetQua,completedQua;
    private double progress;

    private String supplierName;

    public ProductionMonitor(String batchID, String shoeModel, String status, String notes, int targetQua, int completedQua, double progress, String supplierName) {
        this.batchID = batchID;
        this.shoeModel = shoeModel;
        this.status = status;
        this.notes = notes;
        this.targetQua = targetQua;
        this.completedQua = completedQua;
        this.progress = progress;
        this.supplierName = supplierName;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public void setShoeModel(String shoeModel) {
        this.shoeModel = shoeModel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTargetQua() {
        return targetQua;
    }

    public void setTargetQua(int targetQua) {
        this.targetQua = targetQua;
    }

    public int getCompletedQua() {
        return completedQua;
    }

    public void setCompletedQua(int completedQua) {
        this.completedQua = completedQua;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "ProductionMonitor{" +
                "batchID='" + batchID + '\'' +
                ", shoeModel='" + shoeModel + '\'' +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                ", targetQua=" + targetQua +
                ", completedQua=" + completedQua +
                ", progress=" + progress +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}


