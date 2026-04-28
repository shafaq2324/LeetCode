class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0; // slow pointer
        for(int j=1; j<nums.length;j++){ // fast pointer
            if(nums[i]!=nums[j]){
                i++; // increment only for unique elements
                nums[i]=nums[j];
            }
        }
        return i+1; // unique elements (index) + 1
    }
}