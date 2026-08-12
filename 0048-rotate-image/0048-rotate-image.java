class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int b[][] = new int[n][n];
        int size = n - 1;
        for(int i=0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                b[j][size-i] = matrix[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = b[i][j];
            }
        }
        
    }
}