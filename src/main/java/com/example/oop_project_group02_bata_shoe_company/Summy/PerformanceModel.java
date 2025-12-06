package com.example.oop_project_group02_bata_shoe_company.Summy;

public class PerformanceModel {
    private String name;
    private String rating;

    public PerformanceModel(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
