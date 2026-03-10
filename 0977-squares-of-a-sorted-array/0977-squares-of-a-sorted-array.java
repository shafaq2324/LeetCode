class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int st = 0;
        int end = nums.length - 1;
        int ptr = end;
        while(st <= end){
            int ss = nums[st] * nums[st];
            int es = nums[end] * nums[end];
            if(ss > es){
                ans[ptr] = ss;
                st++;
            }else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}