package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RMDashboardController
{
    @javafx.fxml.FXML
    private Button processProductReturnsButton;
    @javafx.fxml.FXML
    private Button approveCustomerOrdersButton;
    @javafx.fxml.FXML
    private Button scheduleStaffandAssignTasksButton;
    @javafx.fxml.FXML
    private Button generatePerformanceReportsButton;
    @javafx.fxml.FXML
    private Button handleDiscountButton;
    @javafx.fxml.FXML
    private Button launchorEndStorePromotionsButton;
    @javafx.fxml.FXML
    private Button ManageStoreInventoryButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewApproveCustomerOrdersPanel(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G2_ApproveOrders.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G2_ApproveOrders");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();

    }

    @javafx.fxml.FXML
    public void viewGeneratePerformanceReports(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewProcessProductReturnsPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewMonitorDailyStoreSalesPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewScheduleStaffandAssignTasks(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewHandleDiscountPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewManageStoreInventoryPannel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewLaunchorEndStorePromotionsPanel(ActionEvent actionEvent) {
    }
}