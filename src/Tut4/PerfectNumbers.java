package Tut4;
//Activity 12

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("The four perfect numbers less than 10,000:");

        for (int number = 2; number < 10000; number++) {
            if (isPerfect(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}