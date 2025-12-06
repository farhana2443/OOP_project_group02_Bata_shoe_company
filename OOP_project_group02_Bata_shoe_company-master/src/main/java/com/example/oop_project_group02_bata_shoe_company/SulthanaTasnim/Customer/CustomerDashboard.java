package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class CustomerDashboard
{
    @javafx.fxml.FXML
    private Button searchSpecificShoeModelBTN;
    @javafx.fxml.FXML
    private Button chooseDeliveryorPickupOptionBTN;
    @javafx.fxml.FXML
    private Button provideShippingandContactDetailsBTN;
    @javafx.fxml.FXML
    private Button applyCouponandMakePaymentBTN;

    public Button getSearchSpecificShoeModelBTN() {
        return searchSpecificShoeModelBTN;
    }

    public void setSearchSpecificShoeModelBTN(Button searchSpecificShoeModelBTN) {
        this.searchSpecificShoeModelBTN = searchSpecificShoeModelBTN;
    }

    @Override
    public String toString() {
        return "CustomerDashboard{" +
                "searchSpecificShoeModelBTN=" + searchSpecificShoeModelBTN +
                ", chooseDeliveryorPickupOptionBTN=" + chooseDeliveryorPickupOptionBTN +
                ", provideShippingandContactDetailsBTN=" + provideShippingandContactDetailsBTN +
                ", applyCouponandMakePaymentBTN=" + applyCouponandMakePaymentBTN +
                ", viewProductDetailsandReviewsBTN=" + viewProductDetailsandReviewsBTN +
                ", addProducttoCartBTN=" + addProducttoCartBTN +
                ", browseShoesbyCategoryBTN=" + browseShoesbyCategoryBTN +
                ", trackOrderandRequestReturnBTN=" + trackOrderandRequestReturnBTN +
                '}';
    }

    public Button getChooseDeliveryorPickupOptionBTN() {
        return chooseDeliveryorPickupOptionBTN;
    }

    public void setChooseDeliveryorPickupOptionBTN(Button chooseDeliveryorPickupOptionBTN) {
        this.chooseDeliveryorPickupOptionBTN = chooseDeliveryorPickupOptionBTN;
    }

    public Button getProvideShippingandContactDetailsBTN() {
        return provideShippingandContactDetailsBTN;
    }

    public void setProvideShippingandContactDetailsBTN(Button provideShippingandContactDetailsBTN) {
        this.provideShippingandContactDetailsBTN = provideShippingandContactDetailsBTN;
    }

    public Button getApplyCouponandMakePaymentBTN() {
        return applyCouponandMakePaymentBTN;
    }

    public void setApplyCouponandMakePaymentBTN(Button applyCouponandMakePaymentBTN) {
        this.applyCouponandMakePaymentBTN = applyCouponandMakePaymentBTN;
    }

    public Button getViewProductDetailsandReviewsBTN() {
        return viewProductDetailsandReviewsBTN;
    }

    public void setViewProductDetailsandReviewsBTN(Button viewProductDetailsandReviewsBTN) {
        this.viewProductDetailsandReviewsBTN = viewProductDetailsandReviewsBTN;
    }

    public Button getAddProducttoCartBTN() {
        return addProducttoCartBTN;
    }

    public void setAddProducttoCartBTN(Button addProducttoCartBTN) {
        this.addProducttoCartBTN = addProducttoCartBTN;
    }

    public Button getBrowseShoesbyCategoryBTN() {
        return browseShoesbyCategoryBTN;
    }

    public void setBrowseShoesbyCategoryBTN(Button browseShoesbyCategoryBTN) {
        this.browseShoesbyCategoryBTN = browseShoesbyCategoryBTN;
    }

    public Button getTrackOrderandRequestReturnBTN() {
        return trackOrderandRequestReturnBTN;
    }

    public void setTrackOrderandRequestReturnBTN(Button trackOrderandRequestReturnBTN) {
        this.trackOrderandRequestReturnBTN = trackOrderandRequestReturnBTN;
    }

    @javafx.fxml.FXML
    private Button viewProductDetailsandReviewsBTN;
    @javafx.fxml.FXML
    private Button addProducttoCartBTN;
    @javafx.fxml.FXML
    private Button browseShoesbyCategoryBTN;

    public CustomerDashboard(Button searchSpecificShoeModelBTN, Button chooseDeliveryorPickupOptionBTN, Button provideShippingandContactDetailsBTN, Button applyCouponandMakePaymentBTN, Button viewProductDetailsandReviewsBTN, Button addProducttoCartBTN, Button browseShoesbyCategoryBTN, Button trackOrderandRequestReturnBTN) {
        this.searchSpecificShoeModelBTN = searchSpecificShoeModelBTN;
        this.chooseDeliveryorPickupOptionBTN = chooseDeliveryorPickupOptionBTN;
        this.provideShippingandContactDetailsBTN = provideShippingandContactDetailsBTN;
        this.applyCouponandMakePaymentBTN = applyCouponandMakePaymentBTN;
        this.viewProductDetailsandReviewsBTN = viewProductDetailsandReviewsBTN;
        this.addProducttoCartBTN = addProducttoCartBTN;
        this.browseShoesbyCategoryBTN = browseShoesbyCategoryBTN;
        this.trackOrderandRequestReturnBTN = trackOrderandRequestReturnBTN;
    }

    @javafx.fxml.FXML
    private Button trackOrderandRequestReturnBTN;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewApplyCouponandMakePaymentPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewTrackOrderandRequestReturnPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewProvideShippingandContactDetailspanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewsearchSpecificShoeModelPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewChooseDeliveryorPickupOptionPannel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewAddProducttoCartButtonPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewBrowseShoesbyCategorypanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewProductDetailsandReviewsPanel(ActionEvent actionEvent) {
    }
}