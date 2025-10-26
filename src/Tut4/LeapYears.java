package Tut4;
//Activity 13

public class LeapYears {
    public static void main(String[] args) {
        int count = 0;
        int perLine = 0;

        System.out.println("All the leap years from 101 to 2100:");

        for (int year = 101; year <= 2100; year ++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                count++;
                perLine++;

                if (perLine == 10) {
                    System.out.println();
                    perLine = 0;
                }
            }
        }

        if (perLine != 0) {
            System.out.println();
        }

        System.out.println("Total number of leap years in this period: " + count);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
