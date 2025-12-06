package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;

public class RMG8Report
{
    public Button getGenerateReportBtn() {
        return generateReportBtn;
    }

    public void setGenerateReportBtn(Button generateReportBtn) {
        this.generateReportBtn = generateReportBtn;
    }

    @Override
    public String toString() {
        return "RMG8Report{" +
                "generateReportBtn=" + generateReportBtn +
                ", reportSummaryTA=" + reportSummaryTA +
                ", summaryChart=" + summaryChart +
                ", reportTypeCB=" + reportTypeCB +
                '}';
    }

    public TextArea getReportSummaryTA() {
        return reportSummaryTA;
    }

    public void setReportSummaryTA(TextArea reportSummaryTA) {
        this.reportSummaryTA = reportSummaryTA;
    }

    public LineChart getSummaryChart() {
        return summaryChart;
    }

    public void setSummaryChart(LineChart summaryChart) {
        this.summaryChart = summaryChart;
    }

    public ComboBox getReportTypeCB() {
        return reportTypeCB;
    }

    public void setReportTypeCB(ComboBox reportTypeCB) {
        this.reportTypeCB = reportTypeCB;
    }

    @javafx.fxml.FXML
    private Button generateReportBtn;
    @javafx.fxml.FXML
    private TextArea reportSummaryTA;
    @javafx.fxml.FXML
    private LineChart summaryChart;

    public RMG8Report(Button generateReportBtn, TextArea reportSummaryTA, LineChart summaryChart, ComboBox reportTypeCB) {
        this.generateReportBtn = generateReportBtn;
        this.reportSummaryTA = reportSummaryTA;
        this.summaryChart = summaryChart;
        this.reportTypeCB = reportTypeCB;
    }

    @javafx.fxml.FXML
    private ComboBox reportTypeCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void printReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateAndExportPDF(ActionEvent actionEvent) {
    }
}