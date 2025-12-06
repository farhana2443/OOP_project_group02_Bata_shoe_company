package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class TransferController
{
    @javafx.fxml.FXML
    private TableColumn<Transfer, String> shoeModelTransferC;
    @javafx.fxml.FXML
    private TableColumn<Transfer, LocalDate> completionDateTransferC;
    @javafx.fxml.FXML
    private TableColumn<Transfer, String> transferStatusC;
    @javafx.fxml.FXML
    private TableView <Transfer>transferTableView;
    @javafx.fxml.FXML
    private TableColumn <Transfer, Integer>quantityTransferC;
    @javafx.fxml.FXML
    private ComboBox<String>  warehouseLocationTransferCB;
    @javafx.fxml.FXML
    private DatePicker transferDateDP;
    @javafx.fxml.FXML
    private TextArea notesTransferTextArea;
    @javafx.fxml.FXML
    private TableColumn<Transfer, String> batchIDTransferC;
    @javafx.fxml.FXML
    private Label transferMessage;

    private ObservableList<Transfer> transferList;
    private Transfer selectedTransfer;

    @javafx.fxml.FXML
    public void initialize() {
        batchIDTransferC.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        shoeModelTransferC.setCellValueFactory(new PropertyValueFactory<>("shoeModel"));
        quantityTransferC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        completionDateTransferC.setCellValueFactory(new PropertyValueFactory<>("completionDate"));
        transferStatusC.setCellValueFactory(new PropertyValueFactory<>("transferStatus"));


        loadWarehouseLocations();
        loadCompletedBatches();
        transferMessage.setText("Select a batch and click Initiate Transfer to begin.");

        transferTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        selectedTransfer = newValue;
                    }
                }
        );
    }

    private void loadWarehouseLocations() {
        ObservableList<String> locations = FXCollections.observableArrayList(
                "Dhaka Warehouse",
                "Chittagong Warehouse",
                "Gazipur Warehouse",
                "Main Factory Storage"
        );
        warehouseLocationTransferCB.setItems(locations);
    }

    private void loadCompletedBatches() {
        transferList = FXCollections.observableArrayList();
        transferList.add(new Transfer("B001", "Sneaker", null, "Pending", 500, LocalDate.of(2025, 11, 20), null));
        transferList.add(new Transfer("B002", "Boot", null, "Pending", 300, LocalDate.of(2025, 11, 22), null));
        transferList.add(new Transfer("B003", "Loafer", null, "Pending", 450, LocalDate.of(2025, 11, 25), null));
        transferList.add(new Transfer("B004", "Sport Shoe", null, "Pending", 600, LocalDate.of(2025, 11, 28), null));
        transferTableView.setItems(transferList);
    }

    @javafx.fxml.FXML
    public void confirmTransferB(ActionEvent actionEvent) {
        if (selectedTransfer == null) {
            transferMessage.setText("Please select a batch and click Initiate Transfer first.");
            return;
        }

        String warehouseLocation = warehouseLocationTransferCB.getValue();
        LocalDate transferDate = transferDateDP.getValue();
        String notes = notesTransferTextArea.getText().trim();

        if (warehouseLocation == null || warehouseLocation.isEmpty()) {
            transferMessage.setText("Please select a warehouse location.");
            return;
        }

        if (transferDate == null) {
            transferMessage.setText("Please select a transfer date.");
            return;
        }

        if (transferDate.isBefore(LocalDate.now())) {
            transferMessage.setText("Transfer date cannot be in the past.");
            return;
        }

        selectedTransfer.setTransferDate(transferDate);
        selectedTransfer.setNotes(notes);
        selectedTransfer.setTransferStatus("Transferred");

        String msg = String.format("Transfer initiated successfully. Transfer ID: T%s. Warehouse staff notified.",
                selectedTransfer.getBatchId());

        transferMessage.setText(msg);

        transferList.remove(selectedTransfer);
        transferTableView.refresh();
        clearForm();
    }

    @javafx.fxml.FXML
    public void viewDetailsTransferB(ActionEvent actionEvent) {
        selectedTransfer = transferTableView.getSelectionModel().getSelectedItem();

        if (selectedTransfer == null) {
            transferMessage.setText("Please select a batch to view details.");
            return;
        }

        String details = "Batch ID: " + selectedTransfer.getBatchId() + "\n" +
                "Shoe Model: " + selectedTransfer.getShoeModel() + "\n" +
                "Quantity: " + selectedTransfer.getQuantity() + " units\n" +
                "Completion Date: " + selectedTransfer.getCompletionDate() + "\n" +
                "Transfer Status: " + selectedTransfer.getTransferStatus() + "\n" +
                "Transfer Date: " + (selectedTransfer.getTransferDate() == null ? "Not Set" : selectedTransfer.getTransferDate()) + "\n" +
                "Notes: " + (selectedTransfer.getNotes() == null ? "None" : selectedTransfer.getNotes());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Batch Details");
        alert.setHeaderText("Batch " + selectedTransfer.getBatchId());
        alert.setContentText(details);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void initiateTransferB(ActionEvent actionEvent) {
        selectedTransfer = transferTableView.getSelectionModel().getSelectedItem();

        if (selectedTransfer == null) {
            transferMessage.setText("Please select a batch from the table.");
            return;
        }

        if (!selectedTransfer.getTransferStatus().equalsIgnoreCase("Pending")) {
            transferMessage.setText("This batch has already been transferred.");
            return;
        }

        transferDateDP.setValue(LocalDate.now());
        transferMessage.setText("Batch " + selectedTransfer.getBatchId() + " selected. Fill in transfer details and click Confirm.");
    }

    @javafx.fxml.FXML
    public void cancelTransferB(ActionEvent actionEvent) {
        clearForm();
        transferMessage.setText("Operation cancelled.");
    }

    private void clearForm() {
        warehouseLocationTransferCB.setValue(null);
        transferDateDP.setValue(null);
        notesTransferTextArea.clear();
        selectedTransfer = null;
        transferTableView.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backB(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProductionSupervisorDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Production Supervisor Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}