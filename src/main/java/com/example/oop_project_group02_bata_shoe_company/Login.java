package com.example.oop_project_group02_bata_shoe_company;

import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Login
{
    @javafx.fxml.FXML
    private ComboBox<String> employeetypecombobox;
    @javafx.fxml.FXML
    private TextField employeepasswordTF;
    @javafx.fxml.FXML
    private Button employeeloginbutton;
    @javafx.fxml.FXML
    private Button Customerloginbutton;
    @javafx.fxml.FXML
    private TextField employeeidTF;

    @javafx.fxml.FXML
    public void initialize() {
        employeetypecombobox.getItems().addAll("Finance Officer", "HR Manager");
    }

    @javafx.fxml.FXML
    public void onEmployeeLogin(ActionEvent actionEvent) {

        String selectedType = employeetypecombobox.getValue();
        String password = employeepasswordTF.getText().trim();

        if (selectedType == null) {
            showAlert("Please select an employee type!");
            return;
        }

        if (password.isEmpty()) {
            showAlert("Please enter a password!");
            return;
        }

        try {
            FXMLLoader loader;
            if (selectedType.equals("Finance Officer") && password.equals("1234")) {
                loader = new FXMLLoader(getClass().getResource("Summy/finance_dashboard.fxml"));
            } else if (selectedType.equals("HR Manager") && password.equals("12345")) {
                loader = new FXMLLoader(getClass().getResource("Summy/RecruitmentPortalDashboardHR.fxml"));
            } else {
                showAlert("Incorrect password for selected employee type!");
                return;
            }


            Scene newScene = new Scene(loader.load());
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(newScene);
            currentStage.setTitle(selectedType + " Dashboard");

        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Failed to load the dashboard scene.");
        }

    }

    @javafx.fxml.FXML
    public void onCustomerLogin(ActionEvent actionEvent) {
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Login Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}