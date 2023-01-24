class Solution {
    public int sumOfUnique(int[] nums) {
        // Question is easliy solvable with a map to keep frequency count
        // Runtime is 0(n) but the memory usage is 0(n^2)
        // Memory usage my be better by just using a frequency array 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int count = 0; 
        for(int i: nums) {
            if(!map.containsKey(i)) {
                map.put(i,1); 
            }
            else
            {
                map.put(i, map.get(i) + 1); 
            }
        }

        for(int i: nums) {
            if(map.get(i) == 1)
            count+=i; 
        }

        return count; 
    }
}
