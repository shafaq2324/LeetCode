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
    private int max = Integer.MIN_VALUE;
    // to handle negative root trees
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        maxPath(root);
        return max;
    }
    private int maxPath(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0, maxPath(root.left));
        // comparing the maxPath with 0 helps ignoring negative values 
        int right = Math.max(0, maxPath(root.right));
        max = Math.max(max, root.val + left + right);

        // root can pick only left or right branch to continue
        return Math.max(left, right) + root.val;
    }
}