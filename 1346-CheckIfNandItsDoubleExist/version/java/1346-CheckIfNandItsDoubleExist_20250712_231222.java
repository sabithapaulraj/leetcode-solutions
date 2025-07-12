// Last updated: 7/12/2025, 11:12:22 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i] * 2;
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                if (arr[left] == target && left != i) {
                    return true;
                }
                if (arr[right] == target && right != i) {
                    return true;
                }
                
                if (arr[left] < target) {
                    left++;
                } else if (arr[right] > target) {
                    right--;
                } else {
                    break;
                }
            }
        }
        return false;
        
    }
}