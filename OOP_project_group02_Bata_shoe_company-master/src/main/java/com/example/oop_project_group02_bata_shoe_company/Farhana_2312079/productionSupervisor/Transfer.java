package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import java.time.LocalDate;

public class Transfer {
    private String batchId,shoeModel,transferStatus,notes;
    private int quantity;
    private LocalDate completionDate,transferDate;

    public Transfer(String batchId, String shoeModel, String notes, String transferStatus, int quantity, LocalDate completionDate, LocalDate transferDate) {
        this.batchId = batchId;
        this.shoeModel = shoeModel;
        this.notes = notes;
        this.transferStatus = transferStatus;
        this.quantity = quantity;
        this.completionDate = completionDate;
        this.transferDate = transferDate;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getShoeModel() {
        return shoeModel;
    }

    public void setShoeModel(String shoeModel) {
        this.shoeModel = shoeModel;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "batchId='" + batchId + '\'' +
                ", shoeModel='" + shoeModel + '\'' +
                ", transferStatus='" + transferStatus + '\'' +
                ", notes='" + notes + '\'' +
                ", quantity=" + quantity +
                ", completionDate=" + completionDate +
                ", transferDate=" + transferDate +
                '}';
    }
}
