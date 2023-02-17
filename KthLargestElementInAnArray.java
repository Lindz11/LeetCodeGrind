class Solution {
    // This is kind of a math problem in which if you just sort the array then then only need to subtract k to get the correct answer 
    // Solution 0(n)
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 
        int length = nums.length; 
        return nums[length - k]; 
    }
}
