package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class GrievanceManagement
{
    @javafx.fxml.FXML
    private TextField complaintagainst;
    @javafx.fxml.FXML
    private TextArea detailsTA;
    @javafx.fxml.FXML
    private Label statuslabel;
    @javafx.fxml.FXML
    private ComboBox<String> complainttypeCB;

    @javafx.fxml.FXML
    public void initialize() {
        complainttypeCB.getItems().addAll("Workplace Issue","Harassment","Salary Issue","Other");
    }

    @javafx.fxml.FXML
    public void submitbtn(ActionEvent actionEvent) {

        String against = complaintagainst.getText().trim();
        String details = detailsTA.getText().trim();
        String type = complainttypeCB.getValue() != null ? complainttypeCB.getValue() : "";

        if (against.isEmpty() || details.isEmpty() || type.isEmpty()) {
            statuslabel.setText("Status: Please fill all fields!");
        } else {
            statuslabel.setText("Status: Grievance submitted successfully!");


            complaintagainst.clear();
            detailsTA.clear();
            complainttypeCB.getSelectionModel().clearSelection();
        }
    }
}