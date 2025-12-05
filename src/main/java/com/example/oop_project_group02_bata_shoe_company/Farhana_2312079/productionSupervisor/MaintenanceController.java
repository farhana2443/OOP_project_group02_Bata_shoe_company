package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class MaintenanceController
{
    @javafx.fxml.FXML
    private TextArea issueDescriptionMaintenanceTA;
    @javafx.fxml.FXML
    private TableView<Maintenance> maintenanceTableView;
    @javafx.fxml.FXML
    private TableColumn<Maintenance,String> currentStatusMaintenanceC;
    @javafx.fxml.FXML
    private ComboBox <String>urgencyLevelMaintenanceCB;
    @javafx.fxml.FXML
    private ComboBox <String>expectedDowntimeMaintenanceCB;
    @javafx.fxml.FXML
    private Label maintenanceMessage;
    @javafx.fxml.FXML
    private TableColumn <Maintenance,String>machineNameMaintenanceC;
    @javafx.fxml.FXML
    private TableColumn<Maintenance,String> machineIDMaintenanceC;
    @javafx.fxml.FXML
    private TableColumn <Maintenance, LocalDate>lastMaintenanceDateC;

    @javafx.fxml.FXML
    public void initialize() {
        urgencyLevelMaintenanceCB.getItems().setAll(" Low", "Medium", "High", "Critical");
        expectedDowntimeMaintenanceCB.getItems().setAll("Less than 1 hour", "1-4 hours", "More than 4 hours");

        machineIDMaintenanceC.setCellValueFactory(new PropertyValueFactory<>("machineId"));
        machineNameMaintenanceC.setCellValueFactory(new PropertyValueFactory<>("machineName"));
        currentStatusMaintenanceC.setCellValueFactory(new PropertyValueFactory<>("currentStatus"));
        lastMaintenanceDateC.setCellValueFactory(new PropertyValueFactory<>("lastMaintenanceDate"));

        maintenanceTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        issueDescriptionMaintenanceTA.setDisable(true);
        urgencyLevelMaintenanceCB.setDisable(true);
        expectedDowntimeMaintenanceCB.setDisable(true);

        maintenanceTableView.getItems().add(new Maintenance(
                "M001", "Shoe Cutter", "Idle", "", "", "", LocalDate.now().minusMonths(1)
        ));
        maintenanceTableView.getItems().add(new Maintenance(
                "M002", "Sole Press", "Idle", "", "", "", LocalDate.now().minusMonths(2)
        ));
        maintenanceTableView.getItems().add(new Maintenance(
                "M003", "Stitching Machine", "Idle", "", "", "", LocalDate.now().minusMonths(1)
        ));
    }

    @javafx.fxml.FXML
    public void cancelMaintenanceB(ActionEvent actionEvent) {
        issueDescriptionMaintenanceTA.clear();
        urgencyLevelMaintenanceCB.setValue(null);
        expectedDowntimeMaintenanceCB.setValue(null);
        issueDescriptionMaintenanceTA.setDisable(true);
        urgencyLevelMaintenanceCB.setDisable(true);
        expectedDowntimeMaintenanceCB.setDisable(true);
        maintenanceMessage.setText("Request cancelled.");
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
    public void createRequestMaintenanceB(ActionEvent actionEvent) {
        Maintenance selectedMachine = maintenanceTableView.getSelectionModel().getSelectedItem();
        if (selectedMachine == null) {
            maintenanceMessage.setText("Please select a machine to create request.");
            return;
        }
        issueDescriptionMaintenanceTA.setDisable(false);
        urgencyLevelMaintenanceCB.setDisable(false);
        expectedDowntimeMaintenanceCB.setDisable(false);
        issueDescriptionMaintenanceTA.setText(selectedMachine.getIssueDesc());
        urgencyLevelMaintenanceCB.setValue(selectedMachine.getUrgencyLvl());
        expectedDowntimeMaintenanceCB.setValue(selectedMachine.getExpDowntime());

        maintenanceMessage.setText("Enter issue details and click Submit.");
    }

    @javafx.fxml.FXML
    public void submitRequestMaintenanceB(ActionEvent actionEvent) {
        Maintenance selectedMachine = maintenanceTableView.getSelectionModel().getSelectedItem();
        if (selectedMachine == null) {
            maintenanceMessage.setText("No machine selected.");
            return;
        }

        String issueDesc = issueDescriptionMaintenanceTA.getText().trim();
        String urgency = urgencyLevelMaintenanceCB.getValue();
        String downtime = expectedDowntimeMaintenanceCB.getValue();

        if (issueDesc.isEmpty() || urgency == null || downtime == null) {
            maintenanceMessage.setText("Please complete all required fields.");
            return;
        }
        selectedMachine.setIssueDesc(issueDesc);
        selectedMachine.setUrgencyLvl(urgency);
        selectedMachine.setExpDowntime(downtime);
        selectedMachine.setCurrentStatus("Maintenance Requested");

        maintenanceTableView.refresh();
        maintenanceMessage.setText("Maintenance request submitted. Maintenance team notified.");
        issueDescriptionMaintenanceTA.clear();
        urgencyLevelMaintenanceCB.setValue(null);
        expectedDowntimeMaintenanceCB.setValue(null);

        issueDescriptionMaintenanceTA.setDisable(true);
        urgencyLevelMaintenanceCB.setDisable(true);
        expectedDowntimeMaintenanceCB.setDisable(true);
    }

    @javafx.fxml.FXML
    public void viewHistoryMaintenanceB(ActionEvent actionEvent) {
        Maintenance selectedMachine = maintenanceTableView.getSelectionModel().getSelectedItem();
        if (selectedMachine == null) {
            maintenanceMessage.setText("Please select a machine to view history.");
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Maintenance History");
        alert.setHeaderText("Machine: " + selectedMachine.getMachineName());
        alert.setContentText(
                "Machine ID: " + selectedMachine.getMachineId() + "\n" +
                        "Current Status: " + selectedMachine.getCurrentStatus() + "\n" +
                        "Last Maintenance Date: " + selectedMachine.getLastMaintenanceDate() + "\n" +
                        "Issue Description: " + selectedMachine.getIssueDesc() + "\n" +
                        "Urgency Level: " + selectedMachine.getUrgencyLvl() + "\n" +
                        "Expected Downtime: " + selectedMachine.getExpDowntime()
        );
        alert.showAndWait();
    }
}