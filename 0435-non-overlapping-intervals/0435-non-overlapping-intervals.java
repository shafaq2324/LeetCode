class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <= 1 || intervals == null) return 0;
        Arrays.sort(intervals, (a,b)-> a[1]- b[1]);
        int prev = intervals[0][1];
        int ans = 0;
        // end of previous interval
        for(int i = 1; i < intervals.length; i++){
            if(prev > intervals[i][0]){
                ans++;
                // if current interval starts before prev then there is an overlap and keep the one with shorter ending
            }
            else{
                prev = intervals[i][1];
                // if current interval starts after prev then it is fine
            }
        }
        return ans;
    }
}