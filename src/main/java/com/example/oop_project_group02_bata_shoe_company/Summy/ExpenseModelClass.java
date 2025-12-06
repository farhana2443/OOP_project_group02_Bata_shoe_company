package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class ExpenseModelClass implements Serializable{

    private static final long serialVersionUID = 1L;

    private LocalDate date;
    private String department;
    private String purpose;
    private double amount;

    public static final String EXPENSE_BIN = "bin/expenses.bin";

    private static final ObservableList<ExpenseModelClass> observableExpenses =
            FXCollections.observableArrayList();

    static {
        loadFromBIN();
    }

    public ExpenseModelClass() {}

    public ExpenseModelClass(LocalDate date, String department, String purpose, double amount) {
        this.date = date;
        this.department = department;
        this.purpose = purpose;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static ObservableList<ExpenseModelClass> getObservableExpenses() {
        return observableExpenses;
    }


    public static void saveToBIN() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(EXPENSE_BIN))) {
            oos.writeObject(observableExpenses);
            System.out.println("Expenses saved to BIN.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadFromBIN() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EXPENSE_BIN))) {
            List<ExpenseModelClass> list = (List<ExpenseModelClass>) ois.readObject();
            observableExpenses.setAll(list);
            System.out.println("Loaded " + list.size() + " expenses.");
        } catch (Exception e) {
            System.out.println("No expense BIN found. Starting fresh.");
        }
    }


}
