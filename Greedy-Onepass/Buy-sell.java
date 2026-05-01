//Problem: Best Time to Buy and Sell Stock
//Approach: One Pass
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];

        for(int i=1; i<prices.length;i++){
            if(prices[i] > bestBuy){
                maxProfit = Math.max(maxProfit,prices[i]- bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
          
            
        }
        return maxProfit;
    }
}

//Problem: Best Time to Buy and Sell Stock
//Approach: Brute Force
//Time Complexity: O(n^2)
//Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j] > prices[i]){
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }
}