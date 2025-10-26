package Tut4;
//Activity 4

import java.util.*;

public class SortStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of students:");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Error: No students to sort.");
            return;
        }

        class Student {
            String name;
            int score;

            Student(String name, int score) {
                this.name = name;
                this.score = score;
            }
        }

        Student[] students = new Student[n];
        boolean hasInvalid = false;

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            String name = input.next();
            System.out.println("Student " + (i + 1) + "'s score:");
            int score = input.nextInt();

            if (score < 0 || score > 100) {
                hasInvalid = true;
            }

            students[i] = new Student(name, score);
        }

        if (hasInvalid) {
            System.out.println("Invalid score: The score cannot be negative or exceed 100.");
            return;
        }

        Arrays.sort(students, (a, b) -> b.score - a.score);

        System.out.print("List of students: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name + "(" + students[i].score + ")");
            if (i < students.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
