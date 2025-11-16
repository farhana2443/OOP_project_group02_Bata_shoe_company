module com.example.oop_project_group02_bata_shoe_company {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_project_group02_bata_shoe_company to javafx.fxml;
    exports com.example.oop_project_group02_bata_shoe_company;
}