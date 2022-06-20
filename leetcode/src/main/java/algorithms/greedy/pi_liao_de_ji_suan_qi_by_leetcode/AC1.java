package algorithms.greedy.pi_liao_de_ji_suan_qi_by_leetcode;

/**
 * @ClassName: AC1
 * @Description: 991. 坏了的计算器
 * @Author: 琦玉
 * @Date: 2022年06月20日 14:35:05
 */
public class AC1 {

    /**
     * 991. 坏了的计算器
     * 在显示着数字 startValue 的坏计算器上，我们可以执行以下两种操作：
     *
     * 双倍（Double）：将显示屏上的数字乘 2；
     * 递减（Decrement）：将显示屏上的数字减 1 。
     * 给定两个整数 startValue 和 target 。返回显示数字 target 所需的最小操作数。
     *
     *
     *
     * 示例 1：
     *
     * 输入：startValue = 2, target = 3
     * 输出：2
     * 解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.
     * 示例 2：
     *
     * 输入：startValue = 5, target = 8
     * 输出：2
     * 解释：先递减，再双倍 {5 -> 4 -> 8}.
     * 示例 3：
     *
     * 输入：startValue = 3, target = 10
     * 输出：3
     * 解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}.
     *
     *
     * 提示：
     *
     * 1 <= x, y <= 10^9
     */
    static class Solution {
        public static int brokenCalc(int startValue, int target) {
            int ans = 0;
            while (target > startValue) {
                ans++;
                if ((target & 1) == 0) {
                    target /= 2;
                } else {
                    target++;
                }
            }
            return ans + startValue - target;
        }

        public static void main(String[] args) {
            System.out.println(brokenCalc(3,100));
        }
    }
}
