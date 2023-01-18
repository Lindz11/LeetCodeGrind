class Solution {
    public int largestAltitude(int[] gain) {
        // Seems like a simple problem using Math.max
        int length = gain.length; 
        int max = 0, sum = 0; 
        for(int i = 0; i < length; i++) {
            sum+= gain[i];
            max = Math.max(max, sum); 
        }

        return max;
    }
}
