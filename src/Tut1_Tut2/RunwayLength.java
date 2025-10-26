package Tut1_Tut2;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed, acceleration, runwayLength;
            System.out.println("Enter speed and acceleration: ");
        speed = sc.nextDouble();
        acceleration = sc.nextDouble();
        runwayLength = Math.pow(speed, 2) / (2 * acceleration);

            System.out.printf("The minimum runway length of this airplane is %.3f\n", runwayLength);
    }
}
