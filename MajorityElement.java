class Solution {
    public int majorityElement(int[] nums) {
        // If I want to solve this question for me it is a tradeoff between time complexity in sorting the arrau first and space complexity
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans = nums.length / 2; 
        for(int i: nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for(int j: nums) {
            if(freq.get(j) >  ans)
                return j;
        }

        return 0;
    }
}
