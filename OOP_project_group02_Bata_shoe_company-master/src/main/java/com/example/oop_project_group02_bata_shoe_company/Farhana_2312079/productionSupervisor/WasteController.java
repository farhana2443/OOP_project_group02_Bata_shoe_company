package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class WasteController
{
    @javafx.fxml.FXML
    private ComboBox <String>wasteReasonCB;
    @javafx.fxml.FXML
    private ComboBox <String>shiftWasteCB;
    @javafx.fxml.FXML
    private ComboBox <String>materialTypeWasteCB;
    @javafx.fxml.FXML
    private Label wasteMessage;
    @javafx.fxml.FXML
    private TextArea notesWasteTA;
    @javafx.fxml.FXML
    private Spinner <Integer>wasteQuantitySpinner;

    @javafx.fxml.FXML
    public void initialize() {
        materialTypeWasteCB.getItems().setAll("Leather", "Rubber", "Foam", "Fabric", "Glue", "Thread", "Insole", "Packaging");
        wasteReasonCB.getItems().setAll("Cutting Error", "Defect", "Spillage", "Transport Damage", "Other");
        shiftWasteCB.getItems().setAll("Morning", "Evening", "Night");

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0);
        wasteQuantitySpinner.setValueFactory(valueFactory);
    }

    @javafx.fxml.FXML
    public void viewStatisticsWasteB(ActionEvent actionEvent) {
        wasteMessage.setText("Waste statistics displayed (demo).");
    }

    @javafx.fxml.FXML
    public void recordWasteButton(ActionEvent actionEvent) {
        String materialType = (String) materialTypeWasteCB.getValue();
        String wasteReason = (String) wasteReasonCB.getValue();
        String shift = (String) shiftWasteCB.getValue();
        String notes = notesWasteTA.getText();
        int wasteQuantity = (int) wasteQuantitySpinner.getValue();

        if (materialType == null || materialType.isEmpty() ||
                wasteReason == null || wasteReason.isEmpty() ||
                shift == null || shift.isEmpty() ||
                wasteQuantity <= 0) {
            wasteMessage.setText("Please complete all required fields.");
            return;
        }
        int totalMaterialUsed = 1000;
        double wastePercent = ((double) wasteQuantity / totalMaterialUsed) * 100;

        if (wastePercent > 5) {
            wasteMessage.setText("Waste limit exceeded. Current: " + String.format("%.2f", wastePercent) + "%");
        } else {
            wasteMessage.setText("Waste recorded successfully.");
        }

        Waste waste = new Waste(materialType, wasteReason, shift, notes, wasteQuantity);
        System.out.println(waste);
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