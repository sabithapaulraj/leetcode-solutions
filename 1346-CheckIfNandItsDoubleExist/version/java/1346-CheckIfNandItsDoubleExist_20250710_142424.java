// Last updated: 7/10/2025, 2:24:24 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j]*2 || arr[j] == arr[i]*2)){
                    return true;
                }
            }
        }
        return false;
        
    }
}