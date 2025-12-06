package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;

import java.time.format.DateTimeFormatter;

public class trainingCalender
{
    @javafx.fxml.FXML
    private TableView<TrainingSession> trainingcalenderTV;
    @javafx.fxml.FXML
    private ComboBox<String> trainingCB;
    @javafx.fxml.FXML
    private TextField EmployeeIDTF;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> employeeID;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> TrainingProgram;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> Date;

    private ObservableList<TrainingSession> trainingList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        trainingCB.setItems(FXCollections.observableArrayList("Safety Training", "Customer Service","IT Skills","Sales Training","Leadership Workshop"));

        employeeID.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmployeeID()));
        TrainingProgram.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTrainingProgram()));
        Date.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDate()));

        trainingcalenderTV.setItems(trainingList);
    }

    @javafx.fxml.FXML
    public void addsessionbutton(ActionEvent actionEvent) {

        String empID = EmployeeIDTF.getText();
        String program = trainingCB.getValue();
        String date = (datepicker.getValue() != null) ? datepicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : "";

        if (empID.isEmpty() || program == null || date.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing Data");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all fields before adding a session.");
            alert.showAndWait();
            return;
        }

        TrainingSession session = new TrainingSession(empID, program, date);
        trainingList.add(session);

        EmployeeIDTF.clear();
        trainingCB.getSelectionModel().clearSelection();
        datepicker.setValue(null);
    }
}