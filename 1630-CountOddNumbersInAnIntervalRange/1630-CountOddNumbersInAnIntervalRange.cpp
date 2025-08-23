// Last updated: 8/23/2025, 6:49:46 PM
class Solution {
public:
    int countOdds(int low, int high) {
        int cnt = 0;
        for(int i = low; i<=high; i++){
            if(i%2 != 0){
                cnt+=1;
            }
        }
        return cnt;
    }
};