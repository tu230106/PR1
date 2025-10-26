package Tut4;
//Activity 8

public class ToBinary {
    public static String decimalToBinary(int decimal) {
        if (decimal < 0 || decimal > 2147483647) {
            return "Invalid decimal: Decimal should be an integer that is positive and smaller than or equal to 2147483647.";
        }

        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binary.toString();
    }
}