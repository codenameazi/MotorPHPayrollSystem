package service;

import model.Employee;
import utils.SSSCalculator;
import utils.PhilHealthCalculator;
import utils.TaxCalculator;
import utils.DeductionsCalculator;

/**
 * PayrollCalculator class computes salary components, including deductions and allowances.
 */
public class PayrollCalculator {

    /**
     * Computes the gross salary based on hourly rate and hours worked.
     */
    public double computeGrossSalary(Employee employee, double hoursWorked) {
        double hourlyRate = employee.getBasicSalary() / 168; // Standard work hours per month
        return hourlyRate * hoursWorked;
    }

    /**
     * Computes the total deductions including SSS, PhilHealth, PagIbig, and tax.
     */
    public double computeDeductions(double grossSalary) {
        double sss = DeductionsCalculator.calculateSSS(grossSalary);
        double philHealth = DeductionsCalculator.calculatePhilHealth(grossSalary);
        double pagIbig = DeductionsCalculator.calculatePagIbig(grossSalary);
        double taxableIncome = grossSalary - (sss + philHealth + pagIbig);
        double tax = DeductionsCalculator.calculateTax(taxableIncome);

        return sss + philHealth + pagIbig + tax;
    }

    /**
     * Computes the net salary by subtracting deductions from the gross salary.
     */
    public double computeNetSalary(Employee employee, double hoursWorked) {
        double grossSalary = computeGrossSalary(employee, hoursWorked);
        double totalDeductions = computeDeductions(grossSalary);
        double totalAllowances = employee.getRiceSubsidy() + employee.getPhoneAllowance() + employee.getClothingAllowance();
        return grossSalary - totalDeductions + totalAllowances;
    }

    /**
     * Displays the payroll information for the employee.
     */
    public void displayPayroll(Employee employee, double hoursWorked) {
        double grossSalary = computeGrossSalary(employee, hoursWorked);
        double totalAllowances = employee.getRiceSubsidy() + employee.getPhoneAllowance() + employee.getClothingAllowance();
        double totalDeductions = computeDeductions(grossSalary);
        double netSalary = computeNetSalary(employee, hoursWorked);

        // Display payroll information
        System.out.println("\n💰 Payroll Summary for " + employee.getFullName());
        System.out.println("-------------------------------------------------");
        System.out.printf("Gross Salary: PHP %.2f%n", grossSalary);
        System.out.printf("Total Allowances: PHP %.2f%n", totalAllowances);
        System.out.printf("Total Deductions: PHP %.2f%n", totalDeductions);
        System.out.printf("Net Salary: PHP %.2f%n", netSalary);
        System.out.println("-------------------------------------------------\n");
    }
}