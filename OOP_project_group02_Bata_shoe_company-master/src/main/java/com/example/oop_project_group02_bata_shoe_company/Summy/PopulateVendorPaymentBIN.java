package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PopulateVendorPaymentBIN {

    public static void main(String[] args) {

        File dir = new File("bin");
        if (!dir.exists()) {
            dir.mkdirs();  // Creates bin folder
        }

        List<VendorPaymentModelClass> list = new ArrayList<>();

        list.add(new VendorPaymentModelClass("INV-001", 2500, LocalDate.of(2025, 1, 10), "REF-A"));
        list.add(new VendorPaymentModelClass("INV-002", 6000, LocalDate.of(2025, 1, 25), "REF-B"));
        list.add(new VendorPaymentModelClass("INV-003", 4200, LocalDate.of(2025, 2, 5), "REF-C"));
        list.add(new VendorPaymentModelClass("INV-004", 3500, LocalDate.of(2025, 2, 15), "REF-D"));
        list.add(new VendorPaymentModelClass("INV-005", 8000, LocalDate.of(2025, 3, 1), "REF-E"));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("bin/vendorPayment.bin"))) {

            oos.writeObject(list);
            System.out.println("vendorPayment.bin successfully created!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}