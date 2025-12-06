package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaterialRestockController
{
    @javafx.fxml.FXML
    private Spinner <Integer> upthresholdLevelRestockS;
    @javafx.fxml.FXML
    private TableColumn<MaterialRestock, String> materialNameRestockC;
    @javafx.fxml.FXML
    private TableColumn<MaterialRestock, Integer> currentQuantityRestockC;
    @javafx.fxml.FXML
    private Spinner <Integer> restockQuantityS;
    @javafx.fxml.FXML
    private TableColumn<MaterialRestock, String> checkboxColumn;
    @javafx.fxml.FXML
    private TableColumn <MaterialRestock, String>thresholdLevelRestockC;
    @javafx.fxml.FXML
    private TableColumn<MaterialRestock, String> statusRestockC;
    @javafx.fxml.FXML
    private Label materialNameRestockLabel;
    @javafx.fxml.FXML
    private TableView <MaterialRestock>materialRestockTableView;
    @javafx.fxml.FXML
    private Label materialRestockMessage;
    @javafx.fxml.FXML
    private ComboBox <String>thresholdLevelRestockCB;

    private final List<MaterialRestock> materialList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        thresholdLevelRestockCB.getItems().setAll(" Below 10", "Below 20", "Below 50", "Below 100", "Critical Only", "Show All");

        materialNameRestockC.setCellValueFactory(new PropertyValueFactory<>("materialName"));
        currentQuantityRestockC.setCellValueFactory(new PropertyValueFactory<>("currentQun"));
        thresholdLevelRestockC.setCellValueFactory(new PropertyValueFactory<>("thresholdLevel"));
        statusRestockC.setCellValueFactory(new PropertyValueFactory<>("status"));
        checkboxColumn.setCellValueFactory(new PropertyValueFactory<>("checkbox"));

        upthresholdLevelRestockS.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        restockQuantityS.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 500, 0));

        loadSampleData();

        if (!materialRestockTableView.getItems().isEmpty()) {
            MaterialRestock first = materialRestockTableView.getItems().get(0);
            materialNameRestockLabel.setText(first.getMaterialName());
        }
    }

    private void loadSampleData() {
        materialList.clear();
        materialList.add(new MaterialRestock("Below 10", "Leather", "Low", "Unchecked", 10, 50, 5));
        materialList.add(new MaterialRestock("Below 20", "Rubber", "OK", "Unchecked", 20, 30, 15));
        materialList.add(new MaterialRestock("Critical Only", "Thread", "Critical", "Unchecked", 5, 20, 2));

        materialRestockTableView.getItems().setAll(materialList);

    }

    @javafx.fxml.FXML
    public void saveUpdateRestockB(ActionEvent actionEvent) {
        materialRestockMessage.setText("Restock updates saved successfully.");
    }

    @javafx.fxml.FXML
    public void applyFilterButton(ActionEvent actionEvent) {
        String filter = thresholdLevelRestockCB.getValue();
        if (filter == null || filter.isEmpty() || filter.equals("Show All")) {
            materialRestockTableView.getItems().setAll(materialList);
        } else {
            List<MaterialRestock> filtered = new ArrayList<>();
            for (MaterialRestock m : materialList) {
                if (m.getThresholdLevel().equals(filter)) {
                    filtered.add(m);
                }
            }
            materialRestockTableView.getItems().setAll(filtered);
        }
        materialRestockMessage.setText("Filter applied: " + filter);
    }

    @javafx.fxml.FXML
    public void updateMaterialsRestockB(ActionEvent actionEvent) {
        MaterialRestock selected = materialRestockTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setUpthresholdLevel(upthresholdLevelRestockS.getValue());
            selected.setRestockQun(restockQuantityS.getValue());
            materialNameRestockLabel.setText(selected.getMaterialName());
            materialRestockMessage.setText("Material updated: " + selected.getMaterialName());
            materialRestockTableView.refresh();
        } else {
            materialRestockMessage.setText("Select a material to update.");
        }
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
    public void cancelRestockB(ActionEvent actionEvent) {
        materialRestockMessage.setText("Update canceled.");
    }

    @javafx.fxml.FXML
    public void producePurchaseOrderB(ActionEvent actionEvent) {
        materialRestockMessage.setText("Purchase order generated for selected materials.");
    }

    @javafx.fxml.FXML
    public void resetFilterButton(ActionEvent actionEvent) {
        thresholdLevelRestockCB.setValue(null);
        materialRestockTableView.getItems().setAll(materialList);
        materialRestockMessage.setText("Filter reset.");
    }
}