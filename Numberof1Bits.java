public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // Need to keep a consistent count 
        int count = 0, lastbit = 0; 
        for(int i = 0; i < 32; i++) {
            // compare the last bit in the given integer and & it with 1
            lastbit = n & 1; 
            // If the bit is 1 incremement the counter 
            if(lastbit == 1)
                count++; 
            // Shift our integer to the left by 1 so we don't go through the same bit twice
            n = n >> 1; 
        }

        return count; 
    }
}
