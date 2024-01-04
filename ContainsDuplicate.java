class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
            1. From the question you see that it is a uniqueness problem which means it might be solveable with hashsets
            2. Looking to see if a number is already contained in the set before adding it to the set is better memory allocation
        */
        HashSet<Integer> hSet = new HashSet(); 
        for(int i: nums) {
            if(hSet.contains(i) == true)
                return true; 
            else
                hSet.add(i);
        }

        return false;
    }
}
