package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import java.util.List;

public class AddSupplier {
    private String supplierName,email,contactPerson,address;
    private int phnNum;
    private List<String> selectedItems;

    public AddSupplier(String supplierName, String email, String contactPerson, String address, int phnNum, List<String> selectedItems) {
        this.supplierName = supplierName;
        this.email = email;
        this.contactPerson = contactPerson;
        this.address = address;
        this.phnNum = phnNum;
        this.selectedItems = selectedItems;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(int phnNum) {
        this.phnNum = phnNum;
    }

    public List<String> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<String> selectedItems) {
        this.selectedItems = selectedItems;
    }

    @Override
    public String toString() {
        return "AddSupplier{" +
                "supplierName='" + supplierName + '\'' +
                ", email='" + email + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", address='" + address + '\'' +
                ", phnNum=" + phnNum +
                ", selectedItems=" + selectedItems +
                '}';
    }
}
