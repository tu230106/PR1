package Tut3;

import java.util.Scanner;

public class Activity5_Business {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String isbn9 = sc.nextLine();

        while (isbn9.length() < 9) {
            isbn9 = "0" + isbn9;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = isbn9.charAt(i) - '0';
            sum += digit * (i + 1);
        }
        int checksum = sum % 11;

        if (checksum == 10) {
            System.out.println("The ISBN-10 number is " + isbn9 + "X");
        } else {
            System.out.println("The ISBN-10 number is " + isbn9 + checksum);
        }
    }
}
