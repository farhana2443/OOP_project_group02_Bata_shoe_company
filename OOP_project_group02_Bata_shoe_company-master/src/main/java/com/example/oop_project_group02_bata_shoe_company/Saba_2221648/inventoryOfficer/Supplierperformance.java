package com.example.oop_project_group02_bata_shoe_company.Saba_2221648.inventoryOfficer;

import com.example.oop_project_group02_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;


public class Supplierperformance
{
    @FXML
    private TableView<Supplierperformance> supplierPerformanceTableview;
    @FXML
    private TableColumn<Supplierperformance,String> supplierCol;
    @FXML
    private TableColumn<Supplierperformance,Integer> delayCol;
    @FXML
    private TableColumn<Supplierperformance,Integer> ratingCol;
    @FXML
    private TableColumn<Supplierperformance,Integer> deliveryCol;

    @FXML
    public void initialize() {
        supplierCol.setCellValueFactory(new PropertyValueFactory<>("Supplier"));
        delayCol.setCellValueFactory(new PropertyValueFactory<>("Average Delay"));
        deliveryCol.setCellValueFactory(new PropertyValueFactory<>("On Time Delivery"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("Rating"));
    }

    @FXML
    public void nextButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Stockoutproducts.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Stock Products");
        stage.setScene(scene);
        stage.show();

        }
}