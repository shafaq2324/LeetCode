class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> check = new HashMap<>();
        for(int num: nums){
            int more = k - num;
            if(check.getOrDefault(more, 0) > 0){
                count++;
                check.put(more, check.get(more) - 1);
            }
            else{
                check.put(num, check.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}