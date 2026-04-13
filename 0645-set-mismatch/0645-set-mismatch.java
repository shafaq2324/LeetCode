class Solution {
    public int[] findErrorNums(int[] nums) {
        // set the duplicates as negative and find missing using positive marking
        int ans[] = new int[2];
        int missing = -1;
        int duplicate = -1;
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            if(nums[val - 1] < 0){
                duplicate = val;  // same number on another index
            }
            else{
                nums[val - 1] *= -1; 
            }
        }
        ans[0] = duplicate;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) missing = i + 1;
        }
        ans[1] = missing;
        return ans;
    }
}