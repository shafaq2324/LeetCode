class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int i = 0;
        for(; i < nums.length; i++){
            ans[i] = nums[i];
        }
        for(int j = 0; j < nums.length; j++){
            ans[i] = nums[j];
            i++;
        }
        return ans;
    }
}