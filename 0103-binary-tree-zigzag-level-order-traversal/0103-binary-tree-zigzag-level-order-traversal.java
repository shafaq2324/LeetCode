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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root); // initially the queue contains root

        boolean l2r = true; // taking a flag to determine direction of traversal

        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> row = new LinkedList<>();
            // temporary list to store element at each level
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(l2r){
                    row.addLast(node.val);
                    // if previous l2r value was true then for the current traversal the insertion should be reversed
                }else{
                    row.addFirst(node.val);
                }
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                // add left and right nodes if they exist into the queue
            }
            l2r = !l2r;
            // reverse the flag for next iteration each time
            res.add(row);
        }
        return res;

    }
}