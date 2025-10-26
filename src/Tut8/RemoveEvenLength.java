package Tut8;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenLength {
    public static void removeEvenLength(ArrayList<String> arrList) {
        for (int i = arrList.size() - 1; i >= 0; i--) {
            if (arrList.get(i).length() % 2 == 0) {
                arrList.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("odd", "even", "abc", "abcd", "abcde", "abcdef")
        );
        System.out.println("Original list: " + words);
        removeEvenLength(words);
        System.out.println("Output list: " + words);
    }
}
