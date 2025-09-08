// Last updated: 9/8/2025, 11:33:42 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (matrix == null || m == 0 || n == 0){
            return false;
        }
        int left = 0;
        int right = m * n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid / n;
            int column = mid % n;
            if(matrix[row][column] == target){
                return true;
            }
            if(matrix[row][column] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
        
    }
}