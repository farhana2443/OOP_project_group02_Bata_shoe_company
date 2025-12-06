package com.example.oop_project_group02_bata_shoe_company.Summy;

public class TrainingSession {
    private String employeeID;
    private String trainingProgram;
    private String date;

    public TrainingSession(String employeeID, String trainingProgram, String date) {
        this.employeeID = employeeID;
        this.trainingProgram = trainingProgram;
        this.date = date;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTrainingProgram() {
        return trainingProgram;
    }

    public void setTrainingProgram(String trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
