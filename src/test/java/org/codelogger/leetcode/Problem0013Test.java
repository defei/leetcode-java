package org.codelogger.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem0013Test {

    private Problem0013 problem0013 = new Problem0013();

    @Test
    public void romanToInt_III_3() {

        assertEquals(3, problem0013.romanToInt("III"));
    }
    @Test
    public void romanToInt_IV_4() {

        assertEquals(4, problem0013.romanToInt("IV"));
    }

    @Test
    public void romanToInt_IX_9() {

        assertEquals(9, problem0013.romanToInt("IX"));
    }

    @Test
    public void romanToInt_LVIII_58() {

        assertEquals(58, problem0013.romanToInt("LVIII"));
    }

    @Test
    public void romanToInt_MCMXCIV_1994() {

        assertEquals(1994, problem0013.romanToInt("MCMXCIV"));
    }
}