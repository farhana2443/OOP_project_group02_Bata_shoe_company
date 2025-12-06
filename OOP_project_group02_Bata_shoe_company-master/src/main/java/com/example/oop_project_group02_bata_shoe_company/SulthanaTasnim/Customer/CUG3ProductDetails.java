package com.example.oop_project_group02_bata_shoe_company.SulthanaTasnim.Customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javax.swing.text.html.ImageView;

public class CUG3ProductDetails
{
    public TextField getNameTF() {
        return nameTF;
    }

    @Override
    public String toString() {
        return "CUG3ProductDetails{" +
                "nameTF=" + nameTF +
                ", productImage=" + productImage +
                ", priceTF=" + priceTF +
                ", categoryTF=" + categoryTF +
                ", descriptionTF=" + descriptionTF +
                ", productCodeTF=" + productCodeTF +
                ", reviewsTA=" + reviewsTA +
                ", colorTF=" + colorTF +
                ", specificationTA=" + specificationTA +
                '}';
    }

    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }

    public ImageView getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageView productImage) {
        this.productImage = productImage;
    }

    public TextField getPriceTF() {
        return priceTF;
    }

    public void setPriceTF(TextField priceTF) {
        this.priceTF = priceTF;
    }

    public TextField getCategoryTF() {
        return categoryTF;
    }

    public void setCategoryTF(TextField categoryTF) {
        this.categoryTF = categoryTF;
    }

    public TextField getDescriptionTF() {
        return descriptionTF;
    }

    public void setDescriptionTF(TextField descriptionTF) {
        this.descriptionTF = descriptionTF;
    }

    public TextField getProductCodeTF() {
        return productCodeTF;
    }

    public void setProductCodeTF(TextField productCodeTF) {
        this.productCodeTF = productCodeTF;
    }

    public TextArea getReviewsTA() {
        return reviewsTA;
    }

    public void setReviewsTA(TextArea reviewsTA) {
        this.reviewsTA = reviewsTA;
    }

    public TextField getColorTF() {
        return colorTF;
    }

    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    public TextArea getSpecificationTA() {
        return specificationTA;
    }

    public void setSpecificationTA(TextArea specificationTA) {
        this.specificationTA = specificationTA;
    }

    public CUG3ProductDetails(TextField nameTF, ImageView productImage, TextField priceTF, TextField categoryTF, TextField descriptionTF, TextField productCodeTF, TextArea reviewsTA, TextField colorTF, TextArea specificationTA) {
        this.nameTF = nameTF;
        this.productImage = productImage;
        this.priceTF = priceTF;
        this.categoryTF = categoryTF;
        this.descriptionTF = descriptionTF;
        this.productCodeTF = productCodeTF;
        this.reviewsTA = reviewsTA;
        this.colorTF = colorTF;
        this.specificationTA = specificationTA;
    }

    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ImageView productImage;
    @javafx.fxml.FXML
    private TextField priceTF;
    @javafx.fxml.FXML
    private TextField categoryTF;
    @javafx.fxml.FXML
    private TextField descriptionTF;
    @javafx.fxml.FXML
    private TextField productCodeTF;
    @javafx.fxml.FXML
    private TextArea reviewsTA;
    @javafx.fxml.FXML
    private TextField colorTF;
    @javafx.fxml.FXML
    private TextArea specificationTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void savetotheCartDatabase(ActionEvent actionEvent) {
    }
}