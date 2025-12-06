package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import java.time.LocalDate;

public class InvoiceProcessing {
    private int invoiceNum,amount,deliveryQun;
    private LocalDate paymentDueDate, deliveryDate;
    private String deliveryId,paymentTerms,supplierName, materialType;

    public InvoiceProcessing(int invoiceNum, int amount, int deliveryQun, LocalDate paymentDueDate, LocalDate deliveryDate, String deliveryId, String paymentTerms, String supplierName, String materialType) {
        this.invoiceNum = invoiceNum;
        this.amount = amount;
        this.deliveryQun = deliveryQun;
        this.paymentDueDate = paymentDueDate;
        this.deliveryDate = deliveryDate;
        this.deliveryId = deliveryId;
        this.paymentTerms = paymentTerms;
        this.supplierName = supplierName;
        this.materialType = materialType;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDeliveryQun() {
        return deliveryQun;
    }

    public void setDeliveryQun(int deliveryQun) {
        this.deliveryQun = deliveryQun;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(LocalDate paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
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

    @Override
    public String toString() {
        return "InvoiceProcessing{" +
                "invoiceNum=" + invoiceNum +
                ", amount=" + amount +
                ", deliveryQun=" + deliveryQun +
                ", paymentDueDate=" + paymentDueDate +
                ", deliveryDate=" + deliveryDate +
                ", deliveryId='" + deliveryId + '\'' +
                ", paymentTerms='" + paymentTerms + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", materialType='" + materialType + '\'' +
                '}';
    }
}
