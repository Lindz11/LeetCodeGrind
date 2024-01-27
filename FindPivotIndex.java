class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length, lSum = 0, rSum = 0; 
        for(int i = 0; i < length; i++) {
            lSum = sumCalculator(0, i, nums);
            rSum = sumCalculator(i + 1, length, nums);
            if(lSum == rSum)
                return i;
        }

        return -1;

    }

    // Helper function to calculate the left and right sums based on the pivot number
    public int sumCalculator(int left, int right, int [] nums) {
        int sum = 0; 
        for(int z = left; z < right; z++) {
            sum+=nums[z];
        }

        return sum; 
    }
}
