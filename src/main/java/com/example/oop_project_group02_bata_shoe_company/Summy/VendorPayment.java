package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

public class VendorPayment
{
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private TextField txtInvoiceId;
    @javafx.fxml.FXML
    private TextField txtAmount;
    @javafx.fxml.FXML
    private Button btnSubmitPayment;
    @javafx.fxml.FXML
    private TextField txtReference;
    @javafx.fxml.FXML
    private TableColumn invoicetablecolumn;
    @javafx.fxml.FXML
    private TableColumn amounttablecolumn;
    @javafx.fxml.FXML
    private Label submitpaymentstatus;
    @javafx.fxml.FXML
    private TableColumn duedatetablecolumn;
    @javafx.fxml.FXML
    private TableView vendorpaymentTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitPayment(ActionEvent actionEvent) {
    }
}