// Last updated: 6/30/2025, 10:36:38 PM
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        int maxPoints = 2;
        // Try every pair of points to form a line
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int count = 2; // Already have points i and j
                // Check how many other points lie on this line
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    // Check if point k is collinear with points i and j
                    // Using cross product to avoid division: (y2-y1)*(x3-x1) == (y3-y1)*(x2-x1)
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    
                    if ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)) {
                        count++;
                    }
                }
                maxPoints = Math.max(maxPoints, count);
            }
        }
        
        return maxPoints;
    }
}