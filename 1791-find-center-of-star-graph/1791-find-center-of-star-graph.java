class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length+1;
        int[] in = new int[n+1];

        for(int[] e: edges){
            in[e[0]]++;
            in[e[1]]++;
            // for incoming as well as outgoing connection increment in[]
        }
        for(int i = 1; i <= n; i++){
            if(in[i] == n - 1){
                return i;
            }
        }

        return -1;
    }
}