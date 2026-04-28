class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int ans[] = new int[2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return ans;
        // brute force - add all the possible combinations
        HashMap<Integer, Integer> mpp = new HashMap<>();
        // hashmap (number, more_needed)
        for(int i = 0; i < nums.length; i++){
            int more = target - nums[i];
            if(mpp.containsKey(more)){
                return new int[] {i, mpp.get(more)};
                // check if it contains the more as a key if yes then that more is present as an element in the array
            }
            mpp.put(nums[i], i);
            // if not just add it as another key
        }
        return new int[] {};
        
    }
}