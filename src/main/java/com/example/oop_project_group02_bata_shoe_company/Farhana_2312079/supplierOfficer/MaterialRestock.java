package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

public class MaterialRestock {
    private String thresholdLevel,materialName,status,checkbox;
    private int upthresholdLevel,restockQun,currentQun;

    public MaterialRestock(String thresholdLevel, String materialName, String status, String checkbox, int upthresholdLevel, int restockQun, int currentQun) {
        this.thresholdLevel = thresholdLevel;
        this.materialName = materialName;
        this.status = status;
        this.checkbox = checkbox;
        this.upthresholdLevel = upthresholdLevel;
        this.restockQun = restockQun;
        this.currentQun = currentQun;
    }

    public String getThresholdLevel() {
        return thresholdLevel;
    }

    public void setThresholdLevel(String thresholdLevel) {
        this.thresholdLevel = thresholdLevel;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }

    public int getUpthresholdLevel() {
        return upthresholdLevel;
    }

    public void setUpthresholdLevel(int upthresholdLevel) {
        this.upthresholdLevel = upthresholdLevel;
    }

    public int getRestockQun() {
        return restockQun;
    }

    public void setRestockQun(int restockQun) {
        this.restockQun = restockQun;
    }

    public int getCurrentQun() {
        return currentQun;
    }

    public void setCurrentQun(int currentQun) {
        this.currentQun = currentQun;
    }

    @Override
    public String toString() {
        return "MaterialRestock{" +
                "thresholdLevel='" + thresholdLevel + '\'' +
                ", materialName='" + materialName + '\'' +
                ", status='" + status + '\'' +
                ", checkbox='" + checkbox + '\'' +
                ", upthresholdLevel=" + upthresholdLevel +
                ", restockQun=" + restockQun +
                ", currentQun=" + currentQun +
                '}';
    }
}
