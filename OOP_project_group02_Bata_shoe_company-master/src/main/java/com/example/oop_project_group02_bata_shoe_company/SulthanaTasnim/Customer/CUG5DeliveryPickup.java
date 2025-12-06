package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG5DeliveryPickup
{
    @javafx.fxml.FXML
    private RadioButton pickupRB;

    @Override
    public String toString() {
        return "CUG5DeliveryPickup{" +
                "pickupRB=" + pickupRB +
                ", totalItemLab=" + totalItemLab +
                ", locationCB=" + locationCB +
                ", deliveryRB=" + deliveryRB +
                ", subtotalLab=" + subtotalLab +
                ", messageLab=" + messageLab +
                '}';
    }

    public RadioButton getPickupRB() {
        return pickupRB;
    }

    public void setPickupRB(RadioButton pickupRB) {
        this.pickupRB = pickupRB;
    }

    public Label getTotalItemLab() {
        return totalItemLab;
    }

    public void setTotalItemLab(Label totalItemLab) {
        this.totalItemLab = totalItemLab;
    }

    public ComboBox getLocationCB() {
        return locationCB;
    }

    public void setLocationCB(ComboBox locationCB) {
        this.locationCB = locationCB;
    }

    public RadioButton getDeliveryRB() {
        return deliveryRB;
    }

    public void setDeliveryRB(RadioButton deliveryRB) {
        this.deliveryRB = deliveryRB;
    }

    public Label getSubtotalLab() {
        return subtotalLab;
    }

    public void setSubtotalLab(Label subtotalLab) {
        this.subtotalLab = subtotalLab;
    }

    public Label getMessageLab() {
        return messageLab;
    }

    public void setMessageLab(Label messageLab) {
        this.messageLab = messageLab;
    }

    @javafx.fxml.FXML
    private Label totalItemLab;
    @javafx.fxml.FXML
    private ComboBox locationCB;

    public CUG5DeliveryPickup(RadioButton pickupRB, Label totalItemLab, ComboBox locationCB, RadioButton deliveryRB, Label subtotalLab, Label messageLab) {
        this.pickupRB = pickupRB;
        this.totalItemLab = totalItemLab;
        this.locationCB = locationCB;
        this.deliveryRB = deliveryRB;
        this.subtotalLab = subtotalLab;
        this.messageLab = messageLab;
    }

    @javafx.fxml.FXML
    private RadioButton deliveryRB;
    @javafx.fxml.FXML
    private Label subtotalLab;
    @javafx.fxml.FXML
    private Label messageLab;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveAndConfirmDeliveryPickupOption(ActionEvent actionEvent) {
    }
}