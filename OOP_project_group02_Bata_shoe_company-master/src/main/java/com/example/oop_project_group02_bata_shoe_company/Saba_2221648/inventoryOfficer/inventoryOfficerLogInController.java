package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

public class inventoryOfficerLogInController {
    private String Email;
    private String Password;


    public inventoryOfficerLogInController(String email, String password) {
        Email = email;
        Password = password;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "inventoryOfficerLogInController{" +
                "Email='" + Email + '\'' +
                ", Password=" + Password +
                '}';
    }
}
