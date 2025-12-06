package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.io.Serializable;

public class PayrollModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String employeeId;
    private String fullName;
    private double monthlySalary;

    public PayrollModel(String employeeId, String fullName, double monthlySalary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.monthlySalary = monthlySalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
