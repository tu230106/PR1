package Tut3;

import java.util.Scanner;

public class Activity6_PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= 10) {
            System.out.printf("Point (%.1f, %.1f) is in the circle%n", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle%n", x, y);
        }
    }
}
