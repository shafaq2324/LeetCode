class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        
        // HashMap to store: <PrefixSum, Frequency>
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        
        // Base case: A prefix sum of 0 has occurred 1 time (before we even start)
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
            // Update the running cumulative sum
            currSum += num;
            
            // Check if there is a prefix sum that we can subtract to get k
            if (prefixSumMap.containsKey(currSum - k)) {
                count += prefixSumMap.get(currSum - k);
            }
            
            // Add/update the current prefix sum in the map
            prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);
        }
        
        return count;
    }
}