# Last updated: 6/17/2025, 10:27:51 PM
class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        buy1 = buy2 = float('-inf')
        sell1 = sell2 = 0

        for price in prices:
            buy1 = max(buy1, -price)           # Buy first stock
            sell1 = max(sell1, buy1 + price)   # Sell first stock
            buy2 = max(buy2, sell1 - price)    # Buy second stock
            sell2 = max(sell2, buy2 + price)   # Sell second stock

        return sell2
