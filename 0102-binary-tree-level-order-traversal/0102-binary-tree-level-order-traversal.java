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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>(); 
        // queue to track the most recent roots for easy insertion and deletion
        List<List<Integer>> wrap = new LinkedList<List<Integer>>();
        // list of lists to store elements level wise
        if(root == null) return wrap;
        // if root is null return empty wrap list
        q.offer(root);
        // initially add only the root in the queue
        while(!q.isEmpty()){
            //repeat till the queue is emptied
            int level = q.size();
            // level is decided according to queue size e.g. level 1 will have only 1 root and the loop will iterate for once 
            List<Integer> sub = new LinkedList<Integer>();
            // temporary variable to store children at each level
            for(int i = 0; i < level; i++){
                // iterate n times where n is level
                if(q.peek().left != null) q.offer(q.peek().left);
                // if the left of a root exists then add that root to queue
                if(q.peek().right != null) q.offer(q.peek().right);
                // if right of a root exists then add that root to queue
                sub.add(q.poll().val);
                // add the first added root value to sub list
            }
            wrap.add(sub);
            // add each sub list to wrap list
        }
        return wrap;
    }
}