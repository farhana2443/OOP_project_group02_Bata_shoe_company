package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG4Inventory
{
    @javafx.fxml.FXML
    private TableView inventoryTV;
    @javafx.fxml.FXML
    private TableColumn reorderLevelTC;
    @javafx.fxml.FXML
    private TableColumn nameTC;
    @javafx.fxml.FXML
    private TableColumn productIDTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn categoryTC;
    @javafx.fxml.FXML
    private TableColumn currentStockTC;
    @javafx.fxml.FXML
    private TextField productIDTF;
    @javafx.fxml.FXML
    private TextField restockQuantityTF;

    public TableView getInventoryTV() {
        return inventoryTV;
    }

    @Override
    public String toString() {
        return "RMG4Inventory{" +
                "inventoryTV=" + inventoryTV +
                ", reorderLevelTC=" + reorderLevelTC +
                ", nameTC=" + nameTC +
                ", productIDTC=" + productIDTC +
                ", statusTC=" + statusTC +
                ", categoryTC=" + categoryTC +
                ", currentStockTC=" + currentStockTC +
                ", productIDTF=" + productIDTF +
                ", restockQuantityTF=" + restockQuantityTF +
                ", commentTA=" + commentTA +
                ", messageLab=" + messageLab +
                '}';
    }

    public void setInventoryTV(TableView inventoryTV) {
        this.inventoryTV = inventoryTV;
    }

    public TableColumn getReorderLevelTC() {
        return reorderLevelTC;
    }

    public void setReorderLevelTC(TableColumn reorderLevelTC) {
        this.reorderLevelTC = reorderLevelTC;
    }

    public TableColumn getNameTC() {
        return nameTC;
    }

    public void setNameTC(TableColumn nameTC) {
        this.nameTC = nameTC;
    }

    public TableColumn getProductIDTC() {
        return productIDTC;
    }

    public void setProductIDTC(TableColumn productIDTC) {
        this.productIDTC = productIDTC;
    }

    public TableColumn getStatusTC() {
        return statusTC;
    }

    public void setStatusTC(TableColumn statusTC) {
        this.statusTC = statusTC;
    }

    public TableColumn getCategoryTC() {
        return categoryTC;
    }

    public void setCategoryTC(TableColumn categoryTC) {
        this.categoryTC = categoryTC;
    }

    public TableColumn getCurrentStockTC() {
        return currentStockTC;
    }

    public void setCurrentStockTC(TableColumn currentStockTC) {
        this.currentStockTC = currentStockTC;
    }

    public TextField getProductIDTF() {
        return productIDTF;
    }

    public void setProductIDTF(TextField productIDTF) {
        this.productIDTF = productIDTF;
    }

    public TextField getRestockQuantityTF() {
        return restockQuantityTF;
    }

    public void setRestockQuantityTF(TextField restockQuantityTF) {
        this.restockQuantityTF = restockQuantityTF;
    }

    public TextArea getCommentTA() {
        return commentTA;
    }

    public void setCommentTA(TextArea commentTA) {
        this.commentTA = commentTA;
    }

    public Label getMessageLab() {
        return messageLab;
    }

    public void setMessageLab(Label messageLab) {
        this.messageLab = messageLab;
    }

    public RMG4Inventory(TableView inventoryTV, TableColumn reorderLevelTC, TableColumn nameTC, TableColumn productIDTC, TableColumn statusTC, TableColumn categoryTC, TableColumn currentStockTC, TextField productIDTF, TextField restockQuantityTF, TextArea commentTA, Label messageLab) {
        this.inventoryTV = inventoryTV;
        this.reorderLevelTC = reorderLevelTC;
        this.nameTC = nameTC;
        this.productIDTC = productIDTC;
        this.statusTC = statusTC;
        this.categoryTC = categoryTC;
        this.currentStockTC = currentStockTC;
        this.productIDTF = productIDTF;
        this.restockQuantityTF = restockQuantityTF;
        this.commentTA = commentTA;
        this.messageLab = messageLab;
    }

    @javafx.fxml.FXML
    private TextArea commentTA;
    @javafx.fxml.FXML
    private Label messageLab;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendNotificationToTheInventoryOfficer(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateStatusOnInventoryTable(ActionEvent actionEvent) {
    }
}