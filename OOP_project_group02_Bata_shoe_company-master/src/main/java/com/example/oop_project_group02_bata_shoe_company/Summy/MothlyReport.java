package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.*;
import javafx.scene.control.*;
import org.openpdf.text.DocumentException;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MothlyReport
{
    @javafx.fxml.FXML
    private Button monthlyreportexportbtn;
    @javafx.fxml.FXML
    private DatePicker reportMonthPicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportmonthlyreportPDF(ActionEvent actionEvent) {

        LocalDate selectedDate = reportMonthPicker.getValue();

        if (selectedDate == null) {
            System.out.println("Please select a month and year first.");
            return;
        }

        int selectedMonth = selectedDate.getMonthValue();
        int selectedYear = selectedDate.getYear();

        // Filter records by month and year
        List<FinanceRecordModelClass> filteredRecords = FinanceRecordModelClass
                .getObservableRecords()
                .stream()
                .filter(r -> r.getDate().getMonthValue() == selectedMonth && r.getDate().getYear() == selectedYear)
                .collect(Collectors.toList());

        if (filteredRecords.isEmpty()) {
            System.out.println("No records found for " + selectedDate.getMonth() + " " + selectedYear);
            return;
        }

        try {
            // Ensure reports folder exists
            File reportsDir = new File("reports");
            if (!reportsDir.exists()) {
                reportsDir.mkdirs();
            }

            // Generate PDF file path with month-year in filename
            String filePath = String.format("reports/MonthlyReport_%d-%02d.pdf", selectedYear, selectedMonth);

            // Column headers
            String[] columns = {"Date", "Branch", "Income", "Expense"};

            // Extractor functions
            List<Function<FinanceRecordModelClass, String>> extractors = Arrays.asList(
                    r -> r.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                    FinanceRecordModelClass::getBranch,
                    r -> String.valueOf(r.getIncome()),
                    r -> String.valueOf(r.getExpense())
            );

            // Generate PDF
            PDFHelperModelClass.generatePDF(filePath,
                    "Monthly Finance Report - " + selectedDate.getMonth() + " " + selectedYear,
                    columns, filteredRecords, extractors);

            System.out.println("Monthly report PDF generated at: " + filePath);

        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }

    }

    public Button getMonthlyreportexportbtn() {
        return monthlyreportexportbtn;
    }

    public void setMonthlyreportexportbtn(Button monthlyreportexportbtn) {
        this.monthlyreportexportbtn = monthlyreportexportbtn;
    }

    @Override
    public String toString() {
        return "MothlyReport{" +
                "monthlyreportexportbtn=" + monthlyreportexportbtn +
                '}';
    }
    public MothlyReport() {
            }

    public MothlyReport(Button monthlyreportexportbtn) {
        this.monthlyreportexportbtn = monthlyreportexportbtn;
    }

}