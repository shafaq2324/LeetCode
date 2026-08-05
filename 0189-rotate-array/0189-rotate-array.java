class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // ensures that value of k is less than length of the array
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}