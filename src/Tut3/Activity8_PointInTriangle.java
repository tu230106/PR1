package Tut3;

import java.util.Scanner;

public class Activity8_PointInTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a point's x- and y-coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean isInsideTriangle = (x >= 0 && y >= 0) && (y <= -0.5 * x + 100);

        System.out.println("The point (" + x + ", " + y + ") is "
                + (isInsideTriangle ? "" : "not ")
                + "in the triangle");
    }
}