package Tut3;

import java.util.Scanner;

public class Activity3_Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("The equation has two roots %.6f and %.5f\n", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.printf("The equation has one root %.0f\n", x);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
