class Solution {
    public int maximumWealth(int[][] accounts) {
        // This is a common 2d array problem 
        // Only asks for the max and not the individual
        int max = 0; 
        int row = accounts.length; 
        int col = accounts[0].length; 
        for(int i = 0; i < row; i++) {
            int customer_wealth = 0; 
            for(int j = 0; j < col; j++) {
                customer_wealth += accounts[i][j]; 
                if(max < customer_wealth)
                    max = customer_wealth; 
            }
        }

        return max; 
        
    }
}
