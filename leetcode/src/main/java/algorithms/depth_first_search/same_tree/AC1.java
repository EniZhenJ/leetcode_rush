package algorithms.depth_first_search.same_tree;

/**
 * @ClassName: AC1
 * @Description: 100. 相同的树
 * @Author: 琦玉
 * @Date: 2022年05月24日 15:37:21
 */
public class AC1 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 100. 相同的树
     * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     *
     *
     *
     * 示例 1：
     *
     *
     * 输入：p = [1,2,3], q = [1,2,3]
     * 输出：true
     * 示例 2：
     *
     *
     * 输入：p = [1,2], q = [1,null,2]
     * 输出：false
     * 示例 3：
     *
     *
     * 输入：p = [1,2,1], q = [1,1,2]
     * 输出：false
     *
     *
     * 提示：
     *
     * 两棵树上的节点数目都在范围 [0, 100] 内
     * -104 <= Node.val <= 104
     */
    static class Solution {
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null) {
                return q == null;
            }
            if (q == null) {
                return false;
            }
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}