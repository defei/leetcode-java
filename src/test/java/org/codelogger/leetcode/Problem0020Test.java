package org.codelogger.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem0020Test {

    private Problem0020 problem0020 = new Problem0020();

    @Test
    public void isValid_null_true() {

        assertTrue(problem0020.isValid(null));
    }

    @Test
    public void isValid_emptyString_true() {

        assertTrue(problem0020.isValid(""));
    }

    @Test
    public void isValid_oddLength_true() {

        assertFalse(problem0020.isValid("{"));
        assertFalse(problem0020.isValid("{}["));
    }

    @Test
    public void isValid_evenLengthAndPair_true() {

        assertTrue(problem0020.isValid("()"));
        assertTrue(problem0020.isValid("[]"));
        assertTrue(problem0020.isValid("{}"));
    }

    @Test
    public void isValid_evenLengthAndNotPair0_true() {

        assertFalse(problem0020.isValid("(}"));
    }

    @Test
    public void isValid_evenLengthAndNotPair1_true() {

        assertFalse(problem0020.isValid("{)"));
    }

    @Test
    public void isValid_evenLengthAndNotPair2_true() {

        assertFalse(problem0020.isValid("(]"));
    }

    @Test
    public void isValid_pairButReverse_true() {

        assertFalse(problem0020.isValid("}{"));
    }

    @Test
    public void isValid_evenLengthAndDoublePairNext_true() {

        assertTrue(problem0020.isValid("()[]"));
        assertTrue(problem0020.isValid("[]{}"));
        assertTrue(problem0020.isValid("{}()"));
    }

    @Test
    public void isValid_evenLengthAndDoublePairNest_true() {

        assertTrue(problem0020.isValid("([])"));
        assertTrue(problem0020.isValid("[]{()}"));
        assertTrue(problem0020.isValid("[{}()]"));
    }

    @Test
    public void isValid_wtf_true() {

        assertTrue(problem0020.isValid("(([]){})"));
    }
}