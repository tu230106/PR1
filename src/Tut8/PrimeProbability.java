package Tut8;

import java.util.Random;

public class PrimeProbability {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;

        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(999) + 2; // 2–1000
            if (isPrime(num)) count++;
        }

        System.out.println("Among 100 random integers, " + count + " are prime numbers");
        System.out.println("Probability is " + count + "%");
    }
}
