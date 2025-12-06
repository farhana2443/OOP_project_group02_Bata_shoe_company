package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;

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
    private TableColumn<VendorPaymentModelClass, String> invoicetablecolumn;
    @javafx.fxml.FXML
    private TableColumn<VendorPaymentModelClass, Double> amounttablecolumn;
    @javafx.fxml.FXML
    private Label submitpaymentstatus;
    @javafx.fxml.FXML
    private TableColumn<VendorPaymentModelClass, LocalDate> duedatetablecolumn;
    @javafx.fxml.FXML
    private TableView<VendorPaymentModelClass> vendorpaymentTableView;
    @FXML
    private DatePicker txtDueDate;

    private static final String FILE_PATH = "bin/vendorPayment.bin";


    private ObservableList<VendorPaymentModelClass> paymentRecords = FXCollections.observableArrayList();


    public VendorPayment() { }
    public void initialize() {

        invoicetablecolumn.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        amounttablecolumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        duedatetablecolumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        vendorpaymentTableView.setItems(paymentRecords);
        submitpaymentstatus.setText("");
        loadBIN();
        vendorpaymentTableView.refresh();



    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitPayment(ActionEvent actionEvent) {

        try {
            String invoiceId = txtInvoiceId.getText();
            double amount = Double.parseDouble(txtAmount.getText());
            LocalDate dueDate = txtDueDate.getValue();
            String reference = txtReference.getText();

            if (invoiceId.isEmpty() || reference.isEmpty() || dueDate == null) {
                submitpaymentstatus.setText("Please fill all fields!");
                return;
            }

            VendorPaymentModelClass payment = new VendorPaymentModelClass(invoiceId, amount, dueDate, reference);
            paymentRecords.add(payment);

            submitpaymentstatus.setText("Payment submitted successfully!");

            txtInvoiceId.clear();
            txtAmount.clear();
            txtReference.clear();
            txtDueDate.setValue(null);

        } catch (NumberFormatException e) {
            submitpaymentstatus.setText("Invalid amount! Please enter a valid number.");
        }
    }

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button btnBack) {
        this.btnBack = btnBack;
    }

    public TextField getTxtInvoiceId() {
        return txtInvoiceId;
    }

    public void setTxtInvoiceId(TextField txtInvoiceId) {
        this.txtInvoiceId = txtInvoiceId;
    }

    public TextField getTxtAmount() {
        return txtAmount;
    }

    public void setTxtAmount(TextField txtAmount) {
        this.txtAmount = txtAmount;
    }

    public Button getBtnSubmitPayment() {
        return btnSubmitPayment;
    }

    public void setBtnSubmitPayment(Button btnSubmitPayment) {
        this.btnSubmitPayment = btnSubmitPayment;
    }

    public TextField getTxtReference() {
        return txtReference;
    }

    public void setTxtReference(TextField txtReference) {
        this.txtReference = txtReference;
    }

    public TableColumn<VendorPaymentModelClass, String> getInvoicetablecolumn() {
        return invoicetablecolumn;
    }

    public void setInvoicetablecolumn(TableColumn<VendorPaymentModelClass, String> invoicetablecolumn) {
        this.invoicetablecolumn = invoicetablecolumn;
    }

    public TableColumn<VendorPaymentModelClass, Double> getAmounttablecolumn() {
        return amounttablecolumn;
    }

    public void setAmounttablecolumn(TableColumn<VendorPaymentModelClass, Double> amounttablecolumn) {
        this.amounttablecolumn = amounttablecolumn;
    }

    public Label getSubmitpaymentstatus() {
        return submitpaymentstatus;
    }

    public void setSubmitpaymentstatus(Label submitpaymentstatus) {
        this.submitpaymentstatus = submitpaymentstatus;
    }

    public TableColumn<VendorPaymentModelClass, LocalDate> getDuedatetablecolumn() {
        return duedatetablecolumn;
    }

    public void setDuedatetablecolumn(TableColumn<VendorPaymentModelClass, LocalDate> duedatetablecolumn) {
        this.duedatetablecolumn = duedatetablecolumn;
    }

    public TableView<VendorPaymentModelClass> getVendorpaymentTableView() {
        return vendorpaymentTableView;
    }

    public void setVendorpaymentTableView(TableView<VendorPaymentModelClass> vendorpaymentTableView) {
        this.vendorpaymentTableView = vendorpaymentTableView;
    }

    public DatePicker getTxtDueDate() {
        return txtDueDate;
    }

    public void setTxtDueDate(DatePicker txtDueDate) {
        this.txtDueDate = txtDueDate;
    }

    public ObservableList<VendorPaymentModelClass> getPaymentRecords() {
        return paymentRecords;
    }

    public void setPaymentRecords(ObservableList<VendorPaymentModelClass> paymentRecords) {
        this.paymentRecords = paymentRecords;
    }

    @Override
    public String toString() {
        return "VendorPayment{" +
                "btnBack=" + btnBack +
                ", txtInvoiceId=" + txtInvoiceId +
                ", txtAmount=" + txtAmount +
                ", btnSubmitPayment=" + btnSubmitPayment +
                ", txtReference=" + txtReference +
                ", invoicetablecolumn=" + invoicetablecolumn +
                ", amounttablecolumn=" + amounttablecolumn +
                ", submitpaymentstatus=" + submitpaymentstatus +
                ", duedatetablecolumn=" + duedatetablecolumn +
                ", vendorpaymentTableView=" + vendorpaymentTableView +
                ", txtDueDate=" + txtDueDate +
                ", paymentRecords=" + paymentRecords +
                '}';
    }

    public VendorPayment(Button btnBack, TextField txtInvoiceId, TextField txtAmount, Button btnSubmitPayment, TextField txtReference, TableColumn<VendorPaymentModelClass, String> invoicetablecolumn, TableColumn<VendorPaymentModelClass, Double> amounttablecolumn, Label submitpaymentstatus, TableColumn<VendorPaymentModelClass, LocalDate> duedatetablecolumn, TableView<VendorPaymentModelClass> vendorpaymentTableView, DatePicker txtDueDate, ObservableList<VendorPaymentModelClass> paymentRecords) {
        this.btnBack = btnBack;
        this.txtInvoiceId = txtInvoiceId;
        this.txtAmount = txtAmount;
        this.btnSubmitPayment = btnSubmitPayment;
        this.txtReference = txtReference;
        this.invoicetablecolumn = invoicetablecolumn;
        this.amounttablecolumn = amounttablecolumn;
        this.submitpaymentstatus = submitpaymentstatus;
        this.duedatetablecolumn = duedatetablecolumn;
        this.vendorpaymentTableView = vendorpaymentTableView;
        this.txtDueDate = txtDueDate;
        this.paymentRecords = paymentRecords;
    }

    private void loadBIN() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object obj = ois.readObject();
            if (obj instanceof java.util.List) {
                paymentRecords.addAll((java.util.List<VendorPaymentModelClass>) obj);
            }
        } catch (Exception e) {
            System.out.println("No existing BIN file found or failed to load.");
        }
    }
}



