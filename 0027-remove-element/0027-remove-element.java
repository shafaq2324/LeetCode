class Solution {
    public int removeElement(int[] nums, int val) {
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == val){
                break;
            }
        }
        for(int j = i + 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
        }
        return i;
    }
}