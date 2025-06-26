// Last updated: 6/26/2025, 11:21:11 PM
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        // Create array to mark non-prime numbers
        // isPrime[i] = true means i is prime
        boolean[] isPrime = new boolean[n];
        
        // Initially assume all numbers are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}