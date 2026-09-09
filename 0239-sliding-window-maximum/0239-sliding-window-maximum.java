class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1) return nums;
        int res[] = new int[nums.length - k + 1];
        int idx = 0;
        int maxx = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            maxx = maxx < nums[i]? nums[i]: maxx;
        }
        res[idx++] = maxx; // maximum of first window
        for(int i = 1; i <= nums.length - k; i++){
            // check if incoming element is greater than maxx
            if(nums[i + k - 1] > maxx){
                maxx = nums[i + k - 1];
                res[idx++] = maxx;
                continue;
            }
            // maxx is on the left boundary of the window
            if(nums[i] == maxx){
                res[idx++] = maxx;
                continue;
            }
            // maxx has left the window, recalculate it
            if(nums[i-1] == maxx){
                maxx = Integer.MIN_VALUE;
                for(int j = 0; j < k; j++){ // works k times
                    maxx = maxx < nums[i+j]? nums[i+j]: maxx;
                }
                res[idx++] = maxx;
            }
            else{
                res[idx++] = maxx;
            }
        }

        return res;
        
    }
}