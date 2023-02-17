class Solution {
    // This was used for reference for the hashmap
    // https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-make-multiple-values-per-key-in-a-Java-map-possible
    public List<List<String>> groupAnagrams(String[] strs) { 
        // Need to map each of the sorted strings into an arraylsit hold their string
        Map<String, ArrayList<String>> freq = new HashMap<>(); 

        for(String s: strs) {
            // First convert the string to a character array so that we can sort it 
            char [] curr = s.toCharArray(); 
            Arrays.sort(curr); 
            String sorted = new String(curr);

            // If we have already seen the sorted string then just add it onto the hashmap 
            if(freq.containsKey(sorted)) {
                freq.get(sorted).add(s); 
            }
            // Else initialize an arraylsit and add the current string into the arraylist
            else
            {
                freq.put(sorted, new ArrayList<>()); 
                freq.get(sorted).add(s); 
            }
        }
        // Create the wanted return value and add all of the values that we have seen into the arraylist 
        List<List<String>> ans = new ArrayList<>(freq.values());
        return ans; 

    }
}
