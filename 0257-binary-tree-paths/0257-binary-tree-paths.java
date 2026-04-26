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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        // Using a list to track the current path
        if(root == null) return result;
        helper(root, "", result);
        return result;
    }
    private static void helper(TreeNode root, String path, List<String> result){
        if(root == null) return;
        // Add the current node to our path string
        path += root.val;
        // Check if it's a leaf node
        if(root.left == null && root.right == null){
            result.add(path);
            return;
        }
        // Otherwise, continue exploring left and right
        helper(root.left, path + "->", result);
        helper(root.right, path + "->", result);
    }
}