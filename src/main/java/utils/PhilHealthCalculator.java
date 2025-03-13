package utils;

public class PhilHealthCalculator {
    public static double getPhilHealthContribution(double salary) {
        double contribution = (salary * 0.03) / 2; // 3% contribution, employee share is half
        return contribution; // Return the employee share
    }
}