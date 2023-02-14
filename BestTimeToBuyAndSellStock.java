class Solution {
    public int maxProfit(int[] prices) {
        // Set the stock super high so it gets instanlty overriden
        int stock = Integer.MAX_VALUE; 
        int profit = 0; 
        for(int i: prices) {
            // Take a niave approach and always pic the smaller stock 
            stock = Math.min(stock, i);
            // If we pick the stock on the same day go to the next day 
            if(stock == i)
                continue;  
            // If not compare and save the biggest profit
            profit = Math.max(profit, i - stock); 
        }

        return profit; 
    }
}
