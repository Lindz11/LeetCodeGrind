class Solution {
    public int countKDifference(int[] nums, int k) {
        // Straight forward solution: 0(n^2)
        // Need to see if I can reduce the runtime to 0(n)
        // 0(n) solution might include hashmap
        int length = nums.length; 
        int count = 0; 
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(Math.abs(nums[i] - nums[j]) == k)
                    count++; 
            }
        }

        return count; 
    }
}
