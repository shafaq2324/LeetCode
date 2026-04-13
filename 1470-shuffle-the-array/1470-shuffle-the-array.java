class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int k = 0;
        int ans[] = new int[nums.length];
        while(j < nums.length && k < nums.length){
            ans[k] = (k % 2 == 0)? nums[i++]: nums[j++];
            k++;
        }
        return ans;
    }
}