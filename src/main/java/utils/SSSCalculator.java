package utils;

public class SSSCalculator {
    public static double getSSSContribution(double salary) {
        // 2023 SSS Contribution Table
        if (salary < 4250) return 180.00;  // Minimum
        if (salary <= 4749.99) return 202.50;
        if (salary <= 5249.99) return 225.00;
        if (salary <= 5749.99) return 247.50;
        if (salary <= 6249.99) return 270.00;
        if (salary <= 6749.99) return 292.50;
        if (salary <= 7249.99) return 315.00;
        if (salary <= 7749.99) return 337.50;
        if (salary <= 8249.99) return 360.00;
        if (salary <= 8749.99) return 382.50;
        if (salary <= 9249.99) return 405.00;
        if (salary <= 9749.99) return 427.50;
        if (salary <= 10249.99) return 450.00;
        if (salary <= 10749.99) return 472.50;
        if (salary <= 11249.99) return 495.00;
        if (salary <= 11749.99) return 517.50;
        if (salary <= 12249.99) return 540.00;
        if (salary <= 12749.99) return 562.50;
        if (salary <= 13249.99) return 585.00;
        if (salary <= 13749.99) return 607.50;
        if (salary <= 14249.99) return 630.00;
        if (salary <= 14749.99) return 652.50;
        if (salary <= 15249.99) return 675.00;
        if (salary <= 15749.99) return 697.50;
        if (salary <= 16249.99) return 720.00;
        if (salary <= 16749.99) return 742.50;
        if (salary <= 17249.99) return 765.00;
        if (salary <= 17749.99) return 787.50;
        if (salary <= 18249.99) return 810.00;
        if (salary <= 18749.99) return 832.50;
        if (salary <= 19249.99) return 855.00;
        if (salary <= 19749.99) return 877.50;
        if (salary <= 20249.99) return 900.00;
        if (salary <= 20749.99) return 922.50;
        if (salary <= 21249.99) return 945.00;
        if (salary <= 21749.99) return 967.50;
        if (salary <= 22249.99) return 990.00;
        if (salary <= 22749.99) return 1012.50;
        if (salary <= 23249.99) return 1035.00;
        if (salary <= 23749.99) return 1057.50;
        if (salary <= 24249.99) return 1080.00;
        if (salary <= 24749.99) return 1102.50;
        return 1125.00; // Maximum contribution
    }
}