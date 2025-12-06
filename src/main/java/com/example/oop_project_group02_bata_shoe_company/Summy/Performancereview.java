package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Performancereview
{
    @javafx.fxml.FXML
    private TableView<PerformanceModel>  ReviewTV;
    @javafx.fxml.FXML
    private TableColumn<PerformanceModel, String> colName;
    @javafx.fxml.FXML
    private ComboBox<String> ratingCB;
    @javafx.fxml.FXML
    private TableColumn<PerformanceModel, String> colRating;
    @javafx.fxml.FXML
    private ComboBox<String> employeeCB;

    ObservableList<PerformanceModel> list = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colRating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        ReviewTV.setItems(list);

        loadEmployeeNamesFromBIN();
        ratingCB.getItems().addAll("Excellent", "Very Good", "Good", "Average", "Poor");





    }
    private void loadEmployeeNamesFromBIN() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bin/employee.bin"))) {

            List<EmployeeModelClass> employees = (List<EmployeeModelClass>) ois.readObject();

            for (EmployeeModelClass emp : employees) {
                employeeCB.getItems().add(emp.getFullName());
            }

            System.out.println("Employee names loaded successfully!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Could not load employee.bin");
        }
    }

    @javafx.fxml.FXML
    public void saveandaddrating(ActionEvent actionEvent) {

        String emp = employeeCB.getValue();
        String rate = ratingCB.getValue();

        if (emp == null || rate == null) {
            System.out.println("Select both employee and rating!");
            return;
        }

        list.add(new PerformanceModel(emp, rate));

        employeeCB.setValue(null);
        ratingCB.setValue(null);
    }
}

