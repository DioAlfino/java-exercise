package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        String str1 = "nagaram";
        String str2 = "anagram";

        boolean isAnagram = checkAnagram (str1, str2);
        if (isAnagram) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

public static boolean checkAnagram(String str1, String str2){
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);
}
}
