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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root!=null) stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            res.addFirst(node.val);
            if(node.left!=null) stack.push(node.left);
            if(node.right!=null) stack.push(node.right);
        }
        return res;
    }
}

//Recursive Approach
class Solution {
    LinkedList<Integer> res=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return res;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        res.add(root.val);
        return res;
    }
}
