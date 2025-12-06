package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.openpdf.text.DocumentException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Function;

public class VendorPayment
{
    @FXML
    private Button btnBack;
    @FXML
    private TableColumn<VendorPaymentModelClass, String> invoicetablecolumn;
    @FXML
    private TableColumn<VendorPaymentModelClass, Double> amounttablecolumn;
    @FXML
    private TableColumn<VendorPaymentModelClass, LocalDate> duedatetablecolumn;
    @FXML
    private TextField txtInvoiceId;
    @FXML
    private Label submitpaymentstatus;
    @FXML
    private TextField txtAmount;
    @FXML
    private Button btnSubmitPayment;
    @FXML
    private TableView<VendorPaymentModelClass> vendorpaymentTableView;
    @FXML
    private Button downloadInvoiceListBtn;
    @FXML
    private TextField txtReference;

    private static final String FILE_PATH = "bin/vendorPayment.bin";

    private final ObservableList<VendorPaymentModelClass> paymentRecords = FXCollections.observableArrayList();
    private final ObservableList<VendorPaymentModelClass> selectedInvoices = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        invoicetablecolumn.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        amounttablecolumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        duedatetablecolumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        vendorpaymentTableView.setItems(paymentRecords);

        submitpaymentstatus.setText("");

        loadBIN();

        vendorpaymentTableView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldVal, newVal) -> {
                    if (newVal != null) {
                        txtInvoiceId.setText(newVal.getInvoiceId());
                        txtAmount.setText(String.valueOf(newVal.getAmount()));
                        txtReference.setText(newVal.getReference());

                        selectedInvoices.clear();
                        selectedInvoices.add(newVal);
                    }
                }
        );
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitPayment(ActionEvent actionEvent) {
        try {
            String invoiceId = txtInvoiceId.getText();
            double amount = Double.parseDouble(txtAmount.getText());
            String reference = txtReference.getText();

            if (invoiceId.isEmpty() || reference.isEmpty()) {
                submitpaymentstatus.setText("Please fill all fields!");
                return;
            }

            VendorPaymentModelClass payment =
                    new VendorPaymentModelClass(invoiceId, amount, LocalDate.now(), reference);

            paymentRecords.add(payment);

            submitpaymentstatus.setText("Payment submitted!");

            txtInvoiceId.clear();
            txtAmount.clear();
            txtReference.clear();

        } catch (NumberFormatException e) {
            submitpaymentstatus.setText("Invalid amount!");
        }


    }

    @javafx.fxml.FXML
    public void downloadInvoiceList(ActionEvent actionEvent) {

        if (selectedInvoices.isEmpty()) {
            submitpaymentstatus.setText("Please select an invoice first!");
            return;
        }

        String fileName = "invoice_" + selectedInvoices.get(0).getInvoiceId() + ".pdf";
        String[] headers = {"Invoice ID", "Amount", "Due Date", "Reference"};

        try {
            PDFHelperModelClass.generatePDF(
                    fileName,
                    "Invoice Details",
                    headers,
                    new ArrayList<>(selectedInvoices),
                    java.util.List.of(
                            VendorPaymentModelClass::getInvoiceId,
                            vp -> String.valueOf(vp.getAmount()),
                            vp -> String.valueOf(vp.getDueDate()),
                            VendorPaymentModelClass::getReference
                    )
            );

            submitpaymentstatus.setText("PDF Generated: " + fileName);


            paymentRecords.removeAll(selectedInvoices);
            selectedInvoices.clear();

            txtInvoiceId.clear();
            txtAmount.clear();
            txtReference.clear();

        } catch (IOException | DocumentException e) {
            submitpaymentstatus.setText("PDF Generation Failed!");
            e.printStackTrace();
        }
    }

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button btnBack) {
        this.btnBack = btnBack;
    }

    public TableColumn getInvoicetablecolumn() {
        return invoicetablecolumn;
    }

    public void setInvoicetablecolumn(TableColumn invoicetablecolumn) {
        this.invoicetablecolumn = invoicetablecolumn;
    }

    public TableColumn getAmounttablecolumn() {
        return amounttablecolumn;
    }

    public void setAmounttablecolumn(TableColumn amounttablecolumn) {
        this.amounttablecolumn = amounttablecolumn;
    }

    public TextField getTxtInvoiceId() {
        return txtInvoiceId;
    }

    public void setTxtInvoiceId(TextField txtInvoiceId) {
        this.txtInvoiceId = txtInvoiceId;
    }

    public Label getSubmitpaymentstatus() {
        return submitpaymentstatus;
    }

    public void setSubmitpaymentstatus(Label submitpaymentstatus) {
        this.submitpaymentstatus = submitpaymentstatus;
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

    public TableView getVendorpaymentTableView() {
        return vendorpaymentTableView;
    }

    public void setVendorpaymentTableView(TableView vendorpaymentTableView) {
        this.vendorpaymentTableView = vendorpaymentTableView;
    }

    public TableColumn getDuedatetablecolumn() {
        return duedatetablecolumn;
    }

    public void setDuedatetablecolumn(TableColumn duedatetablecolumn) {
        this.duedatetablecolumn = duedatetablecolumn;
    }

    public Button getDownloadInvoiceListBtn() {
        return downloadInvoiceListBtn;
    }

    public void setDownloadInvoiceListBtn(Button downloadInvoiceListBtn) {
        this.downloadInvoiceListBtn = downloadInvoiceListBtn;
    }

    public TextField getTxtReference() {
        return txtReference;
    }

    public void setTxtReference(TextField txtReference) {
        this.txtReference = txtReference;
    }

    @Override
    public String toString() {
        return "VendorPayment{" +
                "btnBack=" + btnBack +
                ", invoicetablecolumn=" + invoicetablecolumn +
                ", amounttablecolumn=" + amounttablecolumn +
                ", txtInvoiceId=" + txtInvoiceId +
                ", submitpaymentstatus=" + submitpaymentstatus +
                ", txtAmount=" + txtAmount +
                ", btnSubmitPayment=" + btnSubmitPayment +
                ", vendorpaymentTableView=" + vendorpaymentTableView +
                ", duedatetablecolumn=" + duedatetablecolumn +
                ", downloadInvoiceListBtn=" + downloadInvoiceListBtn +
                ", txtReference=" + txtReference +
                '}';
    }
    private void loadBIN() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object obj = ois.readObject();
            if (obj instanceof java.util.List<?>) {
                paymentRecords.addAll((java.util.List<VendorPaymentModelClass>) obj);
            }
        } catch (Exception e) {
            System.out.println("No existing BIN file or failed to load.");
        }
    }


}