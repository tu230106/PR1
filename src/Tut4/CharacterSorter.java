package Tut4;

import java.util.Arrays;

public class CharacterSorter {
    public static String sortCharacters(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(sortCharacters("acb"));
        System.out.println(sortCharacters("banana"));
        System.out.println(sortCharacters("a1b2c3d4"));
    }
}