package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.io.Serializable;
import java.time.LocalDate;

public class EmployeeModelClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String employeeId;
    private String fullName;
    private String department;
    private String jobRole;
    private LocalDate joinDate;
    private String phone;
    private String email;

    public EmployeeModelClass(String employeeId, String fullName, String department, String jobRole, LocalDate joinDate, String phone, String email) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.department = department;
        this.jobRole = jobRole;
        this.joinDate = joinDate;
        this.phone = phone;
        this.email = email;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
