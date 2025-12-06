package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

public class Waste {
    private String materialType,wasteReason,shift,notes;
    private int wasteQuan;

    public Waste(String materialType, String wasteReason, String shift, String notes, int wasteQuan) {
        this.materialType = materialType;
        this.wasteReason = wasteReason;
        this.shift = shift;
        this.notes = notes;
        this.wasteQuan = wasteQuan;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getWasteReason() {
        return wasteReason;
    }

    public void setWasteReason(String wasteReason) {
        this.wasteReason = wasteReason;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getWasteQuan() {
        return wasteQuan;
    }

    public void setWasteQuan(int wasteQuan) {
        this.wasteQuan = wasteQuan;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "materialType='" + materialType + '\'' +
                ", wasteReason='" + wasteReason + '\'' +
                ", shift='" + shift + '\'' +
                ", notes='" + notes + '\'' +
                ", wasteQuan=" + wasteQuan +
                '}';
    }
}
