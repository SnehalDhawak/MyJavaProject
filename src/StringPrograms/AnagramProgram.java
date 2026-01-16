package StringPrograms;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char arr[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr2);
        if (str1.length() != str2.length())
            System.out.println("not Anagram");
        else {
            Arrays.sort(arr);
            Arrays.sort(arr2);
            if (Arrays.equals(arr, arr2)) {
                System.out.println("\nGiven strings are anagrams");
            } else {
                System.out.println("\nGiven strings are not anagrams");
            }
        }
    }
}




