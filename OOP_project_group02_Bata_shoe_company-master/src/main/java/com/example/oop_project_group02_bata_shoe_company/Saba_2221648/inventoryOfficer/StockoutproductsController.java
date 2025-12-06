package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

public class StockoutproductsController {
    private String ProductName;
    private Integer Size;
    private Integer Stock;
    private String Status;


    public StockoutproductsController(String productName, Integer size, Integer stock, String status) {
        ProductName = productName;
        Size = size;
        Stock = stock;
        Status = status;
    }


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


    @Override
    public String toString() {
        return "StockoutproductsController{" +
                "ProductName='" + ProductName + '\'' +
                ", Size=" + Size +
                ", Stock=" + Stock +
                ", Status='" + Status + '\'' +
                '}';
    }
}
