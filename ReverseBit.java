public class Solution {
    int ans = 0, bit = 0, mask = 1; 
    public int reverseBits(int n) {
        for(int i = 0; i < 32; i++) { 
            // And the bit together to see if the bit is a 0 or 1
            bit = (n & mask); 
            // Shit the bit over to rightmost position available
            bit = bit << 32 - i - 1; 
            // Add the bit to the desired answer
            ans = ans + bit; 
            // Delete bit from the integer
            n = n >> 1; 
        }

        return ans; 
    }
}
