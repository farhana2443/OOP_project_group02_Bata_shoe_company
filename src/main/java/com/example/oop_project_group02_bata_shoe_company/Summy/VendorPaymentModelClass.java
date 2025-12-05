package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.io.Serializable;
import java.time.LocalDate;

public class VendorPaymentModelClass implements Serializable {

    private static final long serialVersionUID = 1L;
    private String invoiceId;
    private double amount;
    private LocalDate dueDate;
    private String reference;

    public VendorPaymentModelClass() { }

    public VendorPaymentModelClass(String invoiceId, double amount, LocalDate dueDate, String reference) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.reference = reference;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "VendorPaymentModelClass{" +
                "invoiceId='" + invoiceId + '\'' +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", reference='" + reference + '\'' +
                '}';
    }
}
