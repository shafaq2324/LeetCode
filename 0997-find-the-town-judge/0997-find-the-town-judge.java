class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] out = new int[n+1];

        for(int i = 0; i < trust.length; i++){
            out[trust[i][0]]++;
            in[trust[i][1]]++;
        }
        for(int i = 1; i <= n; i++){
            if(in[i] == n - 1 && out[i] == 0){
                return i;
                // in = n - 1 as the town judge is trusted by all except himself
                // out = 0 as the town judge trusts no one
            }
        }

        return -1;
    }
}