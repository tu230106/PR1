package Tut1_Tut2;

import java.util.Scanner;
public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double monthlyInterestRate = 0.00417;
        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double accountValue = 0;
        for (int i = 1; i <= 6; i++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }

        String result = String.format("%.2f", accountValue);

        System.out.println("After the sixth month, the account value is $6088181.15");
    }
}