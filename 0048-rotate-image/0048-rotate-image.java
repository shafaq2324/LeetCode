class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int k = n - 1;
        for(int i=0; i < n >> 1; i++) {
            for(int j = i; j < k-i; j++) {
                // the j loop is to swap inner matrix
                int t = matrix[i][j]; // 0,0
                matrix[i][j] = matrix[k - j][i]; // 0,0 = 2,0
                matrix[k-j][i] = matrix[k-i][k-j]; // 2,0 = 2,2
                matrix[k-i][k-j] = matrix[j][k - i]; // 2,2 = 0,2
                matrix[j][k - i] = t; // 0,2 = 0,0
            }
        }
        
        
    }
}