package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class PurchaseOrderController
{
    @javafx.fxml.FXML
    private DatePicker expectedDeliveryDateDP;
    @javafx.fxml.FXML
    private ComboBox <String> materialTypeCB;
    @javafx.fxml.FXML
    private ComboBox <String> supplierNameCB;
    @javafx.fxml.FXML
    private Spinner<Integer> quantitySpinner;
    @javafx.fxml.FXML
    private Label messagePurchaseOrderLabel;

    @javafx.fxml.FXML
    public void initialize() {
        materialTypeCB.getItems().setAll("Leather", "Rubber", "Foam", "Fabric", "Glue", "Thread", "Insole Material");
        supplierNameCB.getItems().setAll("Local Supplier", "International Supplier", "Contract Supplier");

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000, 1);
        quantitySpinner.setValueFactory(valueFactory);

    }

    @javafx.fxml.FXML
    public void createOrderB(ActionEvent actionEvent) {
        String material = materialTypeCB.getValue();
        String supplier = supplierNameCB.getValue();
        LocalDate expDate = expectedDeliveryDateDP.getValue();
        int quantity = quantitySpinner.getValue();

        if (material == null || supplier == null || expDate == null) {
            messagePurchaseOrderLabel.setText("Please fill all fields before creating order.");
            return;
        }
        PurchaseOrder order = new PurchaseOrder(
                material,
                supplier,
                expDate,
                quantity
        );
        messagePurchaseOrderLabel.setText(
                " Order Created: " + quantity + " units of " + material +
                        " from " + supplier + " (Delivery: " + expDate + ")"
        );

    }

    @javafx.fxml.FXML
    public void backB2(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SupplierOfficerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Supplier Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}