package main;

import service.PayrollSystem;
import model.Employee;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.opencsv.exceptions.CsvException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        try {
            File csvFile = new File("src/data/employee_data.csv");
            payrollSystem.loadEmployeeData(csvFile.getPath());
            payrollSystem.displayEmployees();

            List<Employee> employeeList = payrollSystem.getEmployees();
            if (employeeList.isEmpty()) {
                System.out.println("⚠ No employees found. Exiting payroll processing.");
                return;
            }

            for (Employee emp : employeeList) {
                if (emp == null) continue;

                double hoursWorked = calculateTotalHoursWorkedForJune();
                payrollSystem.processPayroll(emp, hoursWorked);
            }
        } catch (IOException | CsvException e) {
            System.err.println("❌ Error loading employee data: " + e.getMessage());
        }
    }

    private static double calculateTotalHoursWorkedForJune() {
        LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 6, 1);
        LocalDate endDate = LocalDate.of(LocalDate.now().getYear(), 6, 15);
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate) + 1; // Including end date

        // Assuming 8 hours per workday
        double hoursPerDay = 8.0;
        return totalDays * hoursPerDay;
    }
}