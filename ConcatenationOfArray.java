class Solution {
    public int[] getConcatenation(int[] nums) {
        // The runtime should be 0 (n/2), n is the length of the 
        // new array since we iterate through each half separately 
        int [] ans = new int[2 * nums.length];
        int length = nums.length; 
        for(int i = 0; i < length; i++) {
            ans[i] = nums[i];
        }

        for(int j = length; j < ans.length; j++) {
            ans[j] = nums[j - length]; 
        }

        return ans;
    }
}
