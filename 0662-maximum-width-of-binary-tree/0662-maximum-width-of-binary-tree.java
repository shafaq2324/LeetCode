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
class Pair{
    int num;
    TreeNode node;
    Pair(TreeNode _node, int _num){
        node = _node;
        num = _num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        if(root == null) return ans;
        // Queue stores a Pair of the node and its calculated index
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num; // index of first node in this level
            int first = 0, last = 0;
            for(int i = 0; i < size; i++){
                // prevents overflow
                int curr = q.peek().num - min;
                TreeNode node = q.peek().node;
                q.poll();
                // track relative first and last of a level
                if(i == 0) first = curr;
                if(i == size - 1) last = curr;
                if(node.left != null) q.offer(new Pair(node.left, curr*2 + 1)); 
                if(node.right != null) q.offer(new Pair(node.right, curr*2 + 2)); 
            }
            ans = Math.max(ans, last - first + 1);
        }

        return ans;
    }
}
// width = distance between first node and last node on a level therefore BFS used