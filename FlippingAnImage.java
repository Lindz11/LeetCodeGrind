class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Took me more than 10 minutes to get the flipping algorithm
        // Made sure to do it all in one pass instead of 2 seperate nested loops
        // Solution: 0(n^2) 
        int length = image.length; 
        int [][] ans = new int[length][length]; 
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                ans[i][j] = image[i][length - 1 - j];
                if(ans[i][j] == 0)
                    ans[i][j] = 1; 
                else
                    ans[i][j] = 0; 
            }
        }  
        return ans; 
    }
}
