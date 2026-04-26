/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *   TreeNode right;
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        BFS(root, 0, ans);
        return ans;
    }
    private static void BFS(TreeNode root, int level, List<Integer> ans){
        if(root == null) return;
        if(ans.size() == level) ans.add(root.val); //add the node value only if the level size = ans size, as that level is being explored for the first time
        BFS(root.right, level + 1, ans);
        // explore rightmost elements first
        BFS(root.left, level + 1, ans);
        // explore left if and only if there is no right node covering it 
    }
    // for left side view explore the left subtree first
}