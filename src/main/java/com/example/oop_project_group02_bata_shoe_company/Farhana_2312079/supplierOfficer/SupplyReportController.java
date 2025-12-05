package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

/*import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class SupplyReportController
{
    @javafx.fxml.FXML
    private Label supplyReportMessage;
    @javafx.fxml.FXML
    private PieChart ordersDistributionPieChart;
    @javafx.fxml.FXML
    private ComboBox <Integer> reportYearCB;
    @javafx.fxml.FXML
    private PieChart deliveryDistributionPieChart;
    @javafx.fxml.FXML
    private PieChart spendingDistributionPieChart;
    @javafx.fxml.FXML
    private ComboBox <String>reportTypeCB;
    @javafx.fxml.FXML
    private ComboBox<String> reportMonthCB;
    @javafx.fxml.FXML
    private TableColumn<SupplyReport,String> materialTypeC;
    @javafx.fxml.FXML
    private TableView <SupplyReport>tableView1;
    @javafx.fxml.FXML
    private TableView <SupplyReport>tableView2;
    @javafx.fxml.FXML
    private TableView <SupplyReport>tableView3;
    @javafx.fxml.FXML
    private TableColumn <SupplyReport,String>supplierC;
    @javafx.fxml.FXML
    private TableColumn <SupplyReport,Integer>countC;
    @javafx.fxml.FXML
    private TableColumn <SupplyReport,String>deliveryStatusC;
    @javafx.fxml.FXML
    private TableColumn <SupplyReport,Integer>numOfOrdersC;
    @javafx.fxml.FXML
    private TableColumn <SupplyReport,Double>spendingAmountC;

    @javafx.fxml.FXML
    public void initialize() {
        reportMonthCB.getItems().setAll("Jan", "Feb", "Mar","Apr", "May", "Jun","July", "Aug", "Sep","Oct", "Nov", "Dec");
        reportYearCB.getItems().setAll(2024, 2025, 2026, 2027, 2028);
        reportTypeCB.getItems().setAll("Summary", "Detailed");

        materialTypeC.setCellValueFactory(new PropertyValueFactory<>("materialType"));
        spendingAmountC.setCellValueFactory(new PropertyValueFactory<>("spendingAmount"));
        supplierC.setCellValueFactory(new PropertyValueFactory<>("supplier"));
        numOfOrdersC.setCellValueFactory(new PropertyValueFactory<>("numOfOrders"));
        deliveryStatusC.setCellValueFactory(new PropertyValueFactory<>("deliveryStatus"));
        countC.setCellValueFactory(new PropertyValueFactory<>("count"));

        loadDummyData();
    }
    private void loadDummyData() {
        List<SupplyReport> dataList = new ArrayList<>();
        String[] materials = {"Leather", "Rubber", "Thread", "Glue"};
        String[] suppliers = {"Supplier A", "Supplier B", "Supplier C"};
        String[] statuses = {"Delivered", "Pending", "Canceled"};

        Random rng = new Random();
        for (int i = 0; i < 5; i++) {
            dataList.add(new SupplyReport(
                    "Jan",
                    "Summary",
                    materials[rng.nextInt(materials.length)],
                    suppliers[rng.nextInt(suppliers.length)],
                    statuses[rng.nextInt(statuses.length)],
                    2025,
                    rng.nextInt(50),
                    rng.nextInt(20),
                    rng.nextDouble() * 1000
            ));
        }
        tableView1.getItems().setAll(dataList);
        tableView2.getItems().setAll(dataList);
        tableView3.getItems().setAll(dataList);

        updatePieCharts(dataList);
    }

    private void updatePieCharts(List<SupplyReport> dataList) {
        spendingDistributionPieChart.getData().clear();
        for (SupplyReport r : dataList) {
            spendingDistributionPieChart.getData().add(new PieChart.Data(r.getMaterialType(), r.getSpendingAmount()));
        }

        ordersDistributionPieChart.getData().clear();
        for (SupplyReport r : dataList) {
            ordersDistributionPieChart.getData().add(new PieChart.Data(r.getSupplier(), r.getNumOfOrders()));
        }

        deliveryDistributionPieChart.getData().clear();
        for (SupplyReport r : dataList) {
            deliveryDistributionPieChart.getData().add(new PieChart.Data(r.getDeliveryStatus(), r.getCount()));
        }
    }



    @javafx.fxml.FXML
    public void exportAsPDFB(ActionEvent actionEvent) {
        supplyReportMessage.setText("PDF export feature coming soon!");
        /*FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Document", "*.pdf"));
        File choosenFile = fileChooser.showSaveDialog(supplyReportMessage.getScene().getWindow());
        if (choosenFile == null) return;

        try {
            Document pdfDoc = new Document();
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(choosenFile));

            pdfDoc.open();
            pdfDoc.add(new Paragraph("Bata Supply Chain Report"));
            pdfDoc.add(new Paragraph("Generated at: " + LocalDate.now()));
            pdfDoc.add(new Paragraph(" "));

            Table pdfTable = new Table(2);
            pdfTable.addCell("Material Type");
            pdfTable.addCell("Spending Amount");

            for (SupplyReport r : tableView1.getItems()) {
                pdfTable.addCell(r.getMaterialType());
                pdfTable.addCell(String.valueOf(r.getSpendingAmount()));
            }

            pdfDoc.add(pdfTable);
            pdfDoc.close();

            supplyReportMessage.setText("Exported to PDF file: " + choosenFile.getAbsolutePath());
        } catch (IOException | DocumentException e) {
            supplyReportMessage.setText("Could not export PDF file");
            e.printStackTrace();
        }*/

    }

    @javafx.fxml.FXML
    public void cancelSupplyReportB(ActionEvent actionEvent) {
        tableView1.getItems().clear();
        tableView2.getItems().clear();
        tableView3.getItems().clear();
        spendingDistributionPieChart.getData().clear();
        ordersDistributionPieChart.getData().clear();
        deliveryDistributionPieChart.getData().clear();
        supplyReportMessage.setText("Cleared all data.");

    }

    @javafx.fxml.FXML
    public void generateB(ActionEvent actionEvent) {
        loadDummyData();
        supplyReportMessage.setText("Report generated successfully");

    }

    @javafx.fxml.FXML
    public void backB2(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SupplierOfficerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Supplier Officer Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}