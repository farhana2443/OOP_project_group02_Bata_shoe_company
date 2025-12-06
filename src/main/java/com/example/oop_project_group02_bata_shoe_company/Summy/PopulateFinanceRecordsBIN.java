package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PopulateFinanceRecordsBIN {

    public static void main(String[] args) {


        File dir = new File("bin");
        if (!dir.exists()) {
            dir.mkdirs();
        }


        List<FinanceRecordModelClass> list = new ArrayList<>();


        list.add(new FinanceRecordModelClass(LocalDate.of(2023, 1, 10), "Dhaka", 52000, 30000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2023, 3, 5), "Chittagong", 45000, 27000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2023, 6, 18), "Rangpur", 38000, 20000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2023, 9, 25), "Dhaka", 60000, 35000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2023, 12, 2), "Chittagong", 49000, 26000));


        list.add(new FinanceRecordModelClass(LocalDate.of(2024, 2, 15), "Rangpur", 41000, 22000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2024, 4, 7), "Dhaka", 68000, 42000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2024, 6, 12), "Chittagong", 52000, 31000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2024, 8, 9), "Rangpur", 47000, 25000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2024, 11, 28), "Dhaka", 72000, 43000));


        list.add(new FinanceRecordModelClass(LocalDate.of(2025, 1, 16), "Chittagong", 54000, 32000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2025, 2, 20), "Dhaka", 79000, 50000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2025, 4, 3), "Rangpur", 39000, 18000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2025, 5, 22), "Chittagong", 61000, 35000));
        list.add(new FinanceRecordModelClass(LocalDate.of(2025, 7, 14), "Dhaka", 85000, 56000));


        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("bin/financeRecords.bin"))) {

            oos.writeObject(list);
            System.out.println("financeRecords.bin successfully created");

        } catch (Exception e) {
            System.out.println("Error writing BIN file:");
            e.printStackTrace();
        }
    }


}
