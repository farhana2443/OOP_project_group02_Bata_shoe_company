package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import java.time.LocalDate;

public class DeliveryTracking {
    private String deliveryStatus,supplierName,materialType,status;
    private int receivedQua,deliveryId;
    private LocalDate actualDeliveryDate,expDate;

    public DeliveryTracking(String deliveryStatus, String supplierName, String materialType, String status, int receivedQua, int deliveryId, LocalDate actualDeliveryDate, LocalDate expDate) {
        this.deliveryStatus = deliveryStatus;
        this.supplierName = supplierName;
        this.materialType = materialType;
        this.status = status;
        this.receivedQua = receivedQua;
        this.deliveryId = deliveryId;
        this.actualDeliveryDate = actualDeliveryDate;
        this.expDate = expDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getReceivedQua() {
        return receivedQua;
    }

    public void setReceivedQua(int receivedQua) {
        this.receivedQua = receivedQua;
    }

    public LocalDate getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(LocalDate actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "DeliveryTracking{" +
                "deliveryStatus='" + deliveryStatus + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", materialType='" + materialType + '\'' +
                ", status='" + status + '\'' +
                ", receivedQua=" + receivedQua +
                ", deliveryId=" + deliveryId +
                ", actualDeliveryDate=" + actualDeliveryDate +
                ", expDate=" + expDate +
                '}';
    }
}
