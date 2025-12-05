package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class DeliveryTrackingController
{
    @javafx.fxml.FXML
    private Spinner <Integer> receivedQuantitySpinner;
    @javafx.fxml.FXML
    private TableColumn<DeliveryTracking,String > supplierNameC;
    @javafx.fxml.FXML
    private ComboBox<String> deliveryStatusCB;
    @javafx.fxml.FXML
    private TableColumn <DeliveryTracking,Integer > deliveryIdC;
    @javafx.fxml.FXML
    private DatePicker actualDeliveryDateDP;
    @javafx.fxml.FXML
    private TableColumn<DeliveryTracking, LocalDate> expectedDateC;
    @javafx.fxml.FXML
    private TableView <DeliveryTracking>trackDeliveryTableView;
    @javafx.fxml.FXML
    private TableColumn<DeliveryTracking,String > materialTypeC;
    @javafx.fxml.FXML
    private Label messageTrackLabel;
    @javafx.fxml.FXML
    private TableColumn <DeliveryTracking,String >statusC;

    private int deliveryCounter = 1;

    @javafx.fxml.FXML
    public void initialize() {

        deliveryStatusCB.getItems().setAll("Completed", "Partial", "Delayed");
        deliveryIdC.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        supplierNameC.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        materialTypeC.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        expectedDateC.setCellValueFactory(new PropertyValueFactory<>("expDate"));
        statusC.setCellValueFactory(new PropertyValueFactory<>("status"));

        SpinnerValueFactory<Integer> qtyFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10000, 0);
        receivedQuantitySpinner.setValueFactory(qtyFactory);
    }

    @javafx.fxml.FXML
    public void submitB(ActionEvent actionEvent) {
        if (actualDeliveryDateDP.getValue() == null || deliveryStatusCB.getValue() == null) {
            messageTrackLabel.setText("Please fill all fields before submitting.");
            return;
        }

        DeliveryTracking record = new DeliveryTracking(deliveryStatusCB.getValue(), "Supplier A", "Material X", deliveryStatusCB.getValue(), receivedQuantitySpinner.getValue(), deliveryCounter++, actualDeliveryDateDP.getValue(), LocalDate.now().plusDays(3));

        trackDeliveryTableView.getItems().add(record);
        messageTrackLabel.setText("Delivery record submitted successfully.");
        clearAllInputs();
    }

    @javafx.fxml.FXML
    public void cancelB(ActionEvent actionEvent) {
        clearAllInputs();
        messageTrackLabel.setText("Form cleared.");
    }

    private void clearAllInputs() {
        actualDeliveryDateDP.setValue(null);
        deliveryStatusCB.setValue(null);
        receivedQuantitySpinner.getValueFactory().setValue(0);
    }

    @javafx.fxml.FXML
    public void updateStatusB(ActionEvent actionEvent) {
        DeliveryTracking selected = trackDeliveryTableView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            messageTrackLabel.setText("Please select a record to update.");
            return;
        }

        if (deliveryStatusCB.getValue() == null) {
            messageTrackLabel.setText("Choose a new status first.");
            return;
        }

        selected.setStatus(deliveryStatusCB.getValue());
        trackDeliveryTableView.refresh();
        messageTrackLabel.setText("Status updated successfully.");
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


    @javafx.fxml.FXML
    public void viewDetailsTrackDeliveriesB(ActionEvent actionEvent) {
        DeliveryTracking selected = trackDeliveryTableView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            messageTrackLabel.setText("Select a row to view details.");
            return;
        }

        messageTrackLabel.setText(
                "Delivery ID: " + selected.getDeliveryId() + " Supplier: " + selected.getSupplierName() + "  Status: " + selected.getStatus()
        );
    }
}