/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Start from the root and traverse down
        while (root != null) {
            // Case 1: Both nodes are in the right subtree
            if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } 
            // Case 2: Both nodes are in the left subtree
            else if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } 
            // Case 3: We found the split point or one of the nodes
            else {
                return root;
            }
        }
        return null;
    }
}