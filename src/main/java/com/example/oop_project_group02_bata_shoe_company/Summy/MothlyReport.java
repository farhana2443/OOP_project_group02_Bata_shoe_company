package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.*;
import javafx.scene.control.*;

public class MothlyReport
{
    @javafx.fxml.FXML
    private Button monthlyreportexportbtn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportmonthlyreportPDF(ActionEvent actionEvent) {

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

    public MothlyReport(Button monthlyreportexportbtn) {
        this.monthlyreportexportbtn = monthlyreportexportbtn;
    }
}