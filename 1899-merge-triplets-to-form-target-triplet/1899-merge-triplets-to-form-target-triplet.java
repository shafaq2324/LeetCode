class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean m1 = false;
        boolean m2 = false;
        boolean m3 = false;
        for(int[] t: triplets){
            if(t[0] <= target[0] && t[1] <= target[1] && t[2] <= target[2]){
                if(t[0] == target[0]) m1 = true;
                if(t[1] == target[1]) m2 = true;
                if(t[2] == target[2]) m3 = true;
            }
        }
        return m1 && m2 && m3;
    }
}