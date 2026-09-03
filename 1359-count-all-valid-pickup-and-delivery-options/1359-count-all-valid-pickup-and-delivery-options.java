class Solution {
    long MOD = 1_000_000_000 + 7L;
    long dp[][];
    public int countOrders(int n) {
        dp = new long[n+1][n+1];

        for(int i=0;i<=n;i++)
            Arrays.fill(dp[i],-1);

        long res = helper(n,n);
        return (int)(res % MOD);
    }

    private long helper(int p,int d){
        if(p == 0 && d == 0)
            return 1L;
        
        if(dp[p][d] != -1)
            return dp[p][d];

        long takeP = 0L , takeD = 0L;

        if(p != 0)
            takeP = (p * helper(p-1,d))%MOD;
        
        if(d != 0 && d > p)
            takeD = ((d-p) * helper(p,d-1))%MOD;

        return dp[p][d] = (takeP + takeD)%MOD;
    }
}