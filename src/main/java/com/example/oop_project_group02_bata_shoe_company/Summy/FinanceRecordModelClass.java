package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class FinanceRecordModelClass implements Serializable {

    private static final long serialVersionUID = 1L;
    private LocalDate date;
    private String branch;
    private double income;
    private double expense;
    public static final String FINANCE_BIN = "bin/financeRecords.bin";

    public static final ObservableList<FinanceRecordModelClass> observableRecords =
            FXCollections.observableArrayList();


    static {
        loadRecordsFromBIN();
    }

    public FinanceRecordModelClass() {
    }

    public FinanceRecordModelClass(LocalDate date, String branch, double income, double expense) {
        this.date = date;
        this.branch = branch;
        this.income = income;
        this.expense = expense;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }
    public static void loadRecordsFromBIN() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(FinanceRecordModelClass.FINANCE_BIN))) {

            List<FinanceRecordModelClass> list = (List<FinanceRecordModelClass>) ois.readObject();
            FinanceRecordModelClass.observableRecords.setAll(list);

            System.out.println("Finance Dashboard: Loaded " + list.size() + " records.");

        } catch (Exception e) {
            System.out.println("Finance Dashboard: Could not load BIN file: " + e.getMessage());
            FinanceRecordModelClass.observableRecords.clear();
        }
    }



    public static ObservableList<FinanceRecordModelClass> getObservableRecords() {
        return observableRecords;
    }


}
