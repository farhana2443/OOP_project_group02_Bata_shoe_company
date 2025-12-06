package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG3DiscountOverride
{
    @javafx.fxml.FXML
    private TableColumn productTC;
    @javafx.fxml.FXML
    private TextArea managerCommentTA;
    @javafx.fxml.FXML
    private Label notificationMessagesLab;
    @javafx.fxml.FXML
    private TableColumn requestedPriceTC;
    @javafx.fxml.FXML
    private TableColumn ReasonTC;
    @javafx.fxml.FXML
    private TableColumn orderIDTC;
    @javafx.fxml.FXML
    private TextField selectedRequstIDTF;
    @javafx.fxml.FXML
    private TableColumn requestIDTC;
    @javafx.fxml.FXML
    private TableView discountRequestTV;
    @javafx.fxml.FXML
    private TableColumn originalPriceTC;

    public TableColumn getProductTC() {
        return productTC;
    }

    @Override
    public String toString() {
        return "RMG3DiscountOverride{" +
                "productTC=" + productTC +
                ", managerCommentTA=" + managerCommentTA +
                ", notificationMessagesLab=" + notificationMessagesLab +
                ", requestedPriceTC=" + requestedPriceTC +
                ", ReasonTC=" + ReasonTC +
                ", orderIDTC=" + orderIDTC +
                ", selectedRequstIDTF=" + selectedRequstIDTF +
                ", requestIDTC=" + requestIDTC +
                ", discountRequestTV=" + discountRequestTV +
                ", originalPriceTC=" + originalPriceTC +
                '}';
    }

    public void setProductTC(TableColumn productTC) {
        this.productTC = productTC;
    }

    public TextArea getManagerCommentTA() {
        return managerCommentTA;
    }

    public void setManagerCommentTA(TextArea managerCommentTA) {
        this.managerCommentTA = managerCommentTA;
    }

    public Label getNotificationMessagesLab() {
        return notificationMessagesLab;
    }

    public void setNotificationMessagesLab(Label notificationMessagesLab) {
        this.notificationMessagesLab = notificationMessagesLab;
    }

    public TableColumn getRequestedPriceTC() {
        return requestedPriceTC;
    }

    public void setRequestedPriceTC(TableColumn requestedPriceTC) {
        this.requestedPriceTC = requestedPriceTC;
    }

    public TableColumn getReasonTC() {
        return ReasonTC;
    }

    public void setReasonTC(TableColumn reasonTC) {
        ReasonTC = reasonTC;
    }

    public TableColumn getOrderIDTC() {
        return orderIDTC;
    }

    public void setOrderIDTC(TableColumn orderIDTC) {
        this.orderIDTC = orderIDTC;
    }

    public TextField getSelectedRequstIDTF() {
        return selectedRequstIDTF;
    }

    public void setSelectedRequstIDTF(TextField selectedRequstIDTF) {
        this.selectedRequstIDTF = selectedRequstIDTF;
    }

    public TableColumn getRequestIDTC() {
        return requestIDTC;
    }

    public void setRequestIDTC(TableColumn requestIDTC) {
        this.requestIDTC = requestIDTC;
    }

    public TableView getDiscountRequestTV() {
        return discountRequestTV;
    }

    public void setDiscountRequestTV(TableView discountRequestTV) {
        this.discountRequestTV = discountRequestTV;
    }

    public TableColumn getOriginalPriceTC() {
        return originalPriceTC;
    }

    public void setOriginalPriceTC(TableColumn originalPriceTC) {
        this.originalPriceTC = originalPriceTC;
    }

    public RMG3DiscountOverride(TableColumn productTC, TextArea managerCommentTA, Label notificationMessagesLab, TableColumn requestedPriceTC, TableColumn reasonTC, TableColumn orderIDTC, TextField selectedRequstIDTF, TableColumn requestIDTC, TableView discountRequestTV, TableColumn originalPriceTC) {
        this.productTC = productTC;
        this.managerCommentTA = managerCommentTA;
        this.notificationMessagesLab = notificationMessagesLab;
        this.requestedPriceTC = requestedPriceTC;
        ReasonTC = reasonTC;
        this.orderIDTC = orderIDTC;
        this.selectedRequstIDTF = selectedRequstIDTF;
        this.requestIDTC = requestIDTC;
        this.discountRequestTV = discountRequestTV;
        this.originalPriceTC = originalPriceTC;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectDiscountRequestAndUpdateTableView(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveDiscountRequestAndUpdateTableView(ActionEvent actionEvent) {
    }
}