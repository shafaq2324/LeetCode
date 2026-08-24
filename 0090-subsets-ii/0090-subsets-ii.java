class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // start with index 0 and empty current list
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    public void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            // save when you have reached the end of the recursion tree i.e. index = length of nums
            return;
        }

        // include element
        current.add(nums[index]);
        // go further down the tree
        generateSubsets(index + 1, nums, current, result);
        // when you come back now explore the exclude side so remove the element 
        current.remove(current.size() - 1);

        int next = index + 1;
        while(next < nums.length && nums[index] == nums[next]){
            next++;
        }
        // exclude: update index so that the added one is skipped
        generateSubsets(next, nums, current, result);
    }
}