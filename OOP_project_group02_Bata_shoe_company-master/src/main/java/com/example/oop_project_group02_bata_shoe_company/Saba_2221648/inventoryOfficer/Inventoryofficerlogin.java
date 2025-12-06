package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class Inventoryofficerlogin {
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField passTF;

    @javafx.fxml.FXML
    public void initialize() {
        emailTF.setText("Enter your E-mail");
        passTF.setText("Enter your password");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        String email = emailTF.getText();
        String password = passTF.getText();


        if (email.isEmpty() || password.isEmpty()) {
            showAlert("Error! Please fill all the fields.");
            return;
        }
        else {
            showAlert("Invalid email or password!");


        }
    }
    private void showAlert(String title) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.show();
    }
}