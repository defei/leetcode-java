package org.codelogger.leetcode;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem0007Test {

    private Problem0007 problem0007 = new Problem0007();

    @Test
    public void reverse_zero() {

        int reverse = problem0007.reverse(0);
        assertEquals(0, reverse);
    }

    @Test
    public void reverse_positiveOneLengthNum() {

        int reverse = problem0007.reverse(7);
        assertEquals(7, reverse);
    }

    @Test
    public void reverse_negativeOneLengthNum() {

        int reverse = problem0007.reverse(-7);
        assertEquals(-7, reverse);
    }

    @Test
    public void reverse_positiveTwoLengthNum() {

        int reverse = problem0007.reverse(17);
        assertEquals(71, reverse);
    }

    @Test
    public void reverse_negativeTwoLengthNum() {

        int reverse = problem0007.reverse(-17);
        assertEquals(-71, reverse);
    }

    @Test
    public void reverse_positiveOverflowNum() {

        int reverse = problem0007.reverse(Integer.MAX_VALUE);
        assertEquals(0, reverse);
    }

    @Test
    public void reverse_negativeOverflowNum() {

        int reverse = problem0007.reverse(Integer.MIN_VALUE);
        assertEquals(0, reverse);
    }

    @Test
    public void test(){
        int reverse = problem0007.reverse(1463847412);
        assertEquals(2147483641, reverse);

    }

    @Test
    public void test1(){
        int reverse = problem0007.reverse(1563847412);
        assertEquals(0, reverse);

    }
}