package utils;

import model.Employee;

public class PayslipGenerator {
    public static void generatePayslip(Employee employee, double hoursWorked, double grossSalary, 
                                   double sss, double philHealth, double pagIbig, 
                                   double withholdingTax, double netSalary) {

    // ✅ Compute total allowances, including clothing allowance
    double totalAllowances = employee.getRiceSubsidy() + employee.getPhoneAllowance() + employee.getClothingAllowance();
    
    // ✅ Compute final net salary including allowances
    double finalNetSalary = netSalary + totalAllowances;

    // ✅ Printing the Payslip
    System.out.println("\n===========================================");
    System.out.println("                 PAYSLIP                ");
    System.out.println("===========================================");
    System.out.printf(" Employee: %-22s ID: %s%n", employee.getFullName(), employee.getEmployeeNumber());
    System.out.printf(" Birthdate: %-30s%n", employee.getBirthDate());
    System.out.printf(" Address: %-40s%n", employee.getAddress());
    System.out.printf(" Phone No.: %-30s%n", employee.getContactNumber());
    System.out.printf(" TIN No.: %-30s%n", employee.getTinNumber());
    System.out.printf(" SSS No.: %-30s%n", employee.getSssNumber());
    System.out.printf(" PhilHealth No.: %-30s%n", employee.getPhilHealthNumber());
    System.out.printf(" Pag-IBIG No.: %-30s%n", employee.getPagIbigNumber());
    System.out.printf(" Status: %-30s%n", employee.getEmploymentStatus());
    System.out.printf(" Position: %-30s%n", employee.getPosition());
    System.out.printf(" Supervisor: %-30s%n", employee.getSupervisor());
    System.out.println("-------------------------------------------");
    System.out.printf(" %-30s PHP %12.2f%n", "Basic Salary:", employee.getBasicSalary());
    System.out.printf(" %-30s PHP %12.2f%n", "Hourly Rate:", (employee.getBasicSalary() / 168));  // Based on 168 for full-time work
    System.out.printf(" %-30s %10.2f%n", "Hours Worked:", hoursWorked);
    System.out.printf(" %-30s PHP %12.2f%n", "Gross Salary:", grossSalary);
    System.out.println("-------------------------------------------");
    System.out.println(" ✅ Allowances:");
    System.out.printf(" - %-27s PHP %12.2f%n", "Rice Subsidy:", employee.getRiceSubsidy());
    System.out.printf(" - %-27s PHP %12.2f%n", "Phone Allowance:", employee.getPhoneAllowance());
    System.out.printf(" - %-27s PHP %12.2f%n", "Clothing Allowance:", employee.getClothingAllowance());
    System.out.printf(" %-30s PHP %12.2f%n", "Total Allowances:", totalAllowances);
    System.out.println("-------------------------------------------");
    System.out.println(" ✅ Deductions:");
    System.out.printf(" - %-27s PHP %12.2f%n", "Pag-IBIG:", pagIbig);
    System.out.printf(" - %-27s PHP %12.2f%n", "PhilHealth:", philHealth);
    System.out.printf(" - %-27s PHP %12.2f%n", "SSS:", sss);
    System.out.printf(" - %-27s PHP %12.2f%n", "Tax:", withholdingTax);
    System.out.println("-------------------------------------------");
    System.out.printf(" ✅ %-30s PHP %12.2f%n", "Final Net Salary:", finalNetSalary);
    System.out.println("===========================================");
}
}