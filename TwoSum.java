class Solution {
    public int[] twoSum(int[] nums, int target) {
        // From the test cases wer can see that we can assume that the given array is sorted so
        // and we also need to make sure that the numbers we test either add up to the tartget or 
        // subtract to an integer we know is in the array
        int [] ans = new int [2];
        HashMap<Integer, Integer> indices = new HashMap<>(); 
        int length = nums.length; 
        for(int i = 0; i < length; i++) {
            indices.put(nums[i], i);
        }

        for(int j = 0; j < length; j++) {
            int second = target - nums[j];
            if(indices.containsKey(second) && j != indices.get(second)) {
                ans[0] = j;
                ans[1] = indices.get(second);
                return ans;
            }
        }

        return ans; 
    }
}
