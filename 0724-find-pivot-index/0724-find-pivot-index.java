class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0; // total sum
        int left = 0; // left sum
        for(int i: nums) total += i; // sum of all elements

        for(int i = 0; i < nums.length; i++){
            if(left == total - left - nums[i]) return i;
            // right = total - left
            left += nums[i]; // add current element in left sum
        }
        return -1; 
    }
}