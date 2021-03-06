package org.codelogger.leetcode;

/**
 * 整数反转
 *
 * ---
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem0007 {

    public int reverse(int x) {

        if(x / 10 == 0){
            return x;
        }
        int result = 0;
        int next = x;

        while (next != 0){
            int num = next % 10;
            next = next / 10;
            if(result == 0){
                result = num;
            } else {
                if(x > 0){
                    if (result > Integer.MAX_VALUE / 10) {
                        return 0;
                    }
                } else {
                    if (result < Integer.MIN_VALUE / 10) {
                        return 0;
                    }
                }
                result = result * 10 + num;
            }
        }
        return result;
    }
}
