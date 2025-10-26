package Tut4;
//active 2
import java.util.Scanner;

public class Partition {

    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;

        while (high >= low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                high--;
            }
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > 0 && list[high] >= pivot) {
            high--;
        }

        list[0] = list[high];
        list[high] = pivot;

        return high;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        int pivotIndex = partition(list);

        System.out.println("After partition, list is: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("\nPivot is at index: " + pivotIndex);
    }
}