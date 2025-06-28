// Last updated: 6/28/2025, 10:39:46 AM
class Solution{
    public int countPrimes(int n) {
    if (n <= 2) return 0;
    if (n == 3) return 1;  // Small optimization
    
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, 2, n, true);  // Cleaner initialization
    
    for (int i = 2; i * i < n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime[i]) count++;
    }
    return count;
}
}