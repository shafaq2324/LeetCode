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
        if(root == p || root == q || root == null) return root; 
        //if we find p or q we signal to parent that the target exists in this branch
        // if null reached then nothing to find
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // return only the non null subtree as the null one won't have the target
        if(left == null) return right;
        else if(right == null) return left;
        // if both are non null then the current root is the LCA
        return root;
    }
}
// using dfs as we are finding the deepest common node on paths to 2 given nodes