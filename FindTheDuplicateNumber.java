class Solution {
    public int findDuplicate(int[] nums) {
        // Just a uniqueness quesiton where you can solve by sorting the array
        // Or using a hashmap and brute force adding everything to the array
        HashSet<Integer> hSet = new HashSet<>(); 
        for(int num: nums) {
            if(!hSet.add(num)) {
                return num; 
            }
        }

        return -1; 
    }
}
