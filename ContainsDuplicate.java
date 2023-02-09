class Solution {
    public boolean containsDuplicate(int[] nums) {
        // You can solve this by creating a hashset or sorting the array 
        // Create a hashset 
        HashSet<Integer> hSet = new HashSet<>(); 
        // If we can't add it into the hashset it is not unique return false
        for(int i: nums) {
            if(!hSet.add(i))
                return true;
        }
        return false; 
    }
}
