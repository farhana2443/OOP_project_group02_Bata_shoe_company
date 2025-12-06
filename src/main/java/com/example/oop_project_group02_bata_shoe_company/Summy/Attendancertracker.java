package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Attendancertracker
{
    @javafx.fxml.FXML
    private TextField matchnamefromBINTF;
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> emplyeeIDTC;
    @javafx.fxml.FXML
    private TableView<AttendanceModel> attendancesheet;
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> StatusTC;
    @javafx.fxml.FXML
    private Label employeedatamatchBINlabel;
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> NameTC;
    @javafx.fxml.FXML
    private TableColumn<AttendanceModel, String> DateTC;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private ComboBox<String> AttendanceStatusCB;

    private ObservableList<AttendanceModel> attendanceList = FXCollections.observableArrayList();
    private List<EmployeeModelClass> employeeBINList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        emplyeeIDTC.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        NameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        DateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));


        attendancesheet.setItems(attendanceList);


        AttendanceStatusCB.setItems(FXCollections.observableArrayList("Present", "Absent", "Leave"));

        employeeBINList = loadEmployeesFromBin();


    }

    private List<EmployeeModelClass> loadEmployeesFromBin() {
        List<EmployeeModelClass> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bin/employee.bin"))) {
            list = (List<EmployeeModelClass>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }



    @javafx.fxml.FXML
    public void recordandaddAttendance(ActionEvent actionEvent) {

        String nameInput = matchnamefromBINTF.getText().trim();
        String status = AttendanceStatusCB.getValue();
        LocalDate date = datepicker.getValue();

        if (nameInput.isEmpty() || status == null || date == null) {
            new Alert(Alert.AlertType.ERROR, "Please fill all fields!").show();
            return;
        }


        List<EmployeeModelClass> matchedEmployees = new ArrayList<>();
        String searchName = nameInput.toLowerCase().trim();

        for (EmployeeModelClass emp : employeeBINList) {
            String fullName = emp.getFullName().toLowerCase().trim();

            if (fullName.equals(searchName) || fullName.contains(searchName)) {
                matchedEmployees.add(emp);
            }
        }

        if (matchedEmployees.isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Employee name not found in BIN!").show();
            return;
        }

        if (matchedEmployees.size() > 1) {
            new Alert(Alert.AlertType.WARNING,
                    "Multiple employees match this name. Please type a more specific name.")
                    .show();
            return;
        }

        EmployeeModelClass emp = matchedEmployees.get(0);

        AttendanceModel record = new AttendanceModel(
                emp.getEmployeeId(),
                emp.getFullName(),
                date.toString(),
                status
        );

        attendanceList.add(record);

        matchnamefromBINTF.clear();
        datepicker.setValue(null);
        AttendanceStatusCB.setValue(null);

        employeedatamatchBINlabel.setText("Record added for: " + emp.getFullName());

        System.out.println("Working directory: " + new File(".").getAbsolutePath());
        File f = new File("bin/employee.bin");
        System.out.println("BIN exists? " + f.exists());


    }


}