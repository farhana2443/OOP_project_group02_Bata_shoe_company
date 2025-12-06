package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG2SearchModel
{
    @javafx.fxml.FXML
    private TableColumn priceTC;
    @javafx.fxml.FXML
    private TableColumn productNameTC;
    @javafx.fxml.FXML
    private TextField productNameTF;
    @javafx.fxml.FXML
    private TableColumn categoryTC;
    @javafx.fxml.FXML
    private TableColumn availabilityTC;
    @javafx.fxml.FXML
    private TableColumn productCodeTC;
    @javafx.fxml.FXML
    private TableView productTV;

    @Override
    public String toString() {
        return "CUG2SearchModel{" +
                "priceTC=" + priceTC +
                ", productNameTC=" + productNameTC +
                ", productNameTF=" + productNameTF +
                ", categoryTC=" + categoryTC +
                ", availabilityTC=" + availabilityTC +
                ", productCodeTC=" + productCodeTC +
                ", productTV=" + productTV +
                ", messageLab=" + messageLab +
                '}';
    }

    public TableColumn getPriceTC() {
        return priceTC;
    }

    public void setPriceTC(TableColumn priceTC) {
        this.priceTC = priceTC;
    }

    public TableColumn getProductNameTC() {
        return productNameTC;
    }

    public void setProductNameTC(TableColumn productNameTC) {
        this.productNameTC = productNameTC;
    }

    public TextField getProductNameTF() {
        return productNameTF;
    }

    public void setProductNameTF(TextField productNameTF) {
        this.productNameTF = productNameTF;
    }

    public TableColumn getCategoryTC() {
        return categoryTC;
    }

    public void setCategoryTC(TableColumn categoryTC) {
        this.categoryTC = categoryTC;
    }

    public TableColumn getAvailabilityTC() {
        return availabilityTC;
    }

    public void setAvailabilityTC(TableColumn availabilityTC) {
        this.availabilityTC = availabilityTC;
    }

    public TableColumn getProductCodeTC() {
        return productCodeTC;
    }

    public void setProductCodeTC(TableColumn productCodeTC) {
        this.productCodeTC = productCodeTC;
    }

    public TableView getProductTV() {
        return productTV;
    }

    public void setProductTV(TableView productTV) {
        this.productTV = productTV;
    }

    public Label getMessageLab() {
        return messageLab;
    }

    public void setMessageLab(Label messageLab) {
        this.messageLab = messageLab;
    }

    public CUG2SearchModel(TableColumn priceTC, TableColumn productNameTC, TextField productNameTF, TableColumn categoryTC, TableColumn availabilityTC, TableColumn productCodeTC, TableView productTV, Label messageLab) {
        this.priceTC = priceTC;
        this.productNameTC = productNameTC;
        this.productNameTF = productNameTF;
        this.categoryTC = categoryTC;
        this.availabilityTC = availabilityTC;
        this.productCodeTC = productCodeTC;
        this.productTV = productTV;
        this.messageLab = messageLab;
    }

    @javafx.fxml.FXML
    private Label messageLab;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openProductDetailsPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchandFiltertheItemontheTable(ActionEvent actionEvent) {
    }
}