package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import java.time.LocalDate;

public class PurchaseOrder {
    private String materialType, supplierName;
    private int quantity;
    private LocalDate expDeliveryDate;

    public PurchaseOrder(String materialType, String supplierName, LocalDate expDeliveryDate, int quantity) {
        this.materialType = materialType;
        this.supplierName = supplierName;
        this.expDeliveryDate = expDeliveryDate;
        this.quantity = quantity;
    }

    public String getMaterialType() {

        return materialType;
    }

    public void setMaterialType(String materialType) {

        this.materialType = materialType;
    }

    public String getSupplierName() {

        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpDeliveryDate() {
        return expDeliveryDate;
    }

    public void setExpDeliveryDate(LocalDate expDeliveryDate) {
        this.expDeliveryDate = expDeliveryDate;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "materialType='" + materialType + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", quantity=" + quantity +
                ", expDeliveryDate=" + expDeliveryDate +
                '}';
    }
}