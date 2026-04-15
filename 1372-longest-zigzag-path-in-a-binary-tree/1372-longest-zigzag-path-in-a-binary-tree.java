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
    static int ans = 0;
    public int longestZigZag(TreeNode root) {
        ans = 0;
        if(root.left == null && root.right == null) return 0;
        fun(root.left, 1, false); // false for left
        fun(root.right, 1, true); // true for right
        return ans;
    }
    private static void fun(TreeNode root, int len, boolean l){
        if(root == null) return;
        ans = Math.max(ans, len);
        if(!l){
            // it was previously from the left direction
            fun(root.right, len + 1, true);
            fun(root.left, 1, false);
        }else{
            // it was previously from right direction
            fun(root.left, len + 1, false);
            fun(root.right, 1, true);
        }
    }
}