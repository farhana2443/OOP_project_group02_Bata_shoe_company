package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class RecruitmentPortalDashboardHR
{
    @javafx.fxml.FXML
    private ComboBox<String> shortliststatus;
    @javafx.fxml.FXML
    private ComboBox<String> applicantfilterroleCB1;
    @javafx.fxml.FXML
    private Button grievacneportalswitchbtn;
    @javafx.fxml.FXML
    private TextField phonenumber;
    @javafx.fxml.FXML
    private TableColumn<VacancyModel, String> numberofopeningsTC;
    @javafx.fxml.FXML
    private ComboBox<String> filterroleCB;
    @javafx.fxml.FXML
    private TableView<VacancyModel> vacancylistTV;
    @javafx.fxml.FXML
    private Button attendanceportalswitchbtn;
    @javafx.fxml.FXML
    private TableColumn<ApplicantModel, String> applicantEmailTC;
    @javafx.fxml.FXML
    private TableColumn<ApplicantModel, String> applicantPhoneNUmberTC;
    @javafx.fxml.FXML
    private TableColumn<ApplicantModel, String> applicantNameTC;
    @javafx.fxml.FXML
    private Button employeedatabaseportalswitchbtn;
    @javafx.fxml.FXML
    private Button payrollinputportalswitchbtn;
    @javafx.fxml.FXML
    private TextField updatenoofSeatTF;
    @javafx.fxml.FXML
    private Button analyticsportalswitchbtn;
    @javafx.fxml.FXML
    private Button trainingcalenderportalswitchbtn;
    @javafx.fxml.FXML
    private ComboBox<String> addroleCB;
    @javafx.fxml.FXML
    private TableColumn<ApplicantModel, String> applicantRoleTC;
    @javafx.fxml.FXML
    private TextField nameofapplicant;
    @javafx.fxml.FXML
    private Button performanceportalswitchbtn;
    @javafx.fxml.FXML
    private TableColumn<ApplicantModel, String> APplicantShortlistStatusTC;
    @javafx.fxml.FXML
    private TextField applicantmail;
    @javafx.fxml.FXML
    private ComboBox<String> applicantrole;
    @javafx.fxml.FXML
    private TableColumn<VacancyModel, String> roleTC;
    @javafx.fxml.FXML
    private TableView<ApplicantModel> applicantcandidatelistTV;
    @javafx.fxml.FXML
    private TextField applicantnamefiltertTB;


    private ObservableList<ApplicantModel> applicantList = FXCollections.observableArrayList();
    private ObservableList<VacancyModel> vacancyList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        applicantNameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        applicantEmailTC.setCellValueFactory(new PropertyValueFactory<>("email"));
        applicantPhoneNUmberTC.setCellValueFactory(new PropertyValueFactory<>("phone"));
        applicantRoleTC.setCellValueFactory(new PropertyValueFactory<>("role"));
        APplicantShortlistStatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        applicantList.add(new ApplicantModel("Raka Roy", "raka@email.com", "1234567890", "Sales", "Pending"));
        applicantList.add(new ApplicantModel("Alvi Hoque", "alvi@email.com", "0987654321", "Sales", "Shortlisted"));

        applicantcandidatelistTV.setItems(applicantList);

        shortliststatus.setItems(FXCollections.observableArrayList("Pending", "Shortlisted", "Rejected"));
        filterroleCB.setItems(FXCollections.observableArrayList("Human Resource", "Sales", "Marketing"));
        applicantfilterroleCB1.setItems(FXCollections.observableArrayList("Human Resource", "Sales", "Marketing"));
        addroleCB.setItems(FXCollections.observableArrayList("Human Resource", "Sales", "Marketing"));
        applicantrole.setItems(FXCollections.observableArrayList("Human Resource", "Sales", "Marketing"));


        roleTC.setCellValueFactory(new PropertyValueFactory<>("role"));
        numberofopeningsTC.setCellValueFactory(new PropertyValueFactory<>("openings"));
        vacancylistTV.setItems(vacancyList);






    }

    private void switchScene(String fxmlFile, Button button) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) button.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void switchsceneTrainingPortal(ActionEvent actionEvent) {
        switchScene("trainingCalender.fxml", trainingcalenderportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void Payrollinputswitchscene(ActionEvent actionEvent) {
        switchScene("PayrollInput.fxml", payrollinputportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void filterSearchVacancyTV(ActionEvent actionEvent) {
        String roleFilter = applicantfilterroleCB1.getValue();

        FilteredList<VacancyModel> filteredData = new FilteredList<>(vacancyList, v -> true);

        filteredData.setPredicate(vacancy ->
                roleFilter == null || vacancy.getRole().equals(roleFilter)
        );

        vacancylistTV.setItems(filteredData);
    }

    @javafx.fxml.FXML
    public void switchsceneAnalytics(ActionEvent actionEvent) {
        switchScene("analyticsDashboard.fxml", analyticsportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void nameorrolecomboboxfilterSearch(ActionEvent actionEvent) {
        String filterText = applicantnamefiltertTB.getText().toLowerCase();
        String roleFilter = filterroleCB.getValue();

        FilteredList<ApplicantModel> filteredData = new FilteredList<>(applicantList, a -> true);

        filteredData.setPredicate(applicant -> {
            boolean matchesName = applicant.getName().toLowerCase().contains(filterText);
            boolean matchesRole = roleFilter == null || applicant.getRole().equals(roleFilter);
            return matchesName && matchesRole;
        });

        applicantcandidatelistTV.setItems(filteredData);
    }

    @javafx.fxml.FXML
    public void switchsceneEmployeeDatabase(ActionEvent actionEvent) {
        switchScene("employeedatabase.fxml", employeedatabaseportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void performancereviewswitchscene(ActionEvent actionEvent) {
        switchScene("performancereview.fxml", performanceportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void Attendanceswitchscene(ActionEvent actionEvent) {
        switchScene("Attendancertracker.fxml", attendanceportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void Grievanceswitchscene(ActionEvent actionEvent) {
        switchScene("grievanceManagement.fxml", grievacneportalswitchbtn);
    }

    @javafx.fxml.FXML
    public void updatenewopeningsonVacancyTable(ActionEvent actionEvent) {
        String role = addroleCB.getValue();
        String seats = updatenoofSeatTF.getText();

        if (role == null || seats.isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please select a role and enter openings!").show();
            return;
        }

        vacancyList.add(new VacancyModel(role, seats));

        addroleCB.setValue(null);
        updatenoofSeatTF.clear();
    }

    @FXML
    public void addCandidatetoCandidateTable(ActionEvent actionEvent) {
        String name = nameofapplicant.getText();
        String email = applicantmail.getText();
        String phone = phonenumber.getText();
        String role = applicantrole.getValue();
        String status = shortliststatus.getValue();

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || role == null || status == null) {
            new Alert(Alert.AlertType.ERROR, "Please fill all fields!").show();
            return;
            }

        applicantList.add(new ApplicantModel(name, email, phone, role, status));

        nameofapplicant.clear();
        applicantmail.clear();
        phonenumber.clear();
        applicantrole.setValue(null);
        shortliststatus.setValue(null);


        }
}

