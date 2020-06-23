package org.codelogger.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem0014Test {

    private Problem0014 problem0014 = new Problem0014();

    @Test
    public void longestCommonPrefix_hasCommonPrefix_returnLongestCommonPrefix() {

        String[] args = new String[]{"flower","flow","flight"};
        String longestCommonPrefix = problem0014.longestCommonPrefix(args);
        assertEquals("fl", longestCommonPrefix);
    }

    @Test
    public void longestCommonPrefix_noneCommonPrefix_emptyString() {

        String[] args = new String[]{"flower","low","flight"};
        String longestCommonPrefix = problem0014.longestCommonPrefix(args);
        assertEquals("", longestCommonPrefix);
    }

    @Test
    public void longestCommonPrefix_null_emptyString() {

        String[] args = new String[]{"flower","low","flight"};
        String longestCommonPrefix = problem0014.longestCommonPrefix(args);
        assertEquals("", longestCommonPrefix);
    }

    @Test
    public void longestCommonPrefix_emptyString_emptyString() {

        String[] args = new String[0];
        String longestCommonPrefix = problem0014.longestCommonPrefix(args);
        assertEquals("", longestCommonPrefix);
    }
}