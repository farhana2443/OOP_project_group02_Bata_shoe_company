package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG7CouponPayment
{
    @javafx.fxml.FXML
    private TextField subtotalTF;
    @javafx.fxml.FXML
    private TextField discountTF;
    @javafx.fxml.FXML
    private RadioButton mobileWalletRB;
    @javafx.fxml.FXML
    private TextField totalPayableTF;
    @javafx.fxml.FXML
    private TextField couponCodeTF;
    @javafx.fxml.FXML
    private TextField expiryTF;
    @javafx.fxml.FXML
    private RadioButton cardRB;
    @javafx.fxml.FXML
    private Label couponValidationLab;
    @javafx.fxml.FXML
    private TextField cardNumberTF;
    @javafx.fxml.FXML
    private TextField cvvTF;
    @javafx.fxml.FXML
    private Label messageLab;

    public TextField getSubtotalTF() {
        return subtotalTF;
    }

    @Override
    public String toString() {
        return "CUG7CouponPayment{" +
                "subtotalTF=" + subtotalTF +
                ", discountTF=" + discountTF +
                ", mobileWalletRB=" + mobileWalletRB +
                ", totalPayableTF=" + totalPayableTF +
                ", couponCodeTF=" + couponCodeTF +
                ", expiryTF=" + expiryTF +
                ", cardRB=" + cardRB +
                ", couponValidationLab=" + couponValidationLab +
                ", cardNumberTF=" + cardNumberTF +
                ", cvvTF=" + cvvTF +
                ", messageLab=" + messageLab +
                '}';
    }

    public void setSubtotalTF(TextField subtotalTF) {
        this.subtotalTF = subtotalTF;
    }

    public TextField getDiscountTF() {
        return discountTF;
    }

    public void setDiscountTF(TextField discountTF) {
        this.discountTF = discountTF;
    }

    public RadioButton getMobileWalletRB() {
        return mobileWalletRB;
    }

    public void setMobileWalletRB(RadioButton mobileWalletRB) {
        this.mobileWalletRB = mobileWalletRB;
    }

    public TextField getTotalPayableTF() {
        return totalPayableTF;
    }

    public void setTotalPayableTF(TextField totalPayableTF) {
        this.totalPayableTF = totalPayableTF;
    }

    public TextField getCouponCodeTF() {
        return couponCodeTF;
    }

    public void setCouponCodeTF(TextField couponCodeTF) {
        this.couponCodeTF = couponCodeTF;
    }

    public TextField getExpiryTF() {
        return expiryTF;
    }

    public void setExpiryTF(TextField expiryTF) {
        this.expiryTF = expiryTF;
    }

    public RadioButton getCardRB() {
        return cardRB;
    }

    public void setCardRB(RadioButton cardRB) {
        this.cardRB = cardRB;
    }

    public Label getCouponValidationLab() {
        return couponValidationLab;
    }

    public void setCouponValidationLab(Label couponValidationLab) {
        this.couponValidationLab = couponValidationLab;
    }

    public TextField getCardNumberTF() {
        return cardNumberTF;
    }

    public void setCardNumberTF(TextField cardNumberTF) {
        this.cardNumberTF = cardNumberTF;
    }

    public TextField getCvvTF() {
        return cvvTF;
    }

    public void setCvvTF(TextField cvvTF) {
        this.cvvTF = cvvTF;
    }

    public Label getMessageLab() {
        return messageLab;
    }

    public void setMessageLab(Label messageLab) {
        this.messageLab = messageLab;
    }

    public CUG7CouponPayment(TextField subtotalTF, TextField discountTF, RadioButton mobileWalletRB, TextField totalPayableTF, TextField couponCodeTF, TextField expiryTF, RadioButton cardRB, Label couponValidationLab, TextField cardNumberTF, TextField cvvTF, Label messageLab) {
        this.subtotalTF = subtotalTF;
        this.discountTF = discountTF;
        this.mobileWalletRB = mobileWalletRB;
        this.totalPayableTF = totalPayableTF;
        this.couponCodeTF = couponCodeTF;
        this.expiryTF = expiryTF;
        this.cardRB = cardRB;
        this.couponValidationLab = couponValidationLab;
        this.cardNumberTF = cardNumberTF;
        this.cvvTF = cvvTF;
        this.messageLab = messageLab;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void gotoThePaymentPage(ActionEvent actionEvent) {
    }
}