class Solution {
    public int repeatedNTimes(int[] nums) {
        // The solution is 0(n) and the memory is 0(n)
        // My original answer used a hashmap, I didn't realize only one repeated number is in every array
        HashSet<Integer> freq = new HashSet<>(); 
        int length = nums.length / 2; 
        for(int i: nums) {
            if(freq.contains(i)) {
                return i;  
            }
            else
            {
               freq.add(i);  
            }
        }


        return 0; 
    }
