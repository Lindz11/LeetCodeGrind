class Solution {
    public int heightChecker(int[] heights) {
        int length = heights.length; 
        int [] exp = new int [length]; 
        int count = 0; 
        for(int i = 0; i < length; i++) {
            exp[i] = heights[i]; 
        }
        Arrays.sort(exp); 
        for(int j = 0; j < length; j++) {
            if(exp[j] != heights[j])
                count++;
        }
        return count; 
    }
}
