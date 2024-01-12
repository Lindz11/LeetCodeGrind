class Solution {
    public int removeElement(int[] nums, int val) {
        int place = 0, length = nums.length; 
        for(int i = 0; i < length; i++) {
            if(nums[i] != val) {
                nums[place] = nums[i];
                place++;
            }
        }

        return place;
    }
}
