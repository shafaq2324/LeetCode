class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int missing = -1;
        int duplicate = -1;
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            if(nums[val - 1] < 0){
                duplicate = val;  // same number on another index
            }
            else{
                nums[val - 1] *= -1; 
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                missing = i + 1;
                ans.add(missing);
            }
        }
        return ans;
    }
}