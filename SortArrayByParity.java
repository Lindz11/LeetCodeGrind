class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // This this ia 2 pointer problem
        // Solution: 0(n)
        int length = nums.length; 
        int [] ans = new int[length]; 
        int count = 0, temp = 0; 
        for(int i = 0; i < length; i++) {
            if(nums[i] % 2 == 0) {
                temp = nums[count]; 
                nums[count] = nums[i]; 
                nums[i] = temp; 
                count++;
            }
        }

        return nums; 
    }
}
