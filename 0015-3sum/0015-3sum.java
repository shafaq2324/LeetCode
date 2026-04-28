class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        // Sorting is crucial: it allows us to use two pointers and skip duplicates
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            // If the current element is the same as the previous, skip it to avoid duplicate triplets
            int l = i + 1;
            int r = nums.length - 1;
            // initialize 2 pointers and current element's complement will be the target to make 0
            int target = -nums[i];
            while(l < r){
                if(nums[l] + nums[r] < target) l++; // lesser than target
                else if(nums[l] + nums[r] > target) r--; // greater than target
                else{
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r])); // valid triplet
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]) l++;
                    while(l < r && nums[r] == nums[r + 1]) r--; 
                    // skip duplicates
                }
            } // apply 2 sum logic

        }
        return ans;
    }
}