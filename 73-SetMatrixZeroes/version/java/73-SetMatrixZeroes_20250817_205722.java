// Last updated: 8/17/2025, 8:57:22 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // First pass: mark with -1
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    markRow(matrix, i, n);
                    markColumn(matrix, j, m);
                }
            }
        }

        // Second pass: replace -1 with 0
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == -10){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markRow(int[][] matrix, int i, int n){
        for(int j = 0; j < n; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -10;
            }
        }
    }

    private void markColumn(int[][] matrix, int j, int m){
        for(int i = 0; i < m; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -10;
            }
        }
    }
}
