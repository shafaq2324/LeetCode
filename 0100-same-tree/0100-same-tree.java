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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return (p == q);
        // null cases handled explicitly, if only one of them becomes null then it can lead to null pointer exception

        return (p.val == q.val) && // same value
        isSameTree(p.left, q.left) && // same left subtree
        isSameTree(p.right, q.right); // same right subtree
    }
}