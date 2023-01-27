class Solution {
    public int singleNumber(int[] nums) {
        // Simple sorting and hashset algorithm
        // Solution : 0(n)
        HashSet<Integer> occ = new HashSet<>();   
        for(int i: nums) {
            if(occ.contains(i))
                occ.remove(i); 
            else
                occ.add(i); 
        }
        
        for(int j: occ){
            return j; 
        }

        return 0; 
    }
}
