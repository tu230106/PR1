package TUT5;
import java.util.Scanner;
public class GCDRecursive {
    public static int gcd(int m, int n) {
        // Chuyển cả hai số thành dương để tránh lỗi
        m = Math.abs(m);
        n = Math.abs(n);

        // Trường hợp cơ sở: nếu n = 0 thì GCD là m
        if (n == 0) {
            return m;
        }

        // Gọi đệ quy: gcd(m, n) = gcd(n, m % n)
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer (m): ");
        int m = input.nextInt();

        System.out.print("Enter second integer (n): ");
        int n = input.nextInt();

        // Nếu cả hai đều là 0, không có GCD
        if (m == 0 && n == 0) {
            System.out.println("GCD is undefined (both numbers are zero).");
        } else {
            int result = gcd(m, n);
            System.out.println("GCD of " + m + " and " + n + " is: " + result);
        }

    }
}
