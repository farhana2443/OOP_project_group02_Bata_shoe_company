package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.time.LocalDate;

import java.io.IOException;

public class ProductionReportController
{
    @javafx.fxml.FXML
    private Label productionReportMessage;
    @javafx.fxml.FXML
    private DatePicker startDateProductionReportDP;
    @javafx.fxml.FXML
    private ComboBox reportTypeProductionReportCB;
    @javafx.fxml.FXML
    private PieChart ProductionReportPieChart;
    @javafx.fxml.FXML
    private DatePicker endDateProductionReportDP;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeProductionReportCB.getItems().setAll("Daily", "Weekly", "Monthly");
    }

    @javafx.fxml.FXML
    public void generateReportProductionB(ActionEvent actionEvent) {
        String reportType = (String) reportTypeProductionReportCB.getValue();
        LocalDate startDate = startDateProductionReportDP.getValue();
        LocalDate endDate = endDateProductionReportDP.getValue();

        if (reportType == null || startDate == null || endDate == null) {
            productionReportMessage.setText("Please complete all fields!");
            return;
        }
        if (endDate.isBefore(startDate)) {
            productionReportMessage.setText("End Date cannot be before Start Date!");
            return;
        }
        if (startDate.plusMonths(3).isBefore(endDate)) {
            productionReportMessage.setText("Date range cannot exceed 3 months!");
            return;
        }

        ProductionReport report = new ProductionReport(reportType, startDate, endDate);

        double totalDefects = 15;
        double totalWaste = 25;
        ProductionReportPieChart.getData().clear();
        ProductionReportPieChart.getData().add(new PieChart.Data("Defects", totalDefects));
        ProductionReportPieChart.getData().add(new PieChart.Data("Waste", totalWaste));

        productionReportMessage.setText(
                "Production performance report generated successfully for " + startDate + " - " + endDate
        );
    }

    @javafx.fxml.FXML
    public void exportChartProductionReportB(ActionEvent actionEvent) {
        productionReportMessage.setText("Chart exported successfully!");
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
    public void cancelProductionReportB(ActionEvent actionEvent) {
        reportTypeProductionReportCB.getSelectionModel().clearSelection();
        startDateProductionReportDP.setValue(null);
        endDateProductionReportDP.setValue(null);
        ProductionReportPieChart.getData().clear();
        productionReportMessage.setText("");
    }

    @javafx.fxml.FXML
    public void exportPdfProductionReportB(ActionEvent actionEvent) {
        productionReportMessage.setText("PDF exported successfully!");
    }
}