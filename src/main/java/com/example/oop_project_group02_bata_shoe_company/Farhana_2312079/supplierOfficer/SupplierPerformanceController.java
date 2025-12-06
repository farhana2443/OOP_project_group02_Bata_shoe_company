package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SupplierPerformanceController
{
    @javafx.fxml.FXML
    private TableView<SupplierPerformance> supplierPerformanceTableView;
    @javafx.fxml.FXML
    private Label messageSupplierPerformanceLabel;
    @javafx.fxml.FXML
    private TableColumn<SupplierPerformance,Integer> totalOrdersC;
    @javafx.fxml.FXML
    private TableColumn<SupplierPerformance,Integer> onTimeDeliveriesC;
    @javafx.fxml.FXML
    private TableColumn<SupplierPerformance,Double> performanceC;
    @javafx.fxml.FXML
    private TableColumn <SupplierPerformance,String>supplierNameC2;

    @javafx.fxml.FXML
    public void initialize() {
        supplierNameC2.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        totalOrdersC.setCellValueFactory(new PropertyValueFactory<>("totalOrders"));
        onTimeDeliveriesC.setCellValueFactory(new PropertyValueFactory<>("onTimeDeliveries"));
        performanceC.setCellValueFactory(new PropertyValueFactory<>("performance"));

        loadSupplierPerformanceData();
    }
    private void loadSupplierPerformanceData() {
        List<SupplierPerformance> data = new ArrayList<>();
        data.add(new SupplierPerformance("Supplier A", 20, 95.0, 19));
        data.add(new SupplierPerformance("Supplier B", 15, 80.0, 12));
        data.add(new SupplierPerformance("Supplier C", 10, 100.0, 10));

        supplierPerformanceTableView.getItems().setAll(data);
    }

    @javafx.fxml.FXML
    public void viewDetailsSupplierPerB(ActionEvent actionEvent) {
        SupplierPerformance selected = supplierPerformanceTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            messageSupplierPerformanceLabel.setText(
                    "Supplier: " + selected.getSupplierName() +
                            ", Total Orders: " + selected.getTotalOrders() +
                            ", On-Time: " + selected.getOnTimeDeliveries() +
                            ", Performance: " + selected.getPerformance() + "%"
            );
        } else {
            messageSupplierPerformanceLabel.setText("Please select a supplier to view details.");
        }

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
    public void exportReportB(ActionEvent actionEvent) {
        messageSupplierPerformanceLabel.setText("Report exported successfully.");
    }
}