class Solution {
    public int[] plusOne(int[] digits) {
        // Need to traverse backwards and see if adding the one at the end has any impact on the other numbers  
        // The only times when we need to allocate extra space is when we are at 9, 99, 999, 999.. ect. 
        // Otherwise we can just return the number as long as we are adding 1 to a number less than 9
        int length = digits.length - 1; 
        for(int i = length; i >= 0; i--) {
            // If the number is less than 
            if(digits[i] < 9) {
                digits[i] += 1; 
                return digits; 
            }
            else
            {
                digits[i] = 0;
            }
        }
        int [] ans = new int [digits.length + 1]; 
        Arrays.fill(ans, 0); 
        ans[0] = 1; 

        return ans; 
    }
}
