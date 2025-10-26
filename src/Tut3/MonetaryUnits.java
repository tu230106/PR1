package Tut3;

import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money (in dollar): ");
        double amount = sc.nextDouble();

        int cents = (int)Math.round(amount * 100);
        int dollars = cents / 100;
        cents = cents % 100;
        int quarters = cents / 25;
        cents = cents % 25;
        int dimes = cents / 10;
        cents = cents % 10;
        int nickels = cents / 5;
        cents = cents % 5;
        int pennies = cents;

        System.out.println( amount + " has "
                            + dollars + " dollars, "
                            + quarters + " quaters, "
                            + dimes + " dimes, "
                            + nickels + " nickles, "
                            + pennies + " cents.");

    }
}