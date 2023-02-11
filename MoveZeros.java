class Solution {
    public void moveZeroes(int[] nums) {
        // Solution 0(n)
        int count = 0; 
        int length = nums.length;
        // Everytime we see a number that isn't zero move it towards the front 
        for(int i: nums) {
            if(i != 0) {
                nums[count] = i; 
                count++;
            }
        }

        // Loop through the rest and override the numebr so that it is a zero 
        for(int j = count; j < length; j++) {
            nums[j] = 0; 
        }
        return; 
    }
}
