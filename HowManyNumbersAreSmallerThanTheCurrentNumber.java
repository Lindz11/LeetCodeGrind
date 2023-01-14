class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Simple array problem 
        // Original solution 0(n^2)
        int [] ans = new int [nums.length]; 
        int length = nums.length; 
        for(int i = 0; i < length; i++) {
            int count = 0; 
            for(int j = 0; j < length; j++) {
                if(nums[i] > nums[j])
                    count++;
            }
            ans[i] = count; 
        }

        return ans;
    }
}
