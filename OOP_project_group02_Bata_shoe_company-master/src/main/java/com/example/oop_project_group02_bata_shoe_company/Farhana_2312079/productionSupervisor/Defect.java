package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

public class Defect {
    private String batchId, defectType,description;
    private int quanDefective;

    public Defect(String batchId, String defectType, String description, int quanDefective) {
        this.batchId = batchId;
        this.defectType = defectType;
        this.description = description;
        this.quanDefective = quanDefective;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuanDefective() {
        return quanDefective;
    }

    public void setQuanDefective(int quanDefective) {
        this.quanDefective = quanDefective;
    }

    @Override
    public String toString() {
        return "Defect{" +
                "batchId='" + batchId + '\'' +
                ", defectType='" + defectType + '\'' +
                ", description='" + description + '\'' +
                ", quanDefective=" + quanDefective +
                '}';
    }
}
