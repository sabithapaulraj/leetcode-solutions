// Last updated: 9/8/2025, 3:45:10 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // no of rows
        int n = matrix[0].length; // no of columns
        if (matrix == null || m == 0 || n == 0){ //base case
            return false;
        }
        int left = 0;
        int right = m * n - 1;
        while(left <= right){ //two - pointer approach
            int mid = left + (right - left) / 2;
            int row = mid / n; // row of mid
            int column = mid % n; // column of mid
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