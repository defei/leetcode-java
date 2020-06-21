package org.codelogger.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem0009Test {

    private Problem0009 problem0009 = new Problem0009();

    @Test
    public void isPalindrome_negativeNumber_false() {

        assertFalse(problem0009.isPalindrome(-1));
    }

    @Test
    public void isPalindrome_zeroOrPositiveNumberOfLessTen_true() {

        for (int i = 0; i < 10; i++) {

            assertTrue(problem0009.isPalindrome(i));
        }
    }

    @Test
    public void isPalindrome_4lengthNumberAndPalindrome_true() {

        assertTrue(problem0009.isPalindrome(1001));
    }

    @Test
    public void isPalindrome_4lengthNumberAndNotPalindrome_false() {

        assertFalse(problem0009.isPalindrome(1011));
    }

    @Test
    public void isPalindrome_5lengthNumberAndPalindrome_true() {

        assertTrue(problem0009.isPalindrome(10101));
    }

    @Test
    public void isPalindrome_5lengthNumberAndNotPalindrome_false() {

        assertFalse(problem0009.isPalindrome(10111));
    }
}