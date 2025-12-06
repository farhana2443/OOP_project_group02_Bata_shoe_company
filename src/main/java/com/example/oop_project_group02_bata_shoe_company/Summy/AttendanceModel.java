package com.example.oop_project_group02_bata_shoe_company.Summy;

public class AttendanceModel {

    private String employeeId;
    private String name;
    private String date;
    private String status;

    public AttendanceModel(String employeeId, String name, String date, String status) {
        this.employeeId = employeeId;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
