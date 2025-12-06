package com.example.oop_project_group02_bata_shoe_company.Summy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.*;

public class FileHelperModelClass {

    public static List<FinanceRecordModelClass> readFinanceRecords() {
        List<FinanceRecordModelClass> records = new ArrayList<>();

        records.add(new FinanceRecordModelClass(LocalDate.of(2025, 12, 1), "Dhaka", 5000, 2000));
        records.add(new FinanceRecordModelClass(LocalDate.of(2025, 12, 2), "Chittagong", 4000, 1500));
        records.add(new FinanceRecordModelClass(LocalDate.of(2025, 12, 3), "Rangpur", 4500, 1800));

        return records;
    }

    public static ObservableList<FinanceRecordModelClass> getObservableRecords() {
        return FXCollections.observableArrayList(readFinanceRecords());
    }
}
