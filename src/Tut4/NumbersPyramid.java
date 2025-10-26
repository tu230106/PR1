package Tut4;
//Activity 9

public class NumbersPyramid {
    public static void printNumbersPyramid(int rows) {
        if (rows < 3 || rows > 10) {
            System.out.println("Invalid number of rows: Should be an integer from 3 to 10.");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            for (int s = 0; s < rows - i; s++) {
                System.out.print("    ");
            }

            int num = 1;
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", num);
                num *= 2;
            }

            num /= 4;
            for (int j = 1; j < i; j++) {
                System.out.printf("%4d", num);
                num /= 2;
            }

            System.out.println();
        }
    }
}