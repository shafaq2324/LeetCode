class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int maxlen = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 0){
                l = r + 1;
            }
            else{
                maxlen = Math.max(maxlen, r - l + 1);
            }
        }
        return maxlen;
    }
}