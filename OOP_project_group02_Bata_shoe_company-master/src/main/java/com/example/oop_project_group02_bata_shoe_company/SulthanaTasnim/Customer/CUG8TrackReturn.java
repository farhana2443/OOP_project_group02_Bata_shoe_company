package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG8TrackReturn
{
    @javafx.fxml.FXML
    private TextArea orderSummaryTA;
    @javafx.fxml.FXML
    private TextArea returnReasonDescriptionTA;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableView orderListTV;
    @javafx.fxml.FXML
    private TextArea trackingTimelineTA;
    @javafx.fxml.FXML
    private TableColumn orderIDTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;

    public TextArea getOrderSummaryTA() {
        return orderSummaryTA;
    }

    public void setOrderSummaryTA(TextArea orderSummaryTA) {
        this.orderSummaryTA = orderSummaryTA;
    }

    @Override
    public String toString() {
        return "CUG8TrackReturn{" +
                "orderSummaryTA=" + orderSummaryTA +
                ", returnReasonDescriptionTA=" + returnReasonDescriptionTA +
                ", statusTC=" + statusTC +
                ", orderListTV=" + orderListTV +
                ", trackingTimelineTA=" + trackingTimelineTA +
                ", orderIDTC=" + orderIDTC +
                ", dateTC=" + dateTC +
                ", instructionMessageLab=" + instructionMessageLab +
                ", totalTC=" + totalTC +
                '}';
    }

    public TextArea getReturnReasonDescriptionTA() {
        return returnReasonDescriptionTA;
    }

    public void setReturnReasonDescriptionTA(TextArea returnReasonDescriptionTA) {
        this.returnReasonDescriptionTA = returnReasonDescriptionTA;
    }

    public TableColumn getStatusTC() {
        return statusTC;
    }

    public void setStatusTC(TableColumn statusTC) {
        this.statusTC = statusTC;
    }

    public TableView getOrderListTV() {
        return orderListTV;
    }

    public void setOrderListTV(TableView orderListTV) {
        this.orderListTV = orderListTV;
    }

    public TextArea getTrackingTimelineTA() {
        return trackingTimelineTA;
    }

    public void setTrackingTimelineTA(TextArea trackingTimelineTA) {
        this.trackingTimelineTA = trackingTimelineTA;
    }

    public TableColumn getOrderIDTC() {
        return orderIDTC;
    }

    public void setOrderIDTC(TableColumn orderIDTC) {
        this.orderIDTC = orderIDTC;
    }

    public TableColumn getDateTC() {
        return dateTC;
    }

    public void setDateTC(TableColumn dateTC) {
        this.dateTC = dateTC;
    }

    public Label getInstructionMessageLab() {
        return instructionMessageLab;
    }

    public void setInstructionMessageLab(Label instructionMessageLab) {
        this.instructionMessageLab = instructionMessageLab;
    }

    public TableColumn getTotalTC() {
        return totalTC;
    }

    public void setTotalTC(TableColumn totalTC) {
        this.totalTC = totalTC;
    }

    @javafx.fxml.FXML
    private Label instructionMessageLab;

    public CUG8TrackReturn(TextArea orderSummaryTA, TextArea returnReasonDescriptionTA, TableColumn statusTC, TableView orderListTV, TextArea trackingTimelineTA, TableColumn orderIDTC, TableColumn dateTC, Label instructionMessageLab, TableColumn totalTC) {
        this.orderSummaryTA = orderSummaryTA;
        this.returnReasonDescriptionTA = returnReasonDescriptionTA;
        this.statusTC = statusTC;
        this.orderListTV = orderListTV;
        this.trackingTimelineTA = trackingTimelineTA;
        this.orderIDTC = orderIDTC;
        this.dateTC = dateTC;
        this.instructionMessageLab = instructionMessageLab;
        this.totalTC = totalTC;
    }

    @javafx.fxml.FXML
    private TableColumn totalTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendReturnRequest(ActionEvent actionEvent) {
    }
}