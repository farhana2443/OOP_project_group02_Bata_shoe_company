package com.example.oop_project_group02_bata_shoe_company.Summy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PopulateEmployeeBIN {

    public static void main(String[] args) {

        // Create /bin directory if not exists
        File dir = new File("bin");
        if (!dir.exists()) {
            dir.mkdirs();
        }


        List<EmployeeModelClass> list = new ArrayList<>();

        list.add(new EmployeeModelClass("EMP-001", "Rahim Uddin", "Finance", "Accounts Officer",
                LocalDate.of(2022, 3, 12), "01711112222", "rahim@bata.com"));

        list.add(new EmployeeModelClass("EMP-002", "Nusrat Jahan", "Human Resource", "HR Executive",
                LocalDate.of(2023, 6, 5), "01833334444", "nusrat@bata.com"));

        list.add(new EmployeeModelClass("EMP-003", "Tanvir Hasan", "Sales", "Sales Executive",
                LocalDate.of(2021, 9, 18), "01955556666", "tanvir@bata.com"));

        list.add(new EmployeeModelClass("EMP-004", "Priya Saha", "Marketing", "Marketing Officer",
                LocalDate.of(2020, 11, 25), "01677778888", "priya@bata.com"));

        list.add(new EmployeeModelClass("EMP-005", "Mehedi Hossain", "IT", "System Analyst",
                LocalDate.of(2022, 1, 10), "01399990000", "mehedi@bata.com"));

        list.add(new EmployeeModelClass("EMP-006", "Farzana Akter", "Customer Service", "CSR",
                LocalDate.of(2023, 2, 14), "01522223333", "farzana@bata.com"));

        list.add(new EmployeeModelClass("EMP-007", "Sabbir Rahman", "Store Operations", "Store Supervisor",
                LocalDate.of(2019, 8, 20), "01744445555", "sabbir@bata.com"));

        list.add(new EmployeeModelClass("EMP-008", "Mim Akter", "Inventory", "Inventory Officer",
                LocalDate.of(2022, 7, 3), "01866667777", "mim@bata.com"));

        list.add(new EmployeeModelClass("EMP-009", "Arif Khan", "Supply Chain", "Logistics Officer",
                LocalDate.of(2021, 5, 9), "01988889999", "arif@bata.com"));

        list.add(new EmployeeModelClass("EMP-010", "Jannatul Ferdous", "Finance", "Payroll Officer",
                LocalDate.of(2020, 4, 15), "01610101010", "jannatul@bata.com"));

        list.add(new EmployeeModelClass("EMP-011", "Nayeem Chowdhury", "IT", "Software Support",
                LocalDate.of(2023, 1, 20), "01720202020", "nayeem@bata.com"));

        list.add(new EmployeeModelClass("EMP-012", "Sumaiya Islam", "HR", "Recruitment Officer",
                LocalDate.of(2022, 10, 12), "01830303030", "sumaiya@bata.com"));

        list.add(new EmployeeModelClass("EMP-013", "Rabbi Ahmed", "Sales", "Sales Manager",
                LocalDate.of(2019, 12, 1), "01940404040", "rabbi@bata.com"));

        list.add(new EmployeeModelClass("EMP-014", "Sharmin Sultana", "Marketing", "Content Strategist",
                LocalDate.of(2021, 6, 22), "01650505050", "sharmin@bata.com"));

        list.add(new EmployeeModelClass("EMP-015", "Imran Hossain", "Warehouse", "Warehouse Supervisor",
                LocalDate.of(2020, 9, 5), "01760606060", "imran@bata.com"));

        list.add(new EmployeeModelClass("EMP-016", "Tania Rahman", "Customer Service", "Senior CSR",
                LocalDate.of(2022, 8, 17), "01870707070", "tania@bata.com"));

        list.add(new EmployeeModelClass("EMP-017", "Hasibur Rahman", "Security", "Security Officer",
                LocalDate.of(2018, 2, 11), "01980808080", "hasib@bata.com"));

        list.add(new EmployeeModelClass("EMP-018", "Lubna Karim", "Admin", "Office Administrator",
                LocalDate.of(2021, 3, 29), "01690909090", "lubna@bata.com"));

        list.add(new EmployeeModelClass("EMP-019", "Rashed Mahmud", "Maintenance", "Maintenance Engineer",
                LocalDate.of(2019, 7, 14), "01711113333", "rashed@bata.com"));

        list.add(new EmployeeModelClass("EMP-020", "Sadia Afrin", "Training", "Training Coordinator",
                LocalDate.of(2023, 4, 8), "01822224444", "sadia@bata.com"));


        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("bin/employee.bin"))) {

            oos.writeObject(list);
            System.out.println("employee.bin successfully created with 20 employees!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
