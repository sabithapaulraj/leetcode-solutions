// Last updated: 9/2/2025, 8:14:51 PM
class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0; // base case: f(1, k) = 0
        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // convert 0-indexed to 1-indexed
    }
}
