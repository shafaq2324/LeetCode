class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total_sum = 0;
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for(int i:nums) {
            cur = Math.max(cur+i,i);
            max = Math.max(max,cur);
            total_sum += i;
        }
        cur = 0;
        int min = Integer.MAX_VALUE;
        for(int i:nums) {
            cur = Math.min(cur+i,i);
            min = Math.min(min,cur);
        }
        if(total_sum==min){
            return max;
        }
        return Math.max(max,(total_sum-min));
        
    }
}