package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class InvoiceProcessingController
{
    @javafx.fxml.FXML
    private Label processInvoiceMessage;
    @javafx.fxml.FXML
    private Spinner <Integer> amountSpinner;
    @javafx.fxml.FXML
    private TableView <InvoiceProcessing> invoiceDeliveryTableView;
    @javafx.fxml.FXML
    private TableColumn <InvoiceProcessing, Integer> quantityDeliveredInvoiceC;
    @javafx.fxml.FXML
    private TableColumn <InvoiceProcessing, String>deliveryIdInvoiceC;
    @javafx.fxml.FXML
    private TableColumn <InvoiceProcessing, LocalDate>deliveryDateInvoiceC;
    @javafx.fxml.FXML
    private TableColumn <InvoiceProcessing, String>supplierNameInvoiceC;
    @javafx.fxml.FXML
    private TableColumn <InvoiceProcessing, String>materialTypeInvoiceC;
    @javafx.fxml.FXML
    private ComboBox paymentTermsCB;
    @javafx.fxml.FXML
    private Label autoDeliveryLabel;
    @javafx.fxml.FXML
    private Label autoInvoiceNumLabel;
    @javafx.fxml.FXML
    private DatePicker paymentDueDateDP;

    @javafx.fxml.FXML
    public void initialize() {
        paymentTermsCB.getItems().setAll("7 Days", "15 Days", "30 Days", "60 Days");
        deliveryIdInvoiceC.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        supplierNameInvoiceC.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        materialTypeInvoiceC.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        quantityDeliveredInvoiceC.setCellValueFactory(new PropertyValueFactory<>("deliveryQun"));
        deliveryDateInvoiceC.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));

        for (AddSupplier supplier : SupplierData.supplierList) {
            String firstMaterial = supplier.getSelectedItems().isEmpty() ? "Unknown" : supplier.getSelectedItems().get(0);
            invoiceDeliveryTableView.getItems().add(
                    new InvoiceProcessing(
                            0,
                            0,
                            0,
                            LocalDate.now(),
                            LocalDate.now(),
                            "D" + (invoiceDeliveryTableView.getItems().size() + 1),
                            "7 Days",
                            supplier.getSupplierName(),
                            firstMaterial
                    )
            );
        }
    }

    @javafx.fxml.FXML
    public void generateB(ActionEvent actionEvent) {

        processInvoiceMessage.setText("Invoice generated successfully.");
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
    public void cancelInvoiceB(ActionEvent actionEvent) {
        amountSpinner.getValueFactory().setValue(0);
        autoInvoiceNumLabel.setText("");
        paymentDueDateDP.setValue(null);
        processInvoiceMessage.setText("Invoice creation cancelled.");
    }

    @javafx.fxml.FXML
    public void createInvoiceB(ActionEvent actionEvent) {
        InvoiceProcessing selected = invoiceDeliveryTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            processInvoiceMessage.setText("Invoice created for supplier: " + selected.getSupplierName());
        } else {
            processInvoiceMessage.setText("Please select a supplier first.");
        }
    }
}