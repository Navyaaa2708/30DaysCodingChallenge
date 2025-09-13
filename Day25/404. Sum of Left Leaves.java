/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int sum = 0;
        if (node.left != null && node.left.left == null && node.left.right == null) {
            sum += node.left.val;
        }
        sum += dfs(node.left);
        sum += dfs(node.right);
        return sum;
    }
}