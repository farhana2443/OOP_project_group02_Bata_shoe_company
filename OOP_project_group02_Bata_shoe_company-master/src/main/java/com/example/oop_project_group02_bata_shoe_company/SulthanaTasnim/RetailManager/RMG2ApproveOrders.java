package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG2ApproveOrders
{
    @Override
    public String toString() {
        return "RMG2ApproveOrders{" +
                "orderDetailsTxtArea=" + orderDetailsTxtArea +
                ", orderStatusTC=" + orderStatusTC +
                ", orderIDTF=" + orderIDTF +
                ", orderStatusTV=" + orderStatusTV +
                ", orderStatusOB=" + orderStatusOB +
                ", orderIDTC=" + orderIDTC +
                ", DateTC=" + DateTC +
                ", stockStatusTC=" + stockStatusTC +
                ", orderApproveOrRejectOB=" + orderApproveOrRejectOB +
                ", paymentStatusTC=" + paymentStatusTC +
                '}';
    }

    public TextArea getOrderDetailsTxtArea() {
        return orderDetailsTxtArea;
    }

    public void setOrderDetailsTxtArea(TextArea orderDetailsTxtArea) {
        this.orderDetailsTxtArea = orderDetailsTxtArea;
    }

    public TableColumn getOrderStatusTC() {
        return orderStatusTC;
    }

    public void setOrderStatusTC(TableColumn orderStatusTC) {
        this.orderStatusTC = orderStatusTC;
    }

    public TableView getOrderStatusTV() {
        return orderStatusTV;
    }

    public void setOrderStatusTV(TableView orderStatusTV) {
        this.orderStatusTV = orderStatusTV;
    }

    public TextField getOrderIDTF() {
        return orderIDTF;
    }

    public void setOrderIDTF(TextField orderIDTF) {
        this.orderIDTF = orderIDTF;
    }

    public ComboBox getOrderStatusOB() {
        return orderStatusOB;
    }

    public void setOrderStatusOB(ComboBox orderStatusOB) {
        this.orderStatusOB = orderStatusOB;
    }

    public TableColumn getOrderIDTC() {
        return orderIDTC;
    }

    public void setOrderIDTC(TableColumn orderIDTC) {
        this.orderIDTC = orderIDTC;
    }

    public TableColumn getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn dateTC) {
        DateTC = dateTC;
    }

    public TableColumn getStockStatusTC() {
        return stockStatusTC;
    }

    public void setStockStatusTC(TableColumn stockStatusTC) {
        this.stockStatusTC = stockStatusTC;
    }

    public ComboBox getOrderApproveOrRejectOB() {
        return orderApproveOrRejectOB;
    }

    public void setOrderApproveOrRejectOB(ComboBox orderApproveOrRejectOB) {
        this.orderApproveOrRejectOB = orderApproveOrRejectOB;
    }

    public TableColumn getPaymentStatusTC() {
        return paymentStatusTC;
    }

    public void setPaymentStatusTC(TableColumn paymentStatusTC) {
        this.paymentStatusTC = paymentStatusTC;
    }

    public RMG2ApproveOrders(TextArea orderDetailsTxtArea, TableColumn orderStatusTC, TextField orderIDTF, TableView orderStatusTV, ComboBox orderStatusOB, TableColumn orderIDTC, TableColumn dateTC, TableColumn stockStatusTC, ComboBox orderApproveOrRejectOB, TableColumn paymentStatusTC) {
        this.orderDetailsTxtArea = orderDetailsTxtArea;
        this.orderStatusTC = orderStatusTC;
        this.orderIDTF = orderIDTF;
        this.orderStatusTV = orderStatusTV;
        this.orderStatusOB = orderStatusOB;
        this.orderIDTC = orderIDTC;
        DateTC = dateTC;
        this.stockStatusTC = stockStatusTC;
        this.orderApproveOrRejectOB = orderApproveOrRejectOB;
        this.paymentStatusTC = paymentStatusTC;
    }

    @javafx.fxml.FXML
    private TextArea orderDetailsTxtArea;
    @javafx.fxml.FXML
    private TableColumn orderStatusTC;
    @javafx.fxml.FXML
    private TextField orderIDTF;
    @javafx.fxml.FXML
    private TableView orderStatusTV;
    @javafx.fxml.FXML
    private ComboBox orderStatusOB;
    @javafx.fxml.FXML
    private TableColumn orderIDTC;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TableColumn stockStatusTC;
    @javafx.fxml.FXML
    private ComboBox orderApproveOrRejectOB;
    @javafx.fxml.FXML
    private TableColumn paymentStatusTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateOrderStatusOnOrderStatusTable(ActionEvent actionEvent) {
    }
}