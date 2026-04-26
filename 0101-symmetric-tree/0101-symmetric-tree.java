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
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
        // if root is null it is surely symmetric otherwise check via the helper function
    }
    private static boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null) return left == right;
        // if both the left and right are null then return true as they are equal
        // if either one of them is null then return false as they are not equal
        // writing it in this way skips an if condition
        if(left.val != right.val) return false;
        // check by value of left and right
        return helper(left.left, right.right) && helper(left.right, right.left);
                // outer pairs of mirror image       inner pairs of mirror image
    }
}