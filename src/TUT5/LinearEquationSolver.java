package TUT5;

import java.util.Scanner;

public class LinearEquationSolver {

    // Method to solve ax + b = 0
    public static String solveLinearEquation(double a, double b) {
        // Case 1: a = 0 and b = 0 -> infinitely many solutions
        if (a == 0 && b == 0) {
            return "The equation has infinitely many solutions.";
        }
        // Case 2: a = 0 and b != 0 -> no solution
        else if (a == 0 && b != 0) {
            return "The equation has no solution.";
        }
        // Case 3: a != 0 -> unique solution
        else {
            double x = -b / a;
            return "The solution is x = " + x;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // tạo đối tượng Scanner để nhập dữ liệu

        System.out.print("Enter value for a: ");
        double a = input.nextDouble();  // nhập hệ số a

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();  // nhập hệ số b

        // Gọi hàm giải phương trình và in kết quả
        System.out.println(solveLinearEquation(a, b));

        input.close(); // đóng Scanner sau khi dùng xong
    }
}
