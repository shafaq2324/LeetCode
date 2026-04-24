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
        return check(root) != -1;
        // optimized code that only checks for failed binary trees which would return -1
    }
    private int check(TreeNode root){
        if(root == null) return 0;
        // if root is null it would contribute 0 to the height, also as it is balanced it would return 0 which is not equal to -1
        int lh = check(root.left);
        int rh = check(root.right);
        //recursive calls for left and right
        if(Math.abs(lh - rh) > 1) return -1;
        // check if their absolute difference is greater than one, if yes then it is a failed case
        if(lh == -1 || rh == -1) return -1; 
        // if either one of them becomes -1 no need to check further
        return Math.max(lh, rh) + 1;
        // else simple return height of the tree
    }
}