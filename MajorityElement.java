class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array in non decreasing order 
        if(nums.length == 1)
            return nums[0]; 
        Arrays.sort(nums);
        // Find what your count has to beat and set the count equal to 1; 
        int major = nums.length / 2, length = nums.length, count = 1; 
        for(int i = 1; i < length; i++) { 
            // If we see two numbers are the same add to the count
            if(nums[i] == nums[i - 1]){
                count++; 
            }
            // If the count is greater than the majority then return 
            if(count > major)
                return nums[i]; 
            // If they are not the same reset the count to 1
            if(nums[i] != nums[i - 1])
                count = 1;
        }
        return 0; 
    }
}
