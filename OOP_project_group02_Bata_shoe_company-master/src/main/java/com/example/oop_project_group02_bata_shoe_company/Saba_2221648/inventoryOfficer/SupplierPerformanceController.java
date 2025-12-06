package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

public class SupplierPerformanceController {
    private String Supplier;
    private Integer Delivery;
    private Integer Delay;
    private Integer Rating;


    public SupplierPerformanceController(String supplier, Integer delivery, Integer delay, Integer rating) {
        Supplier = supplier;
        Delivery = delivery;
        Delay = delay;
        Rating = rating;
    }


    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public Integer getDelivery() {
        return Delivery;
    }

    public void setDelivery(Integer delivery) {
        Delivery = delivery;
    }

    public Integer getDelay() {
        return Delay;
    }

    public void setDelay(Integer delay) {
        Delay = delay;
    }

    public Integer getRating() {
        return Rating;
    }

    public void setRating(Integer rating) {
        Rating = rating;
    }


    @Override
    public String toString() {
        return "SupplierPerformanceController{" +
                "Supplier='" + Supplier + '\'' +
                ", Delivery=" + Delivery +
                ", Delay=" + Delay +
                ", Rating=" + Rating +
                '}';
    }
}
