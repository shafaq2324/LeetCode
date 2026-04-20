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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sorted = new ArrayList<>();
        In(root, sorted);
        return sorted.get(k - 1);
    }
    private void In(TreeNode root, List<Integer> ans){
        if(root == null) return;
        In(root.left, ans);
        ans.add(root.val);
        In(root.right, ans);
    }
}