class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        back(nums, vis, new ArrayList<>());
        return result;
    }
    public void back(int[] nums, boolean[] vis, List<Integer> curr){
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        // try every element
        for(int i = 0; i < nums.length; i++){
            if(vis[i]) continue;
            vis[i] = true;
            curr.add(nums[i]);
            // explore
            back(nums, vis, curr);
            // backtrack
            curr.remove(curr.size() - 1);
            vis[i] = false;
        }
    }
}