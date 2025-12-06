package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MaterialUpdateController
{
    @javafx.fxml.FXML
    private Spinner<Integer> quantityAvailableSpinner;
    @javafx.fxml.FXML
    private TextField warehouseLocationTextField;
    @javafx.fxml.FXML
    private Label materialUpdateMessage;
    @javafx.fxml.FXML
    private ComboBox <String> materialTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        materialTypeComboBox.getItems().setAll("Leather", "Rubber", "Foam", "Fabric", "Glue", "Thread", "Insole Material");
        quantityAvailableSpinner.setValueFactory(new javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10000, 0));
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
    public void saveUpdateB(ActionEvent actionEvent) {
        String materialType = materialTypeComboBox.getValue();
        Integer quantity = quantityAvailableSpinner.getValue();
        String warehouseLocation = warehouseLocationTextField.getText().trim();

        if (materialType == null || warehouseLocation.isEmpty() || quantity < 0) {
            materialUpdateMessage.setText("Please complete all fields correctly!");
            return;
        }
        MaterialUpdate update = new MaterialUpdate(materialType, warehouseLocation, quantity);
        System.out.println("Material Updated: " + update);

        materialUpdateMessage.setText("Material availability updated successfully.");

        materialTypeComboBox.getSelectionModel().clearSelection();
        quantityAvailableSpinner.getValueFactory().setValue(1);
        warehouseLocationTextField.clear();

    }
}