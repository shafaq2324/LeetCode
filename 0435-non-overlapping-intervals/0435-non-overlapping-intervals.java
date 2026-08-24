class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <= 1 || intervals == null) return 0;
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        int prev = intervals[0][1];
        int ans = 0;
        // end of previous interval
        for(int i = 1; i < intervals.length; i++){
            if(prev > intervals[i][0]){
                // if the ending of previous ending is already covered in the beginning of new interval then remove the current interval
                ans++;
                prev = Math.min(prev, intervals[i][1]);
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