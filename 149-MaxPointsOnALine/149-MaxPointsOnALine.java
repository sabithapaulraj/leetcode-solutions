// Last updated: 6/17/2025, 10:27:48 PM
public class Solution
{
    public int maxPoints(int[][] points)
    {
        int n = points.length;
        if (n == 1)
           return 1;
        int ans = 2;
        for(int i = 0; i < n ; i++)
        {
            Map <Double,Integer> cnt = new HashMap<>();
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    double slope = Math.atan2(points[j][1] - points[i][1], points[j][0] - points[i][0]);
                    cnt.merge(slope,1,Integer::sum);
                }
            }
            if(!cnt.isEmpty())
            {
                ans = Math.max(ans,Collections.max(cnt.values())+1);
            }
        }
        return ans;
    }
}