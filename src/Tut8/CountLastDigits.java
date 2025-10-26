package Tut8;

import java.util.Arrays;

public class CountLastDigits {
    public static int[] countLastDigits(int[] list) {
        int[] counts = new int[10];
        for (int num : list) {
            int lastDigit = Math.abs(num % 10);
            counts[lastDigit]++;
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] list = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        int[] result = countLastDigits(list);
        System.out.println(Arrays.toString(result));
    }
}
