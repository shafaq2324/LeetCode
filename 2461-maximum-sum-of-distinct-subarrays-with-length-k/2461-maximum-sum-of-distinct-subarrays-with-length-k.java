class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long currsum = 0;
        long maxsum = 0;
        HashSet<Integer> elements = new HashSet<>();
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            // skip all duplicates first
            while(elements.contains(nums[right])){
                elements.remove(nums[left]);
                currsum -= nums[left];
                left++;
            }

            //normally add to hashset
            elements.add(nums[right]);
            currsum += nums[right];

            // window limit exceeded then remove from beginning
            if(right - left + 1 > k){
                elements.remove(nums[left]);
                currsum -= nums[left];
                left++;
            }

            // if exact size of k then calculate maxsum
            if(right - left + 1 == k){
                maxsum = Math.max(currsum, maxsum);
            }
        }
        return maxsum;
    }
}