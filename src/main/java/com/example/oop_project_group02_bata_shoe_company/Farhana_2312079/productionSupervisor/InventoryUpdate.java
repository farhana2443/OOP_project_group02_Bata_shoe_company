package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

public class InventoryUpdate {
    private String batchID,shoeModel,qualityStatus,warehouseLocation;
    private int quantityProduced,finalQuantity;

    public InventoryUpdate(String batchID, String shoeModel, String qualityStatus, String warehouseLocation, int quantityProduced, int finalQuantity) {
        this.batchID = batchID;
        this.shoeModel = shoeModel;
        this.qualityStatus = qualityStatus;
        this.warehouseLocation = warehouseLocation;
        this.quantityProduced = quantityProduced;
        this.finalQuantity = finalQuantity;
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

    public String getQualityStatus() {
        return qualityStatus;
    }

    public void setQualityStatus(String qualityStatus) {
        this.qualityStatus = qualityStatus;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public int getQuantityProduced() {
        return quantityProduced;
    }

    public void setQuantityProduced(int quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public int getFinalQuantity() {
        return finalQuantity;
    }

    public void setFinalQuantity(int finalQuantity) {
        this.finalQuantity = finalQuantity;
    }

    @Override
    public String toString() {
        return "InventoryUpdate{" +
                "batchID='" + batchID + '\'' +
                ", shoeModel='" + shoeModel + '\'' +
                ", qualityStatus='" + qualityStatus + '\'' +
                ", warehouseLocation='" + warehouseLocation + '\'' +
                ", quantityProduced=" + quantityProduced +
                ", finalQuantity=" + finalQuantity +
                '}';
    }
}
