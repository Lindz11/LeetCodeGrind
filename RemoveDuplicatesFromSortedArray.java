class Solution {
    public int removeDuplicates(int[] nums) {
        // Solution 0(2n) = 0(n)
        // Can use a hashmap to get all of the unqiue integers in the array 
        // Then override everything at the front of the array
        // return only the size of the set
        HashSet<Integer> hSet = new HashSet<>(); 
        int count = 0;
        for (int i : nums) {
            if(hSet.add(i) == true) {
                nums[count] = i; 
                count++;
            }
            
        }
        

        return hSet.size(); 
    }
}
