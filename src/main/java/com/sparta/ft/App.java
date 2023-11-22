package com.sparta.ft;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.checkMethod("BROTHER"));

        System.out.println(palindromeChecker.checkLongestPalindrome("DOOD IS THE DEEEED AND BOB HAS"));

    }
}
