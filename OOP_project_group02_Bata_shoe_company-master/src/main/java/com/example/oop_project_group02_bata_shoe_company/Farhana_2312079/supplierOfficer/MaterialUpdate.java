package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

public class MaterialUpdate {
    private String materialType,warehouseLocation;
    private int qunAvailable;

    public MaterialUpdate(String materialType, String warehouseLocation, int qunAvailable) {
        this.materialType = materialType;
        this.warehouseLocation = warehouseLocation;
        this.qunAvailable = qunAvailable;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public int getQunAvailable() {
        return qunAvailable;
    }

    public void setQunAvailable(int qunAvailable) {
        this.qunAvailable = qunAvailable;
    }

    @Override
    public String toString() {
        return "MaterialUpdate{" +
                "materialType='" + materialType + '\'' +
                ", warehouseLocation='" + warehouseLocation + '\'' +
                ", qunAvailable=" + qunAvailable +
                '}';
    }
}
