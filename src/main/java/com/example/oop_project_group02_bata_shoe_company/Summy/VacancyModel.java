package com.example.oop_project_group02_bata_shoe_company.Summy;

public class VacancyModel {

    private String role;
    private String openings;

    public VacancyModel(String role, String openings) {
        this.role = role;
        this.openings = openings;
    }

    @Override
    public String toString() {
        return "VacancyModel{" +
                "role='" + role + '\'' +
                ", openings='" + openings + '\'' +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOpenings() {
        return openings;
    }

    public void setOpenings(String openings) {
        this.openings = openings;
    }
}
