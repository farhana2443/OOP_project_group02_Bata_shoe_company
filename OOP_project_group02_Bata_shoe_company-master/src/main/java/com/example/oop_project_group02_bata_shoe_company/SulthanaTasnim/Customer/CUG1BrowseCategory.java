package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CUG1BrowseCategory
{
    @javafx.fxml.FXML
    private TableColumn priceTC;
    @javafx.fxml.FXML
    private TableColumn genderTC;
    @javafx.fxml.FXML
    private TableColumn nameTC;
    @javafx.fxml.FXML
    private Slider priceRangeSlider;
    @javafx.fxml.FXML
    private TableView categoryTV;
    @javafx.fxml.FXML
    private TextField genderTF;
    @javafx.fxml.FXML
    private ComboBox categoryCB;
    @javafx.fxml.FXML
    private TableColumn categoryTC;

    public TableColumn getPriceTC() {
        return priceTC;
    }

    @Override
    public String toString() {
        return "CUG1BrowseCategory{" +
                "priceTC=" + priceTC +
                ", genderTC=" + genderTC +
                ", nameTC=" + nameTC +
                ", priceRangeSlider=" + priceRangeSlider +
                ", categoryTV=" + categoryTV +
                ", genderTF=" + genderTF +
                ", categoryCB=" + categoryCB +
                ", categoryTC=" + categoryTC +
                ", sizeTC=" + sizeTC +
                ", sizeTF=" + sizeTF +
                '}';
    }

    public void setPriceTC(TableColumn priceTC) {
        this.priceTC = priceTC;
    }

    public TableColumn getGenderTC() {
        return genderTC;
    }

    public void setGenderTC(TableColumn genderTC) {
        this.genderTC = genderTC;
    }

    public TableColumn getNameTC() {
        return nameTC;
    }

    public void setNameTC(TableColumn nameTC) {
        this.nameTC = nameTC;
    }

    public Slider getPriceRangeSlider() {
        return priceRangeSlider;
    }

    public void setPriceRangeSlider(Slider priceRangeSlider) {
        this.priceRangeSlider = priceRangeSlider;
    }

    public TableView getCategoryTV() {
        return categoryTV;
    }

    public void setCategoryTV(TableView categoryTV) {
        this.categoryTV = categoryTV;
    }

    public TextField getGenderTF() {
        return genderTF;
    }

    public void setGenderTF(TextField genderTF) {
        this.genderTF = genderTF;
    }

    public ComboBox getCategoryCB() {
        return categoryCB;
    }

    public void setCategoryCB(ComboBox categoryCB) {
        this.categoryCB = categoryCB;
    }

    public TableColumn getCategoryTC() {
        return categoryTC;
    }

    public void setCategoryTC(TableColumn categoryTC) {
        this.categoryTC = categoryTC;
    }

    public TableColumn getSizeTC() {
        return sizeTC;
    }

    public void setSizeTC(TableColumn sizeTC) {
        this.sizeTC = sizeTC;
    }

    public TextField getSizeTF() {
        return sizeTF;
    }

    public void setSizeTF(TextField sizeTF) {
        this.sizeTF = sizeTF;
    }

    public CUG1BrowseCategory(TableColumn priceTC, TableColumn genderTC, TableColumn nameTC, Slider priceRangeSlider, TableView categoryTV, TextField genderTF, ComboBox categoryCB, TableColumn categoryTC, TableColumn sizeTC, TextField sizeTF) {
        this.priceTC = priceTC;
        this.genderTC = genderTC;
        this.nameTC = nameTC;
        this.priceRangeSlider = priceRangeSlider;
        this.categoryTV = categoryTV;
        this.genderTF = genderTF;
        this.categoryCB = categoryCB;
        this.categoryTC = categoryTC;
        this.sizeTC = sizeTC;
        this.sizeTF = sizeTF;
    }

    @javafx.fxml.FXML
    private TableColumn sizeTC;
    @javafx.fxml.FXML
    private TextField sizeTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyFilterAndShowOntheTable(ActionEvent actionEvent) {
    }
}