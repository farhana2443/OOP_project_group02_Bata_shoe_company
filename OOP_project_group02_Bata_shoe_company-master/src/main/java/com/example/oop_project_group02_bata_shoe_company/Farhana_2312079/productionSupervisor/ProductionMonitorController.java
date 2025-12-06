package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductionMonitorController
{
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private TableColumn<ProductionMonitor, String> batchC;
    @javafx.fxml.FXML
    private TableColumn<ProductionMonitor, Integer> completedQuantityC;
    @javafx.fxml.FXML
    private TableColumn<ProductionMonitor, Double> progressC;
    @javafx.fxml.FXML
    private TableView <ProductionMonitor>productionMonitorTableView;
    @javafx.fxml.FXML
    private TableColumn <ProductionMonitor, String>shoeModelC;
    @javafx.fxml.FXML
    private TableColumn <ProductionMonitor, Integer>targetQuantityC;
    @javafx.fxml.FXML
    private Label productionMonitorMessage;
    @javafx.fxml.FXML
    private TableColumn <ProductionMonitor, String>statusProductionC;

    @javafx.fxml.FXML
    private TableColumn<ProductionMonitor, String> supplierC;

    @javafx.fxml.FXML
    private Spinner <Integer>completedUnitsSpinner;

    @javafx.fxml.FXML
    public void initialize() {
        batchC.setCellValueFactory(new PropertyValueFactory<>("batchID"));
        shoeModelC.setCellValueFactory(new PropertyValueFactory<>("shoeModel"));
        targetQuantityC.setCellValueFactory(new PropertyValueFactory<>("targetQua"));
        completedQuantityC.setCellValueFactory(new PropertyValueFactory<>("completedQua"));
        statusProductionC.setCellValueFactory(new PropertyValueFactory<>("status"));
        progressC.setCellValueFactory(new PropertyValueFactory<>("progress"));

        supplierC.setCellValueFactory(new PropertyValueFactory<>("supplierName"));

        loadProductionData();

        productionMonitorTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                int remaining = newSelection.getTargetQua() - newSelection.getCompletedQua();
                if (remaining < 0) remaining = 0;
                completedUnitsSpinner.setValueFactory(
                        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, remaining, 0)
                );
                notesTextArea.setText(newSelection.getNotes());
            } else {
                completedUnitsSpinner.setValueFactory(
                        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 0, 0)
                );
                notesTextArea.clear();
            }
        });
        if (!productionMonitorTableView.getItems().isEmpty()) {
            productionMonitorTableView.getSelectionModel().selectFirst();
        }
    }
    private void loadProductionData() {
        productionMonitorTableView.getItems().clear();

        productionMonitorTableView.getItems().addAll(
                new ProductionMonitor("B001", "Sneaker", "In Progress", "", 100, 50, 50.0, "Supplier A"),
                new ProductionMonitor("B002", "Boot", "In Progress", "", 80, 20, 25.0, "Supplier B"),
                new ProductionMonitor("B003", "Loafer", "Completed", "", 60, 60, 100.0, "Supplier C")
        );

        productionMonitorTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                int remaining = newSelection.getTargetQua() - newSelection.getCompletedQua();
                completedUnitsSpinner.setValueFactory(
                        new SpinnerValueFactory.IntegerSpinnerValueFactory(0, remaining, 0)
                );
                notesTextArea.setText(newSelection.getNotes());
            }
        });
    }

    @javafx.fxml.FXML
    public void updateProgressB(ActionEvent actionEvent) {
        ProductionMonitor selectedBatch = productionMonitorTableView.getSelectionModel().getSelectedItem();
        if (selectedBatch == null) {
            productionMonitorMessage.setText("Please select a batch to update.");
            return;
        }
        productionMonitorMessage.setText("Enter completed units and notes, then click Submit.");
    }

    @javafx.fxml.FXML
    public void viewDetailsProductionMonitorB(ActionEvent actionEvent) {
        ProductionMonitor selectedBatch = productionMonitorTableView.getSelectionModel().getSelectedItem();
        if (selectedBatch == null) {
            productionMonitorMessage.setText("Please select a batch to view details.");
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Batch Details");
        alert.setHeaderText("Details for Batch: " + selectedBatch.getBatchID());
        alert.setContentText(
                "Shoe Model: " + selectedBatch.getShoeModel() + "\n" +
                        "Target Quantity: " + selectedBatch.getTargetQua() + "\n" +
                        "Completed Quantity: " + selectedBatch.getCompletedQua() + "\n" +
                        "Progress: " + selectedBatch.getProgress() + "%\n" +
                        "Status: " + selectedBatch.getStatus() + "\n" +
                        "Notes: " + selectedBatch.getNotes()
        );
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void submitUpdateProductionB(ActionEvent actionEvent) {
        ProductionMonitor selectedBatch = productionMonitorTableView.getSelectionModel().getSelectedItem();
        if (selectedBatch == null) {
            productionMonitorMessage.setText("No batch selected.");
            return;
        }

        int completedInput = completedUnitsSpinner.getValue();
        if (completedInput < 0 || completedInput + selectedBatch.getCompletedQua() > selectedBatch.getTargetQua()) {
            productionMonitorMessage.setText("Invalid completed units.");
            return;
        }
        selectedBatch.setCompletedQua(selectedBatch.getCompletedQua() + completedInput);
        selectedBatch.setNotes(notesTextArea.getText());
        double progress = ((double) selectedBatch.getCompletedQua() / selectedBatch.getTargetQua()) * 100;
        selectedBatch.setProgress(progress);

        if (selectedBatch.getCompletedQua() == selectedBatch.getTargetQua()) {
            selectedBatch.setStatus("Completed");
        } else {
            selectedBatch.setStatus("In Progress");
        }
        productionMonitorTableView.refresh();
        productionMonitorMessage.setText("Production progress updated. " + (int) progress + "% completed.");

        completedUnitsSpinner.getValueFactory().setValue(0);
        notesTextArea.clear();
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
    public void cancelProductionB(ActionEvent actionEvent) {
        completedUnitsSpinner.getValueFactory().setValue(0);
        notesTextArea.clear();
        productionMonitorMessage.setText("Update cancelled.");
    }
}