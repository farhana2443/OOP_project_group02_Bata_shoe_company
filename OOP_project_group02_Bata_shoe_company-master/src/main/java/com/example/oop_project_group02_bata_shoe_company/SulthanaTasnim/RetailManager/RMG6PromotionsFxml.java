package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG6PromotionsFxml
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private Label promotionDetailsLab;
    @javafx.fxml.FXML
    private TableColumn nameTC;
    @javafx.fxml.FXML
    private TableColumn typeTC;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TextField promotionIDTF;
    @javafx.fxml.FXML
    private ComboBox promotionOfferCB;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableView promotionTV;
    @javafx.fxml.FXML
    private TableColumn promotionIDTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private DatePicker startDateDP;

    @Override
    public String toString() {
        return "RMG6PromotionsFxml{" +
                "nameTF=" + nameTF +
                ", promotionDetailsLab=" + promotionDetailsLab +
                ", nameTC=" + nameTC +
                ", typeTC=" + typeTC +
                ", statusCB=" + statusCB +
                ", promotionIDTF=" + promotionIDTF +
                ", promotionOfferCB=" + promotionOfferCB +
                ", endDateDP=" + endDateDP +
                ", promotionTV=" + promotionTV +
                ", promotionIDTC=" + promotionIDTC +
                ", statusTC=" + statusTC +
                ", startDateDP=" + startDateDP +
                ", startDateTC=" + startDateTC +
                ", endDateTC=" + endDateTC +
                '}';
    }

    @javafx.fxml.FXML
    private TableColumn startDateTC;

    public TextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }

    public Label getPromotionDetailsLab() {
        return promotionDetailsLab;
    }

    public void setPromotionDetailsLab(Label promotionDetailsLab) {
        this.promotionDetailsLab = promotionDetailsLab;
    }

    public TableColumn getNameTC() {
        return nameTC;
    }

    public void setNameTC(TableColumn nameTC) {
        this.nameTC = nameTC;
    }

    public TableColumn getTypeTC() {
        return typeTC;
    }

    public void setTypeTC(TableColumn typeTC) {
        this.typeTC = typeTC;
    }

    public ComboBox getStatusCB() {
        return statusCB;
    }

    public void setStatusCB(ComboBox statusCB) {
        this.statusCB = statusCB;
    }

    public TextField getPromotionIDTF() {
        return promotionIDTF;
    }

    public void setPromotionIDTF(TextField promotionIDTF) {
        this.promotionIDTF = promotionIDTF;
    }

    public ComboBox getPromotionOfferCB() {
        return promotionOfferCB;
    }

    public void setPromotionOfferCB(ComboBox promotionOfferCB) {
        this.promotionOfferCB = promotionOfferCB;
    }

    public DatePicker getEndDateDP() {
        return endDateDP;
    }

    public void setEndDateDP(DatePicker endDateDP) {
        this.endDateDP = endDateDP;
    }

    public TableView getPromotionTV() {
        return promotionTV;
    }

    public void setPromotionTV(TableView promotionTV) {
        this.promotionTV = promotionTV;
    }

    public TableColumn getPromotionIDTC() {
        return promotionIDTC;
    }

    public void setPromotionIDTC(TableColumn promotionIDTC) {
        this.promotionIDTC = promotionIDTC;
    }

    public TableColumn getStatusTC() {
        return statusTC;
    }

    public void setStatusTC(TableColumn statusTC) {
        this.statusTC = statusTC;
    }

    public DatePicker getStartDateDP() {
        return startDateDP;
    }

    public void setStartDateDP(DatePicker startDateDP) {
        this.startDateDP = startDateDP;
    }

    public TableColumn getStartDateTC() {
        return startDateTC;
    }

    public void setStartDateTC(TableColumn startDateTC) {
        this.startDateTC = startDateTC;
    }

    public TableColumn getEndDateTC() {
        return endDateTC;
    }

    public void setEndDateTC(TableColumn endDateTC) {
        this.endDateTC = endDateTC;
    }

    public RMG6PromotionsFxml(TextField nameTF, Label promotionDetailsLab, TableColumn nameTC, TableColumn typeTC, ComboBox statusCB, TextField promotionIDTF, ComboBox promotionOfferCB, DatePicker endDateDP, TableView promotionTV, TableColumn promotionIDTC, TableColumn statusTC, DatePicker startDateDP, TableColumn startDateTC, TableColumn endDateTC) {
        this.nameTF = nameTF;
        this.promotionDetailsLab = promotionDetailsLab;
        this.nameTC = nameTC;
        this.typeTC = typeTC;
        this.statusCB = statusCB;
        this.promotionIDTF = promotionIDTF;
        this.promotionOfferCB = promotionOfferCB;
        this.endDateDP = endDateDP;
        this.promotionTV = promotionTV;
        this.promotionIDTC = promotionIDTC;
        this.statusTC = statusTC;
        this.startDateDP = startDateDP;
        this.startDateTC = startDateTC;
        this.endDateTC = endDateTC;
    }

    @javafx.fxml.FXML
    private TableColumn endDateTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusOfTheSelectedPromotionOnTheTable(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveAndShowTheUpdatesInTheTable(ActionEvent actionEvent) {
    }
}