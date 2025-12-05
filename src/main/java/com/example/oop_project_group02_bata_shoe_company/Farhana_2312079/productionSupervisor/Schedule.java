package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import java.time.LocalDate;

public class Schedule {
    private String shoeModel, shift;
    private int targetQua;
    private LocalDate productionDate;

    public Schedule(String shoeModel, String shift, int targetQua, LocalDate productionDate) {
        this.shoeModel = shoeModel;
        this.shift = shift;
        this.targetQua = targetQua;
        this.productionDate = productionDate;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public void setShoeModel(String shoeModel) {
        this.shoeModel = shoeModel;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getTargetQua() {
        return targetQua;
    }

    public void setTargetQua(int targetQua) {
        this.targetQua = targetQua;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "shoeModel='" + shoeModel + '\'' +
                ", shift='" + shift + '\'' +
                ", targetQua=" + targetQua +
                ", productionDate=" + productionDate +
                '}';
    }
}
