package Tut8;

import java.util.Scanner;

public class TextCleaning {
    public static String cleanText(String content) {
        StringBuilder result = new StringBuilder();
        for (char c : content.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = input.nextLine();
        System.out.println("Original: " + text);
        System.out.println("Cleaned: " + cleanText(text));
    }
}
