package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.RetailManager;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;

public class RMG1DailySales
{
    @javafx.fxml.FXML
    private ComboBox pamentTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn orderIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn totalAmountTableColumn;
    @javafx.fxml.FXML
    private TextField avgOrderValueTextField;
    @javafx.fxml.FXML
    private Button ApplyFilterButton;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private BarChart salesperformanceChart;
    @javafx.fxml.FXML
    private TableColumn paymentTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox categoryComboBox;
    @javafx.fxml.FXML
    private TableView dailySalesTableTV;
    @javafx.fxml.FXML
    private TextField totalSalesTextField;
    @javafx.fxml.FXML
    private TextField profitMarginTextField;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;

    @Override
    public String toString() {
        return "RMG1DailySales{" +
                "pamentTypeComboBox=" + pamentTypeComboBox +
                ", dateDatePicker=" + dateDatePicker +
                ", orderIdTableColumn=" + orderIdTableColumn +
                ", totalAmountTableColumn=" + totalAmountTableColumn +
                ", avgOrderValueTextField=" + avgOrderValueTextField +
                ", ApplyFilterButton=" + ApplyFilterButton +
                ", dateTableColumn=" + dateTableColumn +
                ", salesperformanceChart=" + salesperformanceChart +
                ", paymentTypeTableColumn=" + paymentTypeTableColumn +
                ", categoryComboBox=" + categoryComboBox +
                ", dailySalesTableTV=" + dailySalesTableTV +
                ", totalSalesTextField=" + totalSalesTextField +
                ", profitMarginTextField=" + profitMarginTextField +
                ", customerTableColumn=" + customerTableColumn +
                ", categoryTableColumn=" + categoryTableColumn +
                '}';
    }

    public ComboBox getPamentTypeComboBox() {
        return pamentTypeComboBox;
    }

    public void setPamentTypeComboBox(ComboBox pamentTypeComboBox) {
        this.pamentTypeComboBox = pamentTypeComboBox;
    }

    public DatePicker getDateDatePicker() {
        return dateDatePicker;
    }

    public void setDateDatePicker(DatePicker dateDatePicker) {
        this.dateDatePicker = dateDatePicker;
    }

    public TableColumn getOrderIdTableColumn() {
        return orderIdTableColumn;
    }

    public void setOrderIdTableColumn(TableColumn orderIdTableColumn) {
        this.orderIdTableColumn = orderIdTableColumn;
    }

    public TableColumn getTotalAmountTableColumn() {
        return totalAmountTableColumn;
    }

    public void setTotalAmountTableColumn(TableColumn totalAmountTableColumn) {
        this.totalAmountTableColumn = totalAmountTableColumn;
    }

    public TextField getAvgOrderValueTextField() {
        return avgOrderValueTextField;
    }

    public void setAvgOrderValueTextField(TextField avgOrderValueTextField) {
        this.avgOrderValueTextField = avgOrderValueTextField;
    }

    public Button getApplyFilterButton() {
        return ApplyFilterButton;
    }

    public void setApplyFilterButton(Button applyFilterButton) {
        ApplyFilterButton = applyFilterButton;
    }

    public TableColumn getDateTableColumn() {
        return dateTableColumn;
    }

    public void setDateTableColumn(TableColumn dateTableColumn) {
        this.dateTableColumn = dateTableColumn;
    }

    public BarChart getSalesperformanceChart() {
        return salesperformanceChart;
    }

    public void setSalesperformanceChart(BarChart salesperformanceChart) {
        this.salesperformanceChart = salesperformanceChart;
    }

    public TableColumn getPaymentTypeTableColumn() {
        return paymentTypeTableColumn;
    }

    public void setPaymentTypeTableColumn(TableColumn paymentTypeTableColumn) {
        this.paymentTypeTableColumn = paymentTypeTableColumn;
    }

    public ComboBox getCategoryComboBox() {
        return categoryComboBox;
    }

    public void setCategoryComboBox(ComboBox categoryComboBox) {
        this.categoryComboBox = categoryComboBox;
    }

    public TableView getDailySalesTableTV() {
        return dailySalesTableTV;
    }

    public void setDailySalesTableTV(TableView dailySalesTableTV) {
        this.dailySalesTableTV = dailySalesTableTV;
    }

    public TextField getTotalSalesTextField() {
        return totalSalesTextField;
    }

    public void setTotalSalesTextField(TextField totalSalesTextField) {
        this.totalSalesTextField = totalSalesTextField;
    }

    public TextField getProfitMarginTextField() {
        return profitMarginTextField;
    }

    public void setProfitMarginTextField(TextField profitMarginTextField) {
        this.profitMarginTextField = profitMarginTextField;
    }

    public TableColumn getCustomerTableColumn() {
        return customerTableColumn;
    }

    public void setCustomerTableColumn(TableColumn customerTableColumn) {
        this.customerTableColumn = customerTableColumn;
    }

    public TableColumn getCategoryTableColumn() {
        return categoryTableColumn;
    }

    public void setCategoryTableColumn(TableColumn categoryTableColumn) {
        this.categoryTableColumn = categoryTableColumn;
    }

    public RMG1DailySales(ComboBox pamentTypeComboBox, DatePicker dateDatePicker, TableColumn orderIdTableColumn, TableColumn totalAmountTableColumn, TextField avgOrderValueTextField, Button applyFilterButton, TableColumn dateTableColumn, BarChart salesperformanceChart, TableColumn paymentTypeTableColumn, ComboBox categoryComboBox, TableView dailySalesTableTV, TextField totalSalesTextField, TextField profitMarginTextField, TableColumn customerTableColumn, TableColumn categoryTableColumn) {
        this.pamentTypeComboBox = pamentTypeComboBox;
        this.dateDatePicker = dateDatePicker;
        this.orderIdTableColumn = orderIdTableColumn;
        this.totalAmountTableColumn = totalAmountTableColumn;
        this.avgOrderValueTextField = avgOrderValueTextField;
        ApplyFilterButton = applyFilterButton;
        this.dateTableColumn = dateTableColumn;
        this.salesperformanceChart = salesperformanceChart;
        this.paymentTypeTableColumn = paymentTypeTableColumn;
        this.categoryComboBox = categoryComboBox;
        this.dailySalesTableTV = dailySalesTableTV;
        this.totalSalesTextField = totalSalesTextField;
        this.profitMarginTextField = profitMarginTextField;
        this.customerTableColumn = customerTableColumn;
        this.categoryTableColumn = categoryTableColumn;
    }

    @javafx.fxml.FXML
    private TableColumn categoryTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyFilterButton(ActionEvent actionEvent) {
    }
}