package com.sparta.ft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

//    @Test
//    @DisplayName("Test to check method returns true")
//    void checkMethodTrueTest() {
//        assertTrue(palindromeChecker.checkMethod("BOB"));
//    }

    @Test
    @DisplayName("Test to check method returns longest palindrome")
    void checkLongestPalindromeTest() {
        Assertions.assertEquals("DEEEED", palindromeChecker.checkLongestPalindrome("DOOD IS THE DEEEED AND BOB HAS"));
    }

}