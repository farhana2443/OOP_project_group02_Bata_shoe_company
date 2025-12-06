package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG5ReturnsFxml
{
    @javafx.fxml.FXML
    private TableColumn productTC;
    @javafx.fxml.FXML
    private ComboBox conditionStatusCB;
    @javafx.fxml.FXML
    private TableView returnProcessingTV;
    @javafx.fxml.FXML
    private TextField orderIDTF;
    @javafx.fxml.FXML
    private TableColumn conditionTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn returnReasonTC;
    @javafx.fxml.FXML
    private TableColumn orderIDTC;
    @javafx.fxml.FXML
    private TableColumn quantityTC;

    public TableColumn getProductTC() {
        return productTC;
    }

    @Override
    public String toString() {
        return "RMG5ReturnsFxml{" +
                "productTC=" + productTC +
                ", conditionStatusCB=" + conditionStatusCB +
                ", returnProcessingTV=" + returnProcessingTV +
                ", orderIDTF=" + orderIDTF +
                ", conditionTC=" + conditionTC +
                ", statusTC=" + statusTC +
                ", returnReasonTC=" + returnReasonTC +
                ", orderIDTC=" + orderIDTC +
                ", quantityTC=" + quantityTC +
                ", commentTA=" + commentTA +
                ", messageLab=" + messageLab +
                '}';
    }

    public void setProductTC(TableColumn productTC) {
        this.productTC = productTC;
    }

    public ComboBox getConditionStatusCB() {
        return conditionStatusCB;
    }

    public void setConditionStatusCB(ComboBox conditionStatusCB) {
        this.conditionStatusCB = conditionStatusCB;
    }

    public TableView getReturnProcessingTV() {
        return returnProcessingTV;
    }

    public void setReturnProcessingTV(TableView returnProcessingTV) {
        this.returnProcessingTV = returnProcessingTV;
    }

    public TextField getOrderIDTF() {
        return orderIDTF;
    }

    public void setOrderIDTF(TextField orderIDTF) {
        this.orderIDTF = orderIDTF;
    }

    public TableColumn getConditionTC() {
        return conditionTC;
    }

    public void setConditionTC(TableColumn conditionTC) {
        this.conditionTC = conditionTC;
    }

    public TableColumn getStatusTC() {
        return statusTC;
    }

    public void setStatusTC(TableColumn statusTC) {
        this.statusTC = statusTC;
    }

    public TableColumn getReturnReasonTC() {
        return returnReasonTC;
    }

    public void setReturnReasonTC(TableColumn returnReasonTC) {
        this.returnReasonTC = returnReasonTC;
    }

    public TableColumn getOrderIDTC() {
        return orderIDTC;
    }

    public void setOrderIDTC(TableColumn orderIDTC) {
        this.orderIDTC = orderIDTC;
    }

    public TableColumn getQuantityTC() {
        return quantityTC;
    }

    public void setQuantityTC(TableColumn quantityTC) {
        this.quantityTC = quantityTC;
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

    public RMG5ReturnsFxml(TableColumn productTC, ComboBox conditionStatusCB, TableView returnProcessingTV, TextField orderIDTF, TableColumn conditionTC, TableColumn statusTC, TableColumn returnReasonTC, TableColumn orderIDTC, TableColumn quantityTC, TextArea commentTA, Label messageLab) {
        this.productTC = productTC;
        this.conditionStatusCB = conditionStatusCB;
        this.returnProcessingTV = returnProcessingTV;
        this.orderIDTF = orderIDTF;
        this.conditionTC = conditionTC;
        this.statusTC = statusTC;
        this.returnReasonTC = returnReasonTC;
        this.orderIDTC = orderIDTC;
        this.quantityTC = quantityTC;
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
    public void updateAndApproveReturnProcessingTable(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateAndDeclineReturnProcessingTable(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterOrderItemsOnTheTable(ActionEvent actionEvent) {
    }
}