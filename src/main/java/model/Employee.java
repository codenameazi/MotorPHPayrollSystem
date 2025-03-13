package model;

/**
 * Employee class that holds information related to the employee.
 */
public class Employee {
    private final String employeeNumber;
    private final String lastName;
    private final String firstName;
    private final String birthDate;
    private final String address;
    private final String contactNumber;
    private final String tinNumber;
    private final String sssNumber;
    private final String philHealthNumber;
    private final String pagIbigNumber;
    private final String employmentStatus;
    private final String position;
    private final String supervisor;
    private final double basicSalary;
    private final double riceSubsidy;
    private final double phoneAllowance;
    private final double clothingAllowance;

    /**
     * Constructor for Employee class.
     */
    public Employee(String employeeNumber, String lastName, String firstName, String birthDate, String address,
                    String contactNumber, String tinNumber, String sssNumber, String philHealthNumber, String pagIbigNumber,
                    String employmentStatus, String position, String supervisor, double basicSalary, 
                    double riceSubsidy, double phoneAllowance, double clothingAllowance) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
        this.contactNumber = contactNumber;
        this.tinNumber = tinNumber;
        this.sssNumber = sssNumber;
        this.philHealthNumber = philHealthNumber;
        this.pagIbigNumber = pagIbigNumber;
        this.employmentStatus = employmentStatus;
        this.position = position;
        this.supervisor = supervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
    }

    // Getter methods for all fields
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmployeeNumber() { return employeeNumber; }
    public String getBirthDate() { return birthDate; }
    public String getAddress() { return address; }
    public String getContactNumber() { return contactNumber; }
    public String getTinNumber() { return tinNumber; }
    public String getSssNumber() { return sssNumber; }
    public String getPhilHealthNumber() { return philHealthNumber; }
    public String getPagIbigNumber() { return pagIbigNumber; }
    public String getEmploymentStatus() { return employmentStatus; }
    public String getPosition() { return position; }
    public String getSupervisor() { return supervisor; }
    public double getBasicSalary() { return basicSalary; }
    public double getRiceSubsidy() { return riceSubsidy; }
    public double getPhoneAllowance() { return phoneAllowance; }
    public double getClothingAllowance() { return clothingAllowance; }

    @Override
    public String toString() {
        return String.format(
                "Employee Number: %s\nName: %s\nBirthdate: %s\nAddress: %s\nPhone Number: %s\nTIN#: %s\nSSS#: %s\nPhilHealth#: %s\nPag-IBIG#: %s\nStatus: %s\nPosition: %s\nSupervisor: %s\nBasic Salary: PHP %.2f\nRice Subsidy: PHP %.2f\nPhone Allowance: PHP %.2f\nClothing Allowance: PHP %.2f",
                employeeNumber, getFullName(), birthDate, address, contactNumber, tinNumber, sssNumber, philHealthNumber,
                pagIbigNumber, employmentStatus, position, supervisor, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance
        );
    }
}