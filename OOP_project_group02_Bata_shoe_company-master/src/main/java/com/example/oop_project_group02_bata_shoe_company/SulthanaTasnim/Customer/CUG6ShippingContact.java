package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG6ShippingContact
{
    @javafx.fxml.FXML
    private TextField cityTF;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField addressLineOneTF;
    @javafx.fxml.FXML
    private TextField addressLineTwoTF;
    @javafx.fxml.FXML
    private TextField deliveryDateTF;
    @javafx.fxml.FXML
    private TextField shippingCostTF;
    @javafx.fxml.FXML
    private TextField postalCodeTF;
    @javafx.fxml.FXML
    private Label messageLab;

    public TextField getCityTF() {
        return cityTF;
    }

    @Override
    public String toString() {
        return "CUG6ShippingContact{" +
                "cityTF=" + cityTF +
                ", phoneTF=" + phoneTF +
                ", nameTF=" + nameTF +
                ", emailTF=" + emailTF +
                ", addressLineOneTF=" + addressLineOneTF +
                ", addressLineTwoTF=" + addressLineTwoTF +
                ", deliveryDateTF=" + deliveryDateTF +
                ", shippingCostTF=" + shippingCostTF +
                ", postalCodeTF=" + postalCodeTF +
                ", messageLab=" + messageLab +
                '}';
    }

    public void setCityTF(TextField cityTF) {
        this.cityTF = cityTF;
    }

    public TextField getPhoneTF() {
        return phoneTF;
    }

    public void setPhoneTF(TextField phoneTF) {
        this.phoneTF = phoneTF;
    }

    public TextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }

    public TextField getEmailTF() {
        return emailTF;
    }

    public void setEmailTF(TextField emailTF) {
        this.emailTF = emailTF;
    }

    public TextField getAddressLineOneTF() {
        return addressLineOneTF;
    }

    public void setAddressLineOneTF(TextField addressLineOneTF) {
        this.addressLineOneTF = addressLineOneTF;
    }

    public TextField getAddressLineTwoTF() {
        return addressLineTwoTF;
    }

    public void setAddressLineTwoTF(TextField addressLineTwoTF) {
        this.addressLineTwoTF = addressLineTwoTF;
    }

    public TextField getDeliveryDateTF() {
        return deliveryDateTF;
    }

    public void setDeliveryDateTF(TextField deliveryDateTF) {
        this.deliveryDateTF = deliveryDateTF;
    }

    public TextField getShippingCostTF() {
        return shippingCostTF;
    }

    public void setShippingCostTF(TextField shippingCostTF) {
        this.shippingCostTF = shippingCostTF;
    }

    public TextField getPostalCodeTF() {
        return postalCodeTF;
    }

    public void setPostalCodeTF(TextField postalCodeTF) {
        this.postalCodeTF = postalCodeTF;
    }

    public Label getMessageLab() {
        return messageLab;
    }

    public void setMessageLab(Label messageLab) {
        this.messageLab = messageLab;
    }

    public CUG6ShippingContact(TextField cityTF, TextField phoneTF, TextField nameTF, TextField emailTF, TextField addressLineOneTF, TextField addressLineTwoTF, TextField deliveryDateTF, TextField shippingCostTF, TextField postalCodeTF, Label messageLab) {
        this.cityTF = cityTF;
        this.phoneTF = phoneTF;
        this.nameTF = nameTF;
        this.emailTF = emailTF;
        this.addressLineOneTF = addressLineOneTF;
        this.addressLineTwoTF = addressLineTwoTF;
        this.deliveryDateTF = deliveryDateTF;
        this.shippingCostTF = shippingCostTF;
        this.postalCodeTF = postalCodeTF;
        this.messageLab = messageLab;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveAndContinueShippingInformation(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void calculateShippingCost(ActionEvent actionEvent) {
    }
}