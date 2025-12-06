package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Comparator;

public class AnalyticsDashboard
{
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> employeeNameCol;
    @javafx.fxml.FXML
    private TableView<AttendanceModel> AnalyticsTable;
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> attendacnecol;
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> empIDcol;

    private ObservableList<AttendanceModel> attendanceList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        empIDcol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        employeeNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        attendacnecol.setCellValueFactory(new PropertyValueFactory<>("status"));


        AnalyticsTable.setItems(attendanceList);
    }
    public void setAttendanceList(ObservableList<AttendanceModel> list) {
        attendanceList.clear();
        attendanceList.addAll(list);

    }

    @javafx.fxml.FXML
    public void sorthightolowButton(ActionEvent actionEvent) {
        FXCollections.sort(attendanceList, Comparator.comparingInt(this::statusValue).reversed());
    }


    @javafx.fxml.FXML

    public void sortlowtohighbutton(ActionEvent actionEvent) {
        FXCollections.sort(attendanceList, Comparator.comparingInt(this::statusValue));



    }
    private int statusValue(AttendanceModel record) {
        switch (record.getStatus()) {
            case "Present": return 3;
            case "Leave": return 2;
            case "Absent": return 1;
            default: return 0;
        }

    }
}