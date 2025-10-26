package Tut3;

import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        System.out.println("Enter a month: ");
        String month = sc.next();
        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();

        int days = 0;

        switch (month) {
            case "jan": case "mar": case "may": case "jul":
            case "aug": case "oct": case "dec":
                days = 31;
                break;
            case "apr": case "jun": case "sep": case "nov":
                days = 30;
                break;
            case "feb":
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                return;
        }
        System.out.println(capitalize(month) + " " + year + " has " + days + " days");
    }
    public static String capitalize(String m) {
        return m.substring(0,1).toUpperCase() + m.substring(1);
    }
}
