package Tut4;
//Activity 14

import java.util.Scanner;

public class TrianglePatterns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of rows: ");
        int rows = input.nextInt();

        if (rows < 1 || rows > 9) {
            System.out.println("Invalid number of rows: Should be an integer from 1 to 9.");
            return;
        }

        System.out.println("Pattern A");
        patternA(rows);

        System.out.println("Pattern B");
        patternB(rows);

        System.out.println("Pattern C");
        patternC(rows);

        System.out.println("Pattern D");
        patternD(rows);
    }

    public static void patternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternB(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternD(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
