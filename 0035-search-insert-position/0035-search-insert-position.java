class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length - 1;
        // binary search used to find appropriate insert position if mid not found then return the lb so that the element can be inserted after it
        while(lb <= ub){
            int mid = lb+(ub-lb)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                ub = mid - 1;
            }
            else{
                lb = mid + 1;
            }
        }
        return lb;
    }
}