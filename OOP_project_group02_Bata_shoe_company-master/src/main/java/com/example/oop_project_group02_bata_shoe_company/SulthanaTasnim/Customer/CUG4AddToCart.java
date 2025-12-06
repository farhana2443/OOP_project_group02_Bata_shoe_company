package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG4AddToCart
{
    @javafx.fxml.FXML
    private TableColumn productTC;

    public TableColumn getProductTC() {
        return productTC;
    }

    @Override
    public String toString() {
        return "CUG4AddToCart{" +
                "productTC=" + productTC +
                ", cartSubtotalLab=" + cartSubtotalLab +
                ", subtotalTC=" + subtotalTC +
                ", quantityTC=" + quantityTC +
                ", unitPriceTC=" + unitPriceTC +
                ", quantityTF=" + quantityTF +
                ", sizeTC=" + sizeTC +
                ", sizeTF=" + sizeTF +
                ", cartTV=" + cartTV +
                '}';
    }

    public void setProductTC(TableColumn productTC) {
        this.productTC = productTC;
    }

    public Label getCartSubtotalLab() {
        return cartSubtotalLab;
    }

    public void setCartSubtotalLab(Label cartSubtotalLab) {
        this.cartSubtotalLab = cartSubtotalLab;
    }

    public TableColumn getSubtotalTC() {
        return subtotalTC;
    }

    public void setSubtotalTC(TableColumn subtotalTC) {
        this.subtotalTC = subtotalTC;
    }

    public TableColumn getQuantityTC() {
        return quantityTC;
    }

    public void setQuantityTC(TableColumn quantityTC) {
        this.quantityTC = quantityTC;
    }

    public TableColumn getUnitPriceTC() {
        return unitPriceTC;
    }

    public void setUnitPriceTC(TableColumn unitPriceTC) {
        this.unitPriceTC = unitPriceTC;
    }

    public TextField getQuantityTF() {
        return quantityTF;
    }

    public void setQuantityTF(TextField quantityTF) {
        this.quantityTF = quantityTF;
    }

    public TableColumn getSizeTC() {
        return sizeTC;
    }

    public void setSizeTC(TableColumn sizeTC) {
        this.sizeTC = sizeTC;
    }

    public TextField getSizeTF() {
        return sizeTF;
    }

    public void setSizeTF(TextField sizeTF) {
        this.sizeTF = sizeTF;
    }

    public TableView getCartTV() {
        return cartTV;
    }

    public void setCartTV(TableView cartTV) {
        this.cartTV = cartTV;
    }

    @javafx.fxml.FXML
    private Label cartSubtotalLab;

    public CUG4AddToCart(TableColumn productTC, Label cartSubtotalLab, TableColumn subtotalTC, TableColumn quantityTC, TableColumn unitPriceTC, TextField quantityTF, TableColumn sizeTC, TextField sizeTF, TableView cartTV) {
        this.productTC = productTC;
        this.cartSubtotalLab = cartSubtotalLab;
        this.subtotalTC = subtotalTC;
        this.quantityTC = quantityTC;
        this.unitPriceTC = unitPriceTC;
        this.quantityTF = quantityTF;
        this.sizeTC = sizeTC;
        this.sizeTF = sizeTF;
        this.cartTV = cartTV;
    }

    @javafx.fxml.FXML
    private TableColumn subtotalTC;
    @javafx.fxml.FXML
    private TableColumn quantityTC;
    @javafx.fxml.FXML
    private TableColumn unitPriceTC;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private TableColumn sizeTC;
    @javafx.fxml.FXML
    private TextField sizeTF;
    @javafx.fxml.FXML
    private TableView cartTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveToTheCartTable(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveAndGoToTheCheckoutPage(ActionEvent actionEvent) {
    }
}