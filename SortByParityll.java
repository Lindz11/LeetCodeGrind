class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // This I can solve this problem in 0(n) 
        // Creating a brand new array and using modular math 
        // to switch between even and odd 
        int length = nums.length; 
        int [] ans = new int [length];
        int oddC = 1, evenC = 0; 
        for(int i = 0; i < length; i++) {
            if(nums[i] % 2 == 0) {
                ans[evenC] = nums[i];
                evenC+=2; 
            }
            else
            {
                ans[oddC] = nums[i]; 
                oddC+=2;  
            }
        }
        return ans; 
    }
}
