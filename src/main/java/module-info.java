module com.example.oop_project_group02_bata_shoe_company {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_project_group02_bata_shoe_company to ja vafx.fxml;
    exports com.example.oop_project_group02_bata_shoe_company;
    exports com.example.oop_project_group02_bata_shoe_company.Summy;
    opens com.example.oop_project_group02_bata_shoe_company.Summy to javafx.fxml;

    opens com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor to javafx.fxml;

    // Optional: if controllers use @FXML injection, exporting is fine too
    exports com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

}