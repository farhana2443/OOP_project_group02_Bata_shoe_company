package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollInput
{
    @javafx.fxml.FXML
    private TextField bonusTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField DeductionTF;
    @javafx.fxml.FXML
    private TextField SalaryTF;
    @javafx.fxml.FXML
    private TextField employeeIDTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ValidateandSendforFinanceReport(ActionEvent actionEvent) {
        List<EmployeeModelClass> employees = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bin/employee.bin"))) {
            employees = (List<EmployeeModelClass>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        double[] dailySalaries = {50000, 55000, 60000, 65000, 70000, 75000, 80000, 85000, 90000, 95000, 100000, 105000, 110000, 115000, 120000, 125000, 130000, 135000, 140000, 150000};



        List<PayrollModel> payrollList = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++) {
            EmployeeModelClass emp = employees.get(i);
            double monthlySalary = dailySalaries[i] * 30;
            payrollList.add(new PayrollModel(emp.getEmployeeId(), emp.getFullName(), monthlySalary));
        }

        File dir = new File("bin");
        if (!dir.exists()) dir.mkdirs();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bin/payroll.bin"))) {
            oos.writeObject(payrollList);
            System.out.println("payroll.bin successfully created with assigned monthly salaries!");
        } catch (Exception e) {
            e.printStackTrace();
        }








    }
}