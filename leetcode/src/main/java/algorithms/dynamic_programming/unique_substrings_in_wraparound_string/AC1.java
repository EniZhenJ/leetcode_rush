package algorithms.dynamic_programming.unique_substrings_in_wraparound_string;

import java.util.Arrays;

/**
 * @ClassName: AC1
 * @Description: 467. 环绕字符串中唯一的子字符串
 * @Author: 琦玉
 * @Date: 2022年05月25日 16:07:41
 */
public class AC1 {

    /**
     * 467. 环绕字符串中唯一的子字符串
     * 把字符串 s 看作是 “abcdefghijklmnopqrstuvwxyz” 的无限环绕字符串，所以 s 看起来是这样的：
     *
     * "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd...." .
     * 现在给定另一个字符串 p 。返回 s 中 唯一 的 p 的 非空子串 的数量 。
     *
     *
     *
     * 示例 1:
     *
     * 输入: p = "a"
     * 输出: 1
     * 解释: 字符串 s 中只有一个"a"子字符。
     * 示例 2:
     *
     * 输入: p = "cac"
     * 输出: 2
     * 解释: 字符串 s 中的字符串“cac”只有两个子串“a”、“c”。.
     * 示例 3:
     *
     * 输入: p = "zab"
     * 输出: 6
     * 解释: 在字符串 s 中有六个子串“z”、“a”、“b”、“za”、“ab”、“zab”。
     *
     *
     * 提示:
     *
     * 1 <= p.length <= 105
     * p 由小写英文字母构成
     */
    static class Solution {
        public static int findSubstringInWraproundString(String p) {
            int[] dp = new int[26];
            int k = 0;
            for (int i = 0; i < p.length(); i++) {
                // 字符之差为 1 或 -25
                if (i > 0 && (p.charAt(i) - p.charAt(i - 1) + 26) % 26 == 1) {
                    ++k;
                } else {
                    k = 1;
                }
                dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], k);
            }
            return Arrays.stream(dp).sum();
        }

        public static void main(String[] args) {
            System.out.println(findSubstringInWraproundString("zab"));
        }
    }
}
