class Solution {
    public int[] twoSum(int[] nums, int target) {
        // This problem is solvable in 0(n) time using a hashmap
        // May need to revist this question took more than 10 minutes got caught up ondebugging 
        // testcase 2 answer kept giving [0, 0]

        int [] ans = new int [2]; 
        int length = nums.length; 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < length; i++){
            map.put(nums[i], i);
        }


        for(int j = 0; j < length; j++){
            int sol = target - nums[j]; 
            if(map.containsKey(sol) && map.get(sol) != j){
                ans[0] = j; 
                ans[1] = map.get(sol); 
                return ans; 
            }
        }

        return ans; 

    }
}
