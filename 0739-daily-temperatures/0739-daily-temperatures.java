class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = temp.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = i - prev;
            }
            stack.push(i);
        }

        return ans;

    }
}