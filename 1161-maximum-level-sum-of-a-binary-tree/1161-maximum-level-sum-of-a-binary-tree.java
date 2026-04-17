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
    public int maxLevelSum(TreeNode root) {
        List<Integer> sum = new ArrayList<>();
        calc(root, 0, sum);

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < sum.size(); i++){
            if(sum.get(i) > max){
                max = sum.get(i);
                ans = i + 1;
            }
        }
        return ans;
    }
    private static void calc(TreeNode root, int level, List<Integer> sum){
        if(root == null) return;
        if(sum.size() == level) sum.add(root.val);
        else{
            sum.set(level, sum.get(level) + root.val);
        }
        calc(root.left, level + 1, sum);
        calc(root.right, level + 1, sum);
    }
}