class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        int underscoreCount = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                lCount++;
            } else if (c == 'R') {
                rCount++;
            } else {
                underscoreCount++;
            }
        }
        // The furthest point is the gap between L and R plus all underscores
        return Math.abs(lCount - rCount) + underscoreCount;
    }
}