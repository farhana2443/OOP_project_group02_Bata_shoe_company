package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.stage.Stage;

import java.io.IOException;

public class InventoryUpdateController
{
    @javafx.fxml.FXML
    private TableView <InventoryUpdate>inventoryUpdateTableView;
    @javafx.fxml.FXML
    private TextField warehouseLocationTF;
    @javafx.fxml.FXML
    private TableColumn <InventoryUpdate, Integer>quantityProducedInventoryC;
    @javafx.fxml.FXML
    private Label finalQuantityPreFilledLabel;
    @javafx.fxml.FXML
    private TableColumn <InventoryUpdate, String>shoeModelInventoryC;
    @javafx.fxml.FXML
    private Label inventoryUpdateMessage;
    @javafx.fxml.FXML
    private TableColumn <InventoryUpdate, String>batchIDInventoryC;
    @javafx.fxml.FXML
    private TableColumn<InventoryUpdate, String> quantityStatusInventoryC;


    private ObservableList<InventoryUpdate> batchList;
    private InventoryUpdate selectedBatch;

    @javafx.fxml.FXML
    public void initialize() {
        batchIDInventoryC.setCellValueFactory(new PropertyValueFactory<>("batchID"));
        shoeModelInventoryC.setCellValueFactory(new PropertyValueFactory<>("shoeModel"));
        quantityProducedInventoryC.setCellValueFactory(new PropertyValueFactory<>("quantityProduced"));
        quantityStatusInventoryC.setCellValueFactory(new PropertyValueFactory<>("qualityStatus"));
        loadCompletedBatches();

        inventoryUpdateMessage.setText("Select a batch and click 'Add to Inventory' to proceed.");

        inventoryUpdateTableView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        selectedBatch = newValue;
                    }
                }
        );
    }
    private void loadCompletedBatches() {
        batchList = FXCollections.observableArrayList();
        batchList.add(new InventoryUpdate("B001", "Sneaker", "Passed", null, 500, 500));
        batchList.add(new InventoryUpdate("B002", "Boot", "Passed", null, 300, 300));
        batchList.add(new InventoryUpdate("B003", "Loafer", "Passed", null, 450, 450));
        batchList.add(new InventoryUpdate("B004", "Sport Shoe", "Failed", null, 300, 600));
        batchList.add(new InventoryUpdate("B005", "Formal Shoe", "Failed", null, 350, 350));
        batchList.add(new InventoryUpdate("B006", "Casual Shoe", "Passed", null, 400, 400));

        inventoryUpdateTableView.setItems(batchList);
    }

    @javafx.fxml.FXML
    public void confirmInventoryUpdateB(ActionEvent actionEvent) {
        if (selectedBatch == null) {
            inventoryUpdateMessage.setText("Please select a batch and click 'Add to Inventory' first.");
            return;
        }

        String warehouseLocation = warehouseLocationTF.getText().trim();
        int finalQuantity;

        try {
            finalQuantity = Integer.parseInt(finalQuantityPreFilledLabel.getText());
        } catch (NumberFormatException e) {
            inventoryUpdateMessage.setText("Invalid quantity format.");
            return;
        }

        if (finalQuantity <= 0) {
            inventoryUpdateMessage.setText("Quantity must be positive.");
            return;
        }

        if (warehouseLocation.isEmpty()) {
            inventoryUpdateMessage.setText("Please enter warehouse location.");
            return;
        }

        selectedBatch.setFinalQuantity(finalQuantity);
        selectedBatch.setWarehouseLocation(warehouseLocation);

        String msg = String.format("Inventory updated. Added %d units of %s to %s",
                selectedBatch.getFinalQuantity(),
                selectedBatch.getShoeModel(),
                selectedBatch.getWarehouseLocation());

        inventoryUpdateMessage.setText(msg);

        batchList.remove(selectedBatch);
        inventoryUpdateTableView.refresh();
        clearForm();
    }

    @javafx.fxml.FXML
    public void cancelInventoryUpdateB(ActionEvent actionEvent) {
        clearForm();
        inventoryUpdateMessage.setText("Operation cancelled.");
    }

    private void clearForm() {
        warehouseLocationTF.clear();
        finalQuantityPreFilledLabel.setText("pre-filled");
        selectedBatch = null;
        inventoryUpdateTableView.getSelectionModel().clearSelection();
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

    @javafx.fxml.FXML
    public void viewDetailsInventoryUpdateB(ActionEvent actionEvent) {
        selectedBatch = inventoryUpdateTableView.getSelectionModel().getSelectedItem();

        if (selectedBatch == null) {
            inventoryUpdateMessage.setText("Please select a batch to view details.");
            return;
        }

        String details = "Batch ID: " + selectedBatch.getBatchID() + "\n" +
                "Shoe Model: " + selectedBatch.getShoeModel() + "\n" +
                "Quantity Produced: " + selectedBatch.getQuantityProduced() + " units\n" +
                "Final Quantity: " + selectedBatch.getFinalQuantity() + " units\n" +
                "Quality Status: " + selectedBatch.getQualityStatus() + "\n" +
                "Warehouse Location: " + (selectedBatch.getWarehouseLocation() == null ? "Not Assigned Yet" : selectedBatch.getWarehouseLocation());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Batch Details");
        alert.setHeaderText("Batch " + selectedBatch.getBatchID());
        alert.setContentText(details);

        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void addInventoryUpdateB(ActionEvent actionEvent) {
        selectedBatch = inventoryUpdateTableView.getSelectionModel().getSelectedItem();

        if (selectedBatch == null) {
            inventoryUpdateMessage.setText("Please select a batch from the table first.");
            return;
        }

        if (!selectedBatch.getQualityStatus().equalsIgnoreCase("Passed")) {
            inventoryUpdateMessage.setText("This batch failed quality inspection. Cannot add to inventory.");
            return;
        }

        finalQuantityPreFilledLabel.setText(String.valueOf(selectedBatch.getFinalQuantity()));
        inventoryUpdateMessage.setText("Batch " + selectedBatch.getBatchID() + " selected. Enter warehouse location and click Confirm.");
    }
}
