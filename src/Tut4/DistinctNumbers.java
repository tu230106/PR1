package Tut4;
//active 1
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        int[] distinctnumber = new int[10];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            boolean Newnumber = true;

            for (int j = 0; j < count; j++) {
                if (numbers[i] == distinctnumber[j]) {
                    Newnumber = false;
                    break;
                }
            }
            if (Newnumber) {
                distinctnumber[count] = numbers[i];
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctnumber[i] + " ");
        }
    }
}