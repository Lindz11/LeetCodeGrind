class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Solve in 0(n) time and 0(n) memory
 
        List<Integer> common = new ArrayList<>(); 
        HashMap<Integer, Integer> N1 = new HashMap<>(); 

        // Use a hashmap to keep track of the frequency of the first array 
        for(int i: nums1) {
           N1.put(i, N1.getOrDefault(i, 0) + 1); 
        }

        // Go through the other array and see what the two arrays have in common
        for(int j : nums2) {
            if(N1.containsKey(j)) {
                common.add(j); 
                // Decrement the frequency everytime we see an element in the array 
                N1.put(j, N1.get(j) - 1); 
                // If frequency is less than or equal to 0 remove it from the map 
                if(N1.get(j) <= 0) {
                    N1.remove(j); 
                }
            }
        }

        // Make the answer array equal to the size of all the elements in our hashmap
        int [] ans = new int [common.size()]; 
        int count = 0; 
        // Cast each object as an int and increment the count 
        for(Object k: common) {
            ans[count] = (int)k; 
            count++; 
        }

        return ans; 
    }
}
