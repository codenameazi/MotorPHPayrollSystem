package utils;

public class DeductionsCalculator {
    public static double calculatePagIbig(double grossSalary) {
        return Math.min(grossSalary * 0.03, 100);
    }
    public static double calculatePhilHealth(double grossSalary) {
        return PhilHealthCalculator.getPhilHealthContribution(grossSalary);
    }
    public static double calculateSSS(double grossSalary) {
        return SSSCalculator.getSSSContribution(grossSalary);
    }
    public static double calculateTax(double taxableIncome) {
        return TaxCalculator.computeWithholdingTax(taxableIncome);
    }
}