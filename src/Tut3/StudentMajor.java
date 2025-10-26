package Tut3;

import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two characters: ");

        String s = sc.next();
        char majorChar = s.charAt(0);
        char yearChar = s.charAt(1);

        String major = "";
        if (majorChar == 'M') major = "Mathematics";
        else if (majorChar == 'C') major = "Computer Science";
        else if (majorChar == 'i') major = "Information Technology";
        else {
            System.out.println("Invalid input");
            return;
        }

        String year = "";
        if (yearChar == '1') year = "Freshman";
        else if (yearChar == '2') year = "Sophomore";
        else if (yearChar == '3') year = "Junior";
        else if (yearChar == '4') year = "Senior";
        else {
            System.out.println("Invalid input");
            return;
        }

        System.out.println(major + " " + year);
    }

    public static class StudentMajor_C2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 characters (e.g M2): ");

            String s = sc.nextLine();
            if (s.length() > 2){
                System.out.println("Invalid input");
                return;
            }

            char Majorchar = Character.toUpperCase(s.charAt(0));
            char yearcchar = s.charAt(1);

            String major;
            switch (Majorchar){
                case 'M': major = "Mathematics";
                break;
                case 'C': major = "Computer Science";
                break;
                case 'i': major = "Information Technology";
                break;
                default:
                    System.out.println("Invalid input");
                return;
            }

            String year;
            switch (yearcchar){
                case '1': year = "Freshman";
                break;
                case '2': year = "Sophomore";
                break;
                case '3': year = "Junior";
                break;
                case '4': year = "Senior";
                default:
                    System.out.println("Invalid input");
                    return;
            }
            System.out.println(major + " " + year);
        }
    }
}
