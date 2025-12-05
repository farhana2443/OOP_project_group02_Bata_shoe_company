package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

public class AddnewproductController {
    private String ProductName;
    private Integer SKUCode;
    private Integer SizeRange;
    private Integer SellingPrice;
    private String color;
    private String Supplier;
    private String WarehouseLocation;
    private Integer PurchasePrice;
    private String Category;
    private Integer ReceivedDate;
    private Integer QuantityReceived;


    public AddnewproductController(String productName, Integer SKUCode, Integer sizeRange, Integer sellingPrice, String color, String supplier, String warehouseLocation, Integer purchasePrice, String category, Integer receivedDate, Integer quantityReceived) {
        ProductName = productName;
        this.SKUCode = SKUCode;
        SizeRange = sizeRange;
        SellingPrice = sellingPrice;
        this.color = color;
        Supplier = supplier;
        WarehouseLocation = warehouseLocation;
        PurchasePrice = purchasePrice;
        Category = category;
        ReceivedDate = receivedDate;
        QuantityReceived = quantityReceived;
    }


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getSKUCode() {
        return SKUCode;
    }

    public void setSKUCode(Integer SKUCode) {
        this.SKUCode = SKUCode;
    }

    public Integer getSizeRange() {
        return SizeRange;
    }

    public void setSizeRange(Integer sizeRange) {
        SizeRange = sizeRange;
    }

    public Integer getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getWarehouseLocation() {
        return WarehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        WarehouseLocation = warehouseLocation;
    }

    public Integer getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getReceivedDate() {
        return ReceivedDate;
    }

    public void setReceivedDate(Integer receivedDate) {
        ReceivedDate = receivedDate;
    }

    public Integer getQuantityReceived() {
        return QuantityReceived;
    }

    public void setQuantityReceived(Integer quantityReceived) {
        QuantityReceived = quantityReceived;
    }


    @Override
    public String toString() {
        return "AddnewproductController{" +
                "ProductName='" + ProductName + '\'' +
                ", SKUCode=" + SKUCode +
                ", SizeRange=" + SizeRange +
                ", SellingPrice=" + SellingPrice +
                ", color='" + color + '\'' +
                ", Supplier='" + Supplier + '\'' +
                ", WarehouseLocation='" + WarehouseLocation + '\'' +
                ", PurchasePrice=" + PurchasePrice +
                ", Category='" + Category + '\'' +
                ", ReceivedDate=" + ReceivedDate +
                ", QuantityReceived=" + QuantityReceived +
                '}';
    }
}
