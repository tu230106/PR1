import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;

        while (number < 20) {
            number++;

            // Bỏ qua 10 và 11
            if (number == 10 || number == 11) {
                continue;
            }

            sum += number;
        }

        System.out.println("The sum is: " + sum);
    }
}








