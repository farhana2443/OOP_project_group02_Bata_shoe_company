package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleController
{
    @javafx.fxml.FXML
    private Label createScheduleMessage;
    @javafx.fxml.FXML
    private ComboBox<String> shoeModelCB;
    @javafx.fxml.FXML
    private Spinner<Integer> targetQuantitySpinner;
    @javafx.fxml.FXML
    private DatePicker productionDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox <String>shiftCB;

    private List<Schedule> scheduleList = new ArrayList<>();
    private int scheduleIDCounter = 1000;

    @javafx.fxml.FXML
    public void initialize() {
        shoeModelCB.getItems().setAll("Sneaker", "Boot", "Loafer", "Sandal", "Sport Shoe", "Formal Shoe", "Casual Shoe");
        shiftCB.getItems().setAll("Morning", "Evening", "Night");

        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000, 10);
        targetQuantitySpinner.setValueFactory(valueFactory);
        createScheduleMessage.setText("");
    }

    @javafx.fxml.FXML
    public void saveScheduleButton(ActionEvent actionEvent) {
        String shoeModel = shoeModelCB.getValue();
        Integer targetQuantity = targetQuantitySpinner.getValue();
        LocalDate productionDate = productionDateDatePicker.getValue();
        String shift = shiftCB.getValue();

        if (shoeModel == null || shift == null || targetQuantity == null || productionDate == null) {
            createScheduleMessage.setText("Cannot save schedule. Fill all fields.");
            return;
        }
        if (targetQuantity <= 0) {
            createScheduleMessage.setText("Target quantity must be positive.");
            return;
        }
        if (productionDate.isBefore(LocalDate.now())) {
            createScheduleMessage.setText("Production date must be today or in the future.");
            return;
        }

        if (!isMaterialsAvailable(shoeModel, targetQuantity)) {
            int availableMaterials = getAvailableMaterials(shoeModel);
            createScheduleMessage.setText("Cannot save. Insufficient materials. Required: " +
                    targetQuantity + " units. Available: " + availableMaterials + " units.");
            return;
        }

        Schedule schedule = new Schedule(shoeModel, shift, targetQuantity, productionDate);
        scheduleList.add(schedule);
        int scheduleID = scheduleIDCounter++;

        createScheduleMessage.setText("Production schedule " + scheduleID +
                " created successfully for " + productionDate + " . ");

        clearFields();
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
    public void checkMaterialsButton(ActionEvent actionEvent) {
        String shoeModel = shoeModelCB.getValue();
        Integer targetQuantity = targetQuantitySpinner.getValue();
        LocalDate productionDate = productionDateDatePicker.getValue();
        String shift = shiftCB.getValue();

        if (shoeModel == null || shift == null || targetQuantity == null || productionDate == null) {
            createScheduleMessage.setText("Please fill all fields correctly.");
            return;
        }
        if (targetQuantity <= 0) {
            createScheduleMessage.setText("Target quantity must be positive.");
            return;
        }
        if (productionDate.isBefore(LocalDate.now())) {
            createScheduleMessage.setText("Production date must be today or in the future.");
            return;
        }

        int availableMaterials = getAvailableMaterials(shoeModel);

        if (isMaterialsAvailable(shoeModel, targetQuantity)) {
            createScheduleMessage.setText("Materials are sufficient. Available: " +
                    availableMaterials + "units for" + shoeModel + ".");
        } else {
            createScheduleMessage.setText("Insufficient materials. Required: " +
                    targetQuantity + " units. Available: " +
                    availableMaterials + "units for" + shoeModel + ".");
        }
    }

    private boolean isMaterialsAvailable(String shoeModel, int targetQuantity) {
        int availableQuantity = getAvailableMaterials(shoeModel);
        return targetQuantity <= availableQuantity;
    }

    private int getAvailableMaterials(String shoeModel) {
        switch (shoeModel) {
            case "Sneaker": return 150;
            case "Boot": return 80;
            case "Loafer": return 120;
            case "Sandal": return 200;
            case "Sport Shoe": return 100;
            case "Formal Shoe": return 90;
            case "Casual Shoe": return 130;
            default: return 100;
        }
    }

    private void clearFields() {
        shoeModelCB.setValue(null);
        shiftCB.setValue(null);
        productionDateDatePicker.setValue(null);
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000, 10);
        targetQuantitySpinner.setValueFactory(valueFactory);
    }

    public List<Schedule> getScheduleList() {
        return new ArrayList<>(scheduleList);
    }

}