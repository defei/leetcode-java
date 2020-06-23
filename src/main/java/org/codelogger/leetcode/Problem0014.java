package org.codelogger.leetcode;

import java.util.HashSet;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem0014 {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        for (int commonPrefixIndex = 0; commonPrefixIndex < strs[0].length(); commonPrefixIndex++) {
            char currentChar = strs[0].charAt(commonPrefixIndex);
            for (int i = 1; i < strs.length; i++) {
                String currentString = strs[i];
                if(currentString.length() <= commonPrefixIndex){
                    return currentString;
                }
                if(currentString.charAt(commonPrefixIndex) != currentChar){
                    return 0 == commonPrefixIndex ? "" : strs[0].substring(0, commonPrefixIndex);
                }
            }
        }
        return strs[0];
    }
}
