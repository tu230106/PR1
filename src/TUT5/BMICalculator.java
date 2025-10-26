package TUT5;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        // 1. Input validation
        if (weight <= 0 || height <= 0) {
            return -1.0;
        }

        // 2. BMI calculation formula: weight / (height * height)
        double bmi = weight / (height * height);

        // 3. Return the calculated BMI
        return bmi;
    }

    public static void main(String[] args) {
        System.out.println("Your BMI is: " + calculateBMI(70, 1.75));
        System.out.println("Your BMI is: " + calculateBMI(-70, 1.75));
        System.out.println("Your BMI is: " + calculateBMI(70, -1.75));
    }
}
