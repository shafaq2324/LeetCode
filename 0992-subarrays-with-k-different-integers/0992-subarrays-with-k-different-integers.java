class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public int atMost(int[] nums, int k){
        int left = 0;
        int count = 0; 
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            mpp.put(nums[right], mpp.getOrDefault(nums[right], 0) + 1);
            while(mpp.size() > k){
                mpp.put(nums[left], mpp.get(nums[left]) - 1);
                if(mpp.get(nums[left]) == 0) mpp.remove(nums[left]);
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}