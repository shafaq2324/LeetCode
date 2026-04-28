class Solution {
    public int removeElement(int[] nums, int val) {
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == val){
                break; // fix at first occurence of val
            }
        }
        for(int j = i + 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                // if different from target value swap and increment i every time
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
        }
        return i;
    }
}