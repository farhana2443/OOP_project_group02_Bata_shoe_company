package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class FinanceDashboard
{
    @javafx.fxml.FXML
    private Button btnPayrollProcessing;
    @javafx.fxml.FXML
    private Button btnVendorPayments;
    @javafx.fxml.FXML
    private Button btnMonthlyReport;
    @javafx.fxml.FXML
    private Button ApplyFilterbtn;
    @javafx.fxml.FXML
    private Button btnbankreconciliation;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn BranchTableColumn;
    @javafx.fxml.FXML
    private ComboBox financebranchCB;
    @javafx.fxml.FXML
    private DatePicker financedatepickerCB;
    @javafx.fxml.FXML
    private TableColumn expenseTableColumn;
    @javafx.fxml.FXML
    private Button btnexpensetracker;
    @javafx.fxml.FXML
    private Button btnbudgetforecast;
    @javafx.fxml.FXML
    private TableView financedashboardTableVIew;
    @javafx.fxml.FXML
    private TableColumn incomeTableColumn;
    @javafx.fxml.FXML
    private Label StatusoffilterLabel;
    @javafx.fxml.FXML
    private Button btntaxreport;



    public FinanceDashboard() { }
    public void initialize() {
        financebranchCB.getItems().addAll("All","Dhaka", "Chittagong", "Rangpur");

        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        BranchTableColumn.setCellValueFactory(new PropertyValueFactory<>("branch"));
        incomeTableColumn.setCellValueFactory(new PropertyValueFactory<>("income"));
        expenseTableColumn.setCellValueFactory(new PropertyValueFactory<>("expense"));

        financedashboardTableVIew.setItems(FileHelperModelClass.getObservableRecords());
        StatusoffilterLabel.setText("Showing all records");


    }

    private void switchScene(String fxmlFile, Button button) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) button.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void openVendorPayments(ActionEvent actionEvent) {
        switchScene("vendor_payment.fxml", btnVendorPayments);
    }

    @javafx.fxml.FXML
    public void openMonthlyReport(ActionEvent actionEvent) {
        switchScene("MothlyReport.fxml", btnMonthlyReport);
    }

    @javafx.fxml.FXML
    public void openPayroll(ActionEvent actionEvent) {
        switchScene("payroll_processing.fxml", btnPayrollProcessing);
    }

    @javafx.fxml.FXML
    public void filterTable(ActionEvent actionEvent) {

        ObservableList<FinanceRecordModelClass> records = FileHelperModelClass.getObservableRecords();
        LocalDate selectedDate = financedatepickerCB.getValue();
        String selectedBranch = (String) financebranchCB.getValue();


        if (selectedDate != null) {
            records = records.filtered(record -> record.getDate().equals(selectedDate));
        }


        if (selectedBranch != null && !selectedBranch.equals("All") && !selectedBranch.isEmpty()) {
            records = records.filtered(record -> record.getBranch().equals(selectedBranch));
        }

        financedashboardTableVIew.setItems(records);


        if ((selectedDate == null || selectedDate.toString().isEmpty()) &&
                (selectedBranch == null || selectedBranch.equals("All") || selectedBranch.isEmpty())) {
            StatusoffilterLabel.setText("Showing all records");
        } else {
            StatusoffilterLabel.setText("Filtered records: " + records.size());
        }
    }

    @javafx.fxml.FXML


    public Button getBtnPayrollProcessing() {
        return btnPayrollProcessing;
    }

    public void setBtnPayrollProcessing(Button btnPayrollProcessing) {
        this.btnPayrollProcessing = btnPayrollProcessing;
    }

    public Button getBtnVendorPayments() {
        return btnVendorPayments;
    }

    public void setBtnVendorPayments(Button btnVendorPayments) {
        this.btnVendorPayments = btnVendorPayments;
    }

    public Button getBtnMonthlyReport() {
        return btnMonthlyReport;
    }

    public void setBtnMonthlyReport(Button btnMonthlyReport) {
        this.btnMonthlyReport = btnMonthlyReport;
    }

    public Button getApplyFilterbtn() {
        return ApplyFilterbtn;
    }

    public void setApplyFilterbtn(Button applyFilterbtn) {
        ApplyFilterbtn = applyFilterbtn;
    }

    public Button getBtnbankreconciliation() {
        return btnbankreconciliation;
    }

    public void setBtnbankreconciliation(Button btnbankreconciliation) {
        this.btnbankreconciliation = btnbankreconciliation;
    }

    public TableColumn getDateTableColumn() {
        return dateTableColumn;
    }

    public void setDateTableColumn(TableColumn dateTableColumn) {
        this.dateTableColumn = dateTableColumn;
    }

    public TableColumn getBranchTableColumn() {
        return BranchTableColumn;
    }

    public void setBranchTableColumn(TableColumn branchTableColumn) {
        BranchTableColumn = branchTableColumn;
    }

    public ComboBox getFinancebranchCB() {
        return financebranchCB;
    }

    public void setFinancebranchCB(ComboBox financebranchCB) {
        this.financebranchCB = financebranchCB;
    }

    @Override
    public String toString() {
        return "FinanceDashboard{" +
                "btnPayrollProcessing=" + btnPayrollProcessing +
                ", btnVendorPayments=" + btnVendorPayments +
                ", btnMonthlyReport=" + btnMonthlyReport +
                ", ApplyFilterbtn=" + ApplyFilterbtn +
                ", btnbankreconciliation=" + btnbankreconciliation +
                ", dateTableColumn=" + dateTableColumn +
                ", BranchTableColumn=" + BranchTableColumn +
                ", financebranchCB=" + financebranchCB +
                ", financedatepickerCB=" + financedatepickerCB +
                ", expenseTableColumn=" + expenseTableColumn +
                ", btnexpensetracker=" + btnexpensetracker +
                ", btnbudgetforecast=" + btnbudgetforecast +
                ", financedashboardTableVIew=" + financedashboardTableVIew +
                ", incomeTableColumn=" + incomeTableColumn +
                ", StatusoffilterLabel=" + StatusoffilterLabel +
                ", btntaxreport=" + btntaxreport +
                '}';
    }

    public DatePicker getFinancedatepickerCB() {
        return financedatepickerCB;
    }

    public void setFinancedatepickerCB(DatePicker financedatepickerCB) {
        this.financedatepickerCB = financedatepickerCB;
    }

    public TableColumn getExpenseTableColumn() {
        return expenseTableColumn;
    }

    public void setExpenseTableColumn(TableColumn expenseTableColumn) {
        this.expenseTableColumn = expenseTableColumn;
    }

    public Button getBtnexpensetracker() {
        return btnexpensetracker;
    }

    public void setBtnexpensetracker(Button btnexpensetracker) {
        this.btnexpensetracker = btnexpensetracker;
    }

    public Button getBtnbudgetforecast() {
        return btnbudgetforecast;
    }

    public void setBtnbudgetforecast(Button btnbudgetforecast) {
        this.btnbudgetforecast = btnbudgetforecast;
    }

    public TableView getFinancedashboardTableVIew() {
        return financedashboardTableVIew;
    }

    public void setFinancedashboardTableVIew(TableView financedashboardTableVIew) {
        this.financedashboardTableVIew = financedashboardTableVIew;
    }

    public TableColumn getIncomeTableColumn() {
        return incomeTableColumn;
    }

    public void setIncomeTableColumn(TableColumn incomeTableColumn) {
        this.incomeTableColumn = incomeTableColumn;
    }

    public Label getStatusoffilterLabel() {
        return StatusoffilterLabel;
    }

    public void setStatusoffilterLabel(Label statusoffilterLabel) {
        StatusoffilterLabel = statusoffilterLabel;
    }

    public Button getBtntaxreport() {
        return btntaxreport;
    }

    public void setBtntaxreport(Button btntaxreport) {
        this.btntaxreport = btntaxreport;
    }

    public FinanceDashboard(Button btnPayrollProcessing, Button btnVendorPayments, Button btnMonthlyReport, Button applyFilterbtn, Button btnbankreconciliation, TableColumn dateTableColumn, TableColumn branchTableColumn, ComboBox financebranchCB, DatePicker financedatepickerCB, TableColumn expenseTableColumn, Button btnexpensetracker, Button btnbudgetforecast, TableView financedashboardTableVIew, TableColumn incomeTableColumn, Label statusoffilterLabel, Button btntaxreport) {
        this.btnPayrollProcessing = btnPayrollProcessing;
        this.btnVendorPayments = btnVendorPayments;
        this.btnMonthlyReport = btnMonthlyReport;
        ApplyFilterbtn = applyFilterbtn;
        this.btnbankreconciliation = btnbankreconciliation;
        this.dateTableColumn = dateTableColumn;
        BranchTableColumn = branchTableColumn;
        this.financebranchCB = financebranchCB;
        this.financedatepickerCB = financedatepickerCB;
        this.expenseTableColumn = expenseTableColumn;
        this.btnexpensetracker = btnexpensetracker;
        this.btnbudgetforecast = btnbudgetforecast;
        this.financedashboardTableVIew = financedashboardTableVIew;
        this.incomeTableColumn = incomeTableColumn;
        StatusoffilterLabel = statusoffilterLabel;
        this.btntaxreport = btntaxreport;
    }

    @javafx.fxml.FXML
    public void openTexReport(ActionEvent actionEvent) {
        switchScene("TaxReport.fxml", btntaxreport);
    }

    @javafx.fxml.FXML
    public void openexpenseTracker(ActionEvent actionEvent) {
        switchScene("ExpenseTracker.fxml", btnexpensetracker);
    }

    @javafx.fxml.FXML
    public void openBudgetForecast(ActionEvent actionEvent) {
        switchScene("Budget_Forecast.fxml", btnbudgetforecast);
    }

    @javafx.fxml.FXML
    public void openBankReconciliation(ActionEvent actionEvent) {
        switchScene("bankreconciliation.fxml", btnbankreconciliation);
    }
}