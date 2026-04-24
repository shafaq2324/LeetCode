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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lh = check(root.left);
        int rh = check(root.right);
        if(Math.abs(lh - rh) > 1) return false; 
        // if difference in height exceeds one then it is not balanced
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        // recursive calls for left and right
        if(!left || !right) return false;
        // if any one is false return false otherwise true
        return true;
    }
    private int check(TreeNode root){
        if(root == null) return 0;
        int lh = check(root.left);
        int rh = check(root.right);
        return Math.max(lh, rh) + 1;
    }
}