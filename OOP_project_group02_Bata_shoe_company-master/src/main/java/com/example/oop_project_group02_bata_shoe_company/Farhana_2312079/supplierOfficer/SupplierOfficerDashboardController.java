package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageSuppliersButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddSupplier.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Manage Suppliers");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void sendUpdatesButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MaterialUpdate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Send Updates");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void supplierPerformanceButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SupplierPerformance.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Supplier Performance");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void generateReportsButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SupplyReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Generate Reports");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void managePurchaseOrdersButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PurchaseOrder.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Manage Purchase Orders");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void materialRestockButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MaterialRestock.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Material Restock");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void trackDeliveriesButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeliveryTracking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Track Deliveries");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void processInvoicesButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InvoiceProcessing.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Process Invoices");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void signOutToLoginPageB2(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/oop_project_group02_bata_shoe_company/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }
}