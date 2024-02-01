class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for(String s: strs) {
            String anagram = sortString(s);
            // If the sorted string isn't seen in the hashmap then allocate space
            // and add the original string to the arraylist 
            if(!groups.containsKey(anagram)) {
                groups.put(anagram, new ArrayList<String>());
                groups.get(anagram).add(s);
            }
            else 
            {
                groups.get(anagram).add(s);
            }
        }
        // Add all of the values seen throughout the hashmap into the list of arraylist
        List<List<String>> ans = new ArrayList<>(groups.values());

        return ans;
    }

    // helper function used to sort string to find anagram patters
    public String sortString (String s) {
        char [] alphas= s.toCharArray();
        Arrays.sort(alphas);
        String t = new String(alphas);
        return t; 
    }
}
