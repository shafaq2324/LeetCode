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
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int more = target - nums[i];
            if(mpp.containsKey(more)){
                return new int[] {i, mpp.get(more)};
            }
            mpp.put(nums[i], i);
        }
        return new int[] {};
        
    }
}