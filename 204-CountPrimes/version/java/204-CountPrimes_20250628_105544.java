// Last updated: 6/28/2025, 10:55:44 AM
class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        if(n == 3) return 1;

        //Initialize Boolean Array full of True
        boolean[] isPrime = new boolean[n];
        // Set all to true
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }

        // Traverse Again
        for(int i = 2; i * i < n; i++){ // Square i
            if(isPrime[i]){ // If true, in this case all are true
                for(int j = i * i; j < n; j+=i ) {// Skip i items at a time
                    isPrime[j] = false; // Set to false
            }
            }
        }

            // Count Prime Numbers 
            int count = 0;
            for(int i = 2; i<n; i++){
                if(isPrime[i]){
                    count++;
                }
            }
        return count;
    }
}