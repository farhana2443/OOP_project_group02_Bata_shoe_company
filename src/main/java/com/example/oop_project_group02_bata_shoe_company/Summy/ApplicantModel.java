package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.beans.property.SimpleStringProperty;

public class ApplicantModel {

    private SimpleStringProperty name;
    private SimpleStringProperty email;
    private SimpleStringProperty phone;
    private SimpleStringProperty role;
    private SimpleStringProperty status;

    public ApplicantModel(String name, String email, String phone, String role, String status) {
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.phone = new SimpleStringProperty(phone);
        this.role = new SimpleStringProperty(role);
        this.status = new SimpleStringProperty(status);
    }


    @Override
    public String toString() {
        return "ApplicantModel{" +
                "name=" + name +
                ", email=" + email +
                ", phone=" + phone +
                ", role=" + role +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPhone() {
        return phone.get();
    }

    public SimpleStringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getRole() {
        return role.get();
    }

    public SimpleStringProperty roleProperty() {
        return role;
    }

    public void setRole(String role) {
        this.role.set(role);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}
