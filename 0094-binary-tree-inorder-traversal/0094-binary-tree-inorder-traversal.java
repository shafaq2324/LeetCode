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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        // stores in order traversal
        Stack<TreeNode> st = new Stack<TreeNode>();
        // stack to store the left root right order 
        // the loop goes till extreme left of the tree then pop till it reaches the root then goes to the right sub tree
        if(root == null) return in;
        // if root is null return empty list
        TreeNode node = root;
        // store root temporarily
        while(true){
            if(node != null){
                // if left is still being found push the node and find more left nodes
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()) break;
                // break if node is null and stack is empty
                node = st.pop();
                in.add(node.val);
                node = node.right;
                //pop the last added element and explore its right sub tree
            }
        }
        return in;
    }
    
}