package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Stockoutproducts
{
    @javafx.fxml.FXML
    private TableColumn<Stockoutproducts,Integer> sizeCol;
    @javafx.fxml.FXML
    private TableColumn<Stockoutproducts,Integer> stockCol;
    @javafx.fxml.FXML
    private TableColumn<Stockoutproducts,String> statusCol;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TableView<Stockoutproducts> stockProductTableView;
    @javafx.fxml.FXML
    private Label stockProductLabel;
    @javafx.fxml.FXML
    private TableColumn<Stockoutproducts,String> productNameCol;

    @javafx.fxml.FXML
    public void initialize() {
        productNameCol.setCellValueFactory(new PropertyValueFactory<>("Product Name"));
        sizeCol.setCellValueFactory(new PropertyValueFactory<>("Size"));
        stockCol.setCellValueFactory(new PropertyValueFactory<>("Stock"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));


    }

    @javafx.fxml.FXML
    public void overStockButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void stockOutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void lowStockButtonOnAction(ActionEvent actionEvent) {
    }
}