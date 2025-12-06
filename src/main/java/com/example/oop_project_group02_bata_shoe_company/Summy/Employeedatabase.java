package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.*;

public class Employeedatabase
{
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentChangeCB;
    @javafx.fxml.FXML
    private ComboBox<String> rolechangeCB;
    @javafx.fxml.FXML
    private TextField emailchangeTF;
    @javafx.fxml.FXML
    private Label updatechangestatusLabel;
    @javafx.fxml.FXML
    private TextField phonechangeTB;
    @javafx.fxml.FXML
    private TextField NameTF;
    @javafx.fxml.FXML
    private TextField IDTF;

    @javafx.fxml.FXML
    public void initialize() {
        DepartmentChangeCB.getItems().addAll("Finance", "HR", "Sales");

        rolechangeCB.getItems().addAll(
                "HR Executive", "Accounts", "Sales Executive");
    }



    @javafx.fxml.FXML
    public void editBIN(ActionEvent actionEvent) {
        String id = IDTF.getText();
        if (id.isEmpty()) {
            updatechangestatusLabel.setText("Enter Employee ID!");
            return;
        }
        StringBuilder changes = new StringBuilder("Changes for " + id + ":\n");

        if (!NameTF.getText().isEmpty()) changes.append("Name: ").append(NameTF.getText()).append("\n");
        if (DepartmentChangeCB.getValue() != null) changes.append("Department: ").append(DepartmentChangeCB.getValue()).append("\n");
        if (rolechangeCB.getValue() != null) changes.append("Role: ").append(rolechangeCB.getValue()).append("\n");
        if (!phonechangeTB.getText().isEmpty()) changes.append("Phone: ").append(phonechangeTB.getText()).append("\n");
        if (!emailchangeTF.getText().isEmpty()) changes.append("Email: ").append(emailchangeTF.getText()).append("\n");

        if (changes.toString().equals("Changes for " + id + ":\n")) {
            updatechangestatusLabel.setText("No changes entered!");
        } else {
            updatechangestatusLabel.setText(changes.toString());
        }


    }
}