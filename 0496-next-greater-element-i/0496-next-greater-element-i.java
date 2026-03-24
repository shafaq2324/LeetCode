class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ng = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num: nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                ng.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0; i < ans.length; i++){
            ans[i] = ng.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}