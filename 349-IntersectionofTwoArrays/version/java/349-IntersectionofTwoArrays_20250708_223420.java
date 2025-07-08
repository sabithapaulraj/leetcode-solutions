// Last updated: 7/8/2025, 10:34:20 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] visited = new boolean[nums2.length];
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !visited[j]) {
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == nums1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        temp[index++] = nums1[i];
                        visited[j] = true;
                    }
                    break;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
