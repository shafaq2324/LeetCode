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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        // stack keeps track of most recent root
        List<Integer> pre = new ArrayList<>();
        // stores the pre order traversal
        if(root == null) return pre;
        // if root is null return empty list
        st.push(root);
        // push the current root in stack
        while(!st.isEmpty()){
            root = st.pop();
            // pop the most recent root every time
            pre.add(root.val);
            // add the root's value to pre
            if(root.right != null) st.push(root.right);
            // add the right first into the stack as it follows LIFO, check for null 
            if(root.left != null) st.push(root.left);
            // add root's left to stack if it exists
        }
        return pre;
    }
    
}
