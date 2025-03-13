package main;

import service.PayrollSystem;
import model.Employee;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import com.opencsv.exceptions.CsvException;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        try {
            // Load employee data from CSV
            payrollSystem.loadEmployeeData("src/data/employee_data.csv");
            payrollSystem.displayEmployees();

            // Retrieve employee list
            List<Employee> employeeList = payrollSystem.getEmployees();
            if (employeeList.isEmpty()) {
                System.out.println("⚠ No employees found. Exiting payroll processing.");
                return;
            }

            // Scanner for user input
            try (Scanner scanner = new Scanner(System.in)) {
                for (Employee emp : employeeList) {
                    if (emp == null) continue; // Skip null entries

                    System.out.println("\nProcessing Payroll for: " + emp.getFullName());
                    System.out.println("======================================");
                    System.out.println(emp);

                    double hoursWorked = getValidHoursWorked(scanner, emp);
                    payrollSystem.processPayroll(emp, hoursWorked);
                }
            }
        } catch (IOException | CsvException e) {
            System.err.println("❌ Error loading employee data: " + e.getMessage());
        }
    }

    private static double getValidHoursWorked(Scanner scanner, Employee emp) {
        double hoursWorked = 0.0;
        while (true) {
            System.out.print("Enter hours worked for " + emp.getFullName() + ": ");
            if (scanner.hasNextDouble()) {
                hoursWorked = scanner.nextDouble();
                if (hoursWorked >= 0) return hoursWorked; // Accept only non-negative values
            } else {
                System.out.println("⚠ Invalid input. Please enter a valid number.");
            }
            scanner.nextLine(); // Clear invalid input
        }
    }
}
