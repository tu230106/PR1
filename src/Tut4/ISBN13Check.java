package Tut4;
//Activity 11

import java.util.Scanner;

public class ISBN13Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();

        if (isbn.length() != 12 || !isbn.matches("\\d{12}")) {
            System.out.println(isbn + " is an invalid input");
            return;
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += 3 * digit;
            }
        }

        int checksum = 10 - (sum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        String fullIsbn = isbn + checksum;
        System.out.println("The ISBN-13 number is " + fullIsbn);
    }
}