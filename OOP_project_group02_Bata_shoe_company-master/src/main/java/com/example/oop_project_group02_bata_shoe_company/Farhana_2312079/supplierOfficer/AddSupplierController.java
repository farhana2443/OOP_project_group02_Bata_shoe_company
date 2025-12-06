package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class AddSupplierController {
    @javafx.fxml.FXML
    private CheckBox fabricCheckBox;
    @javafx.fxml.FXML
    private TextField supplierNameTF;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private TextField contactPersonTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private CheckBox rubberCheckBox;
    @javafx.fxml.FXML
    private CheckBox adhesivesCheckBox;
    @javafx.fxml.FXML
    private CheckBox leatherCheckBox;
    @javafx.fxml.FXML
    private Label manageSuppliersMessage;
    @javafx.fxml.FXML
    private CheckBox lacesCheckBox;

    private AddSupplier supplier;

    @javafx.fxml.FXML
    public void initialize() {
        supplier = new AddSupplier("", "", "", "", 0, new ArrayList<>());

        fabricCheckBox.setOnAction(e -> {
            if (fabricCheckBox.isSelected())
                supplier.getSelectedItems().add("Fabric");
            else
                supplier.getSelectedItems().remove("Fabric");
        });

        rubberCheckBox.setOnAction(e -> {
            if (rubberCheckBox.isSelected())
                supplier.getSelectedItems().add("Rubber Sole");
            else
                supplier.getSelectedItems().remove("Rubber Sole");
        });

        adhesivesCheckBox.setOnAction(e -> {
            if (adhesivesCheckBox.isSelected())
                supplier.getSelectedItems().add("Adhesives");
            else
                supplier.getSelectedItems().remove("Adhesives");
        });

        leatherCheckBox.setOnAction(e -> {
            if (leatherCheckBox.isSelected())
                supplier.getSelectedItems().add("Leather");
            else
                supplier.getSelectedItems().remove("Leather");
        });

        lacesCheckBox.setOnAction(e -> {
            if (lacesCheckBox.isSelected())
                supplier.getSelectedItems().add("Laces");
            else
                supplier.getSelectedItems().remove("Laces");
        });
    }

    @javafx.fxml.FXML
    public void cancelSuppliersB(ActionEvent actionEvent) {
        supplierNameTF.clear();
        contactPersonTF.clear();
        emailTF.clear();
        phoneTF.clear();
        addressTA.clear();

        fabricCheckBox.setSelected(false);
        rubberCheckBox.setSelected(false);
        adhesivesCheckBox.setSelected(false);
        leatherCheckBox.setSelected(false);
        lacesCheckBox.setSelected(false);

        supplier.getSelectedItems().clear();
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
    public void saveSupplierB(ActionEvent actionEvent) {

        String name = supplierNameTF.getText().trim();
        String contact = contactPersonTF.getText().trim();
        String email = emailTF.getText().trim();
        String phone = phoneTF.getText().trim();
        String address = addressTA.getText().trim();

        if (name.isEmpty() || contact.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
            manageSuppliersMessage.setText("All fields are required");
            return;
        }
        if (!email.contains("@")) {
            manageSuppliersMessage.setText("Invalid email format");
            return;
        }
        if (!phone.matches("\\d+")) {
            manageSuppliersMessage.setText("Phone must be numeric");
            return;
        }
        if (isDuplicateSupplier(name)) {
            manageSuppliersMessage.setText("Supplier already exists");
            return;
        }

        AddSupplier newSupplier = new AddSupplier(
                name,
                email,
                contact,
                address,
                Integer.parseInt(phone),
                new ArrayList<>(supplier.getSelectedItems())
        );

        SupplierData.supplierList.add(newSupplier);

        supplierNameTF.clear();
        contactPersonTF.clear();
        emailTF.clear();
        phoneTF.clear();
        addressTA.clear();

        fabricCheckBox.setSelected(false);
        rubberCheckBox.setSelected(false);
        adhesivesCheckBox.setSelected(false);
        leatherCheckBox.setSelected(false);
        lacesCheckBox.setSelected(false);

        supplier.getSelectedItems().clear();

        manageSuppliersMessage.setText("Supplier " + name + " added successfully.");
    }
    private boolean isDuplicateSupplier(String name) {
        for (AddSupplier s : SupplierData.supplierList) {
            if (s.getSupplierName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}