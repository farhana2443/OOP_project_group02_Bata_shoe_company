package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.time.LocalDate;

public class FinanceRecordModelClass {
    private LocalDate date;
    private String branch;
    private double income;
    private double expense;

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

}
