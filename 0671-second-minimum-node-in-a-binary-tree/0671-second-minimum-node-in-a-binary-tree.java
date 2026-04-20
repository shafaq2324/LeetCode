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
    private int secMin = -1;

    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        secondMin(root, min);
        return secMin;
    }

    private void secondMin(TreeNode root, int currMin) {
        if (root == null)
            return;
        secondMin(root.left, currMin);
        secondMin(root.right, currMin);
        if (root.val > currMin) {
            if (secMin == -1) {
                secMin = root.val;
            } else {
                secMin = Math.min(secMin, root.val);
            }
        }
    }
}