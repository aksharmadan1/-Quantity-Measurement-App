public class QuantityMeasurementApp {

    // Main method for manual verification if needed
    public static void main(String[] args) {
        System.out.println("Status: Quantity Measurement App Initialized");
    }

    // Static method to validate and compare Feet
    public static boolean compareFeet(double f1, double f2) {
        Feet feet1 = new Feet(f1);
        Feet feet2 = new Feet(f2);
        return feet1.equals(feet2);
    }

    // Static method to validate and compare Inches
    public static boolean compareInches(double i1, double i2) {
        Inches inch1 = new Inches(i1);
        Inches inch2 = new Inches(i2);
        return inch1.equals(inch2);
    }
}
