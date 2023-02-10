class Solution {
    public int missingNumber(int[] nums) {
        // Since are arrays are suppose to hold from 0 t0 n - 1 length
        // If there is ever a mismatch then return 
        Arrays.sort(nums); 
        int length = nums.length; 
        for(int i = 0; i < length; i++) {
            if(nums[i] != i)
                return i; 
        }

        // If we have went through the array and didn't find anything then return the length'
        return length; 
    }
}
