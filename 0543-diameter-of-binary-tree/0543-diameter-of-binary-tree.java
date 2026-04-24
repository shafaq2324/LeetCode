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
    static int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        height(root);
        return max; // diameter = max(leftHeight) + max(rightHeight)
    }
    private static int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(max, left + right); // update max according to left + right
        return Math.max(left, right)+1; // calculate height simply
        
    }
}