module com.example.oop_project_group02_bata_shoe_company {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.librepdf.openpdf;
    requires javafx.graphics;

    opens com.example.oop_project_group02_bata_shoe_company to javafx.fxml;
    exports com.example.oop_project_group02_bata_shoe_company;
    exports com.example.oop_project_group02_bata_shoe_company.Summy;
    opens com.example.oop_project_group02_bata_shoe_company.Summy to javafx.fxml;

    opens com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor to javafx.fxml;
    exports com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;
    opens com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer to javafx.fxml;
    exports com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.supplierOfficer;
}
