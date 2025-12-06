package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class DefectController
{
    @javafx.fxml.FXML
    private ComboBox <String> batchIdDefectCB;
    @javafx.fxml.FXML
    private ComboBox <String> defectTypeCB;
    @javafx.fxml.FXML
    private Label DefectMessage;
    @javafx.fxml.FXML
    private TextArea descriptionDefectTA;
    @javafx.fxml.FXML
    private Spinner <Integer>quantityDefectiveSpinner;

    private ObservableList<String> batchIds = FXCollections.observableArrayList("B001", "B002", "B003");
    private ObservableList<String> defectTypes = FXCollections.observableArrayList("Stitching Error", "Sole Defect", "Color Issue");

    @javafx.fxml.FXML
    public void initialize() {
        batchIdDefectCB.setItems(batchIds);
        defectTypeCB.setItems(defectTypes);

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        quantityDefectiveSpinner.setValueFactory(valueFactory);
    }

    @javafx.fxml.FXML
    public void cancelDefectB(ActionEvent actionEvent) {
        batchIdDefectCB.getSelectionModel().clearSelection();
        defectTypeCB.getSelectionModel().clearSelection();
        quantityDefectiveSpinner.getValueFactory().setValue(0);
        descriptionDefectTA.clear();
        DefectMessage.setText("");
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
    public void registerDefectB(ActionEvent actionEvent) {
        String batchId = batchIdDefectCB.getValue();
        String defectType = defectTypeCB.getValue();
        int quantity = quantityDefectiveSpinner.getValue();
        String description = descriptionDefectTA.getText();

        if (batchId == null || defectType == null || quantity <= 0 || description.isEmpty()) {
            DefectMessage.setText("Please fill all fields correctly.");
            return;
        }

        Defect defect = new Defect(batchId, defectType, description, quantity);
        DefectMessage.setText("Defect registered successfully: " + defect.toString());
    }

}