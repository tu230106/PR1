package Tut1_Tut2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int d1 = number % 10;
        int remaining1 = number / 10;
        int d2 = remaining1 % 10;
        int remaining2 = remaining1 / 10;
        int d3 = remaining2 % 10;
        int sum = d1 + d2 + d3;
        System.out.println("The sum of the digits is " + sum);
    }
}
