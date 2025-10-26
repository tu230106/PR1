package Tut4;
//Activity 10

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();

        if (lines < 1 || lines > 15) {
            System.out.println("Invalid number of lines: Should be an integer from 1 to 15.");
            return;
        }

        for (int i = 1; i <= lines; i++) {
            for (int s = 0; s < (lines - i); s++) {
                System.out.print("   ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + "  ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println();
        }
    }
}
