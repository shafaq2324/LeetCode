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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // s1 acts as the processing stack for DFS
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        // s2 stores nodes in the reverse of postorder (Root -> Right -> Left)
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        if(root == null) return ans;
        s1.push(root);
        while(!s1.isEmpty()){
            // Traverse the tree and fill s2
            root = s1.pop();
            s2.add(root);
            // Push left then right to s1 so that Right is processed before Left
            // This results in Root -> Right -> Left order inside s2
            if(root.left != null) s1.push(root.left);
            if(root.right != null) s1.push(root.right);
        }
        while(!s2.isEmpty()){
            // Pop from s2 to get the final Postorder (Left -> Right -> Root)
            ans.add(s2.pop().val);
        }
        return ans;
    }
}