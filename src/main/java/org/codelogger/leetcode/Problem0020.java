package org.codelogger.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem0020 {

    public boolean isValid(String s) {

        if(s == null || s.length() == 0){
            return true;
        }
        if(s.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> supportedPair = new HashMap<>(3);
        supportedPair.put(')','(');
        supportedPair.put(']','[');
        supportedPair.put('}','{');

        Stack<Character> pairStark = new Stack<>();
        for (char c : s.toCharArray()) {
            if(pairStark.isEmpty()){
                if(supportedPair.containsKey(c)){
                    return false;
                } else {
                    pairStark.push(c);
                }
            } else if(supportedPair.containsKey(c)){
                if(pairStark.peek().equals(supportedPair.get(c))){
                    pairStark.pop();
                } else {
                    return false;
                }
            } else {
                pairStark.push(c);
            }
        }

        return pairStark.isEmpty();
    }

}
