package Tut4;
//Activity 6

import java.util.Scanner;

public class LargestBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int n = input.nextInt();

        int[][] m = new int[n][n];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = input.nextInt();
            }
        }

        int[] result = findLargestBlock(m);
        System.out.println("The maximum square submatrix is at ("
                + result[0] + ", " + result[1] + ") with size " + result[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        int n = m.length;
        int[][] size = new int[n][n];

        int maxSize = 0;
        int maxRow = 0;
        int maxCol = 0;


        for (int i = 0; i < n; i++) {
            size[i][0] = m[i][0];
            size[0][i] = m[0][i];
        }


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (m[i][j] == 1) {
                    size[i][j] = 1 + Math.min(size[i-1][j-1],
                            Math.min(size[i-1][j], size[i][j-1]));
                } else {
                    size[i][j] = 0;
                }


                if (size[i][j] > maxSize) {
                    maxSize = size[i][j];
                    maxRow = i - maxSize + 1;
                    maxCol = j - maxSize + 1;
                }
            }
        }


        return new int[]{maxRow, maxCol, maxSize};
    }
}