class Solution {
    public int numIdenticalPairs(int[] nums) {
        // Can I solve this in 0(n) time? 
        // I don't think so since "good pairs don't have to be next to each other
        int length = nums.length; 
        int count = 0; 
        for(int i = 0; i < length ; i++) {
            for(int j = i + 1; j < length; j++) {
                if(nums[i] ==  nums[j] && i < j)
                    count++; 
            }
        }

        return count;
    }
}
