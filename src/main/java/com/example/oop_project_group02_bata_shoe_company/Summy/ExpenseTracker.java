package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.openpdf.text.DocumentException;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExpenseTracker
{
    @javafx.fxml.FXML
    private TableColumn<ExpenseModelClass, Double> amountColumn;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView<ExpenseModelClass> expenseTable;
    @javafx.fxml.FXML
    private TableColumn<ExpenseModelClass, String> departmentColumn;
    @javafx.fxml.FXML
    private TextArea purposeTextArea;
    @javafx.fxml.FXML
    private TableColumn<ExpenseModelClass, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<ExpenseModelClass, String> purposeColumn;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {

        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        purposeColumn.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        expenseTable.setItems(ExpenseModelClass.getObservableExpenses());

        departmentComboBox.getItems().addAll("HR", "Accounts", "Sales", "IT", "Operations");

        if (ExpenseModelClass.getObservableExpenses().isEmpty()) {
            ExpenseModelClass.getObservableExpenses().addAll(
                    new ExpenseModelClass(LocalDate.now().minusDays(5), "HR", "Staff Training", 4500),
                    new ExpenseModelClass(LocalDate.now().minusDays(2), "Social Media Outreach", "Facebook Ads", 1200),
                    new ExpenseModelClass(LocalDate.now(), "Sales", "Product Freight", 2300)
            );
            ExpenseModelClass.saveToBIN();
        }


    }

    @javafx.fxml.FXML
    public void downloadExpensePdf(ActionEvent actionEvent) {

        try {
            File dir = new File("reports");
            if (!dir.exists()) dir.mkdirs();

            String path = "reports/ExpenseReport.pdf";

            String[] columns = {"Date", "Department", "Purpose", "Amount"};

            List<Function<ExpenseModelClass, String>> extractors = Arrays.asList(
                    e -> e.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                    ExpenseModelClass::getDepartment,
                    ExpenseModelClass::getPurpose,
                    e -> String.valueOf(e.getAmount())
            );

            PDFHelperModelClass.generatePDF(
                    path,
                    "Expense Tracker Report",
                    columns,
                    ExpenseModelClass.getObservableExpenses(),
                    extractors
            );

            System.out.println("Expense Report PDF Generated: " + path);

        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void logExpense(ActionEvent actionEvent) {

        try {
            LocalDate date = datePicker.getValue();
            String dept = departmentComboBox.getValue();
            String purpose = purposeTextArea.getText();
            double amount = Double.parseDouble(amountField.getText());

            if (date == null || dept == null || purpose.isEmpty()) {
                System.out.println("All fields required!");
                return;
            }

            ExpenseModelClass expense =
                    new ExpenseModelClass(date, dept, purpose, amount);

            ExpenseModelClass.getObservableExpenses().add(expense);
            ExpenseModelClass.saveToBIN();

            datePicker.setValue(null);
            departmentComboBox.setValue(null);
            purposeTextArea.clear();
            amountField.clear();

            System.out.println("Expense Logged Successfully!");

        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        }
}