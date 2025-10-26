package Tut4;
//Activity 7

import java.util.Scanner;

public class MarkovMatrixCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }

        input.close();
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] <= 0) {
                    return false;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            if (Math.abs(sum - 1.0) > 1e-9) { // tolerance for floating-point
                return false;
            }
        }

        return true;
    }
}