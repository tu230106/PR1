package Tut4;
//Activity 5

import java.util.Scanner;

public class PatternRecognition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter values into the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }


        if (isConsecutiveFour(matrix)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        input.close();

    }

    private static boolean isConsecutiveFour(int[][] values) {
        int rows = values.length;
        int cols = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                int num = values[i][j];
                if (num == values[i][j+1] &&
                        num == values[i][j+2] &&
                        num == values[i][j+3]) {
                    return true;
                }
            }
        }

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i <= rows - 4; i++) {
                int num = values[i][j];
                if (num == values[i+1][j] &&
                        num == values[i+2][j] &&
                        num == values[i+3][j]) {
                    return true;
                }
            }
        }


        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                int num = values[i][j];
                if (num == values[i+1][j+1] &&
                        num == values[i+2][j+2] &&
                        num == values[i+3][j+3]) {
                    return true;
                }
            }
        }


        for (int i = 3; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                int num = values[i][j];
                if (num == values[i-1][j+1] &&
                        num == values[i-2][j+2] &&
                        num == values[i-3][j+3]) {
                    return true;
                }
            }
        }

        return false;
    }
}
