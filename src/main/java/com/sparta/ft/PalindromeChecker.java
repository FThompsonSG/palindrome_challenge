package com.sparta.ft;

import java.util.Arrays;

public class PalindromeChecker {

    public boolean checkMethod(String input) {

            boolean isPalindrome = false;
            char[] inputCharArray = input.toCharArray();
            char[] reverseCharArray = new char[inputCharArray.length];

            for (int i = input.length() - 1; i >= 0; i--) {
                reverseCharArray[i] = inputCharArray[input.length() - 1 - i];
            }

            if (Arrays.equals(inputCharArray, reverseCharArray)) {
                isPalindrome = true;
            }

            return isPalindrome;

    }

    public String checkLongestPalindrome(String input) {

        String[] wordArray = input.split(" ");
        String result = "";

        for (String word : wordArray) {
            if (checkMethod(word)) {
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;

    }

}
