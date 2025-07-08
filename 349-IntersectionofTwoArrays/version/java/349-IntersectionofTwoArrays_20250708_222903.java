// Last updated: 7/8/2025, 10:29:03 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        
        Arrays.sort(nums1);
        Set<Integer> resultSet = new HashSet<>();
        
        for (int num : nums2) {
            if (binarySearch(nums1, num)) {
                resultSet.add(num);
            }
        }
        
        return resultSet.stream().mapToInt(i -> i).toArray();
    }
    
    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
}      
