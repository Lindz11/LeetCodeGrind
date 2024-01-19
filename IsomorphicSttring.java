class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Since the two string should in theory map to each other with no duplicates we should be able to use one 
        // hashmap and then test if the character is already contained in the map 
        HashMap<Character, Character> iso = new HashMap<>();
        HashSet<Character> ts = new HashSet<>();
        int length = s.length();
        for(int i = 0; i < length; i++) {
            char alpha = s.charAt(i);
            char reverse = t.charAt(i);
            if(iso.containsKey(alpha)) {
                if(iso.get(alpha) != reverse)
                    return false;
            }
            // If the hashmap doesn't contain the character from s but we have seen the t character before then 
            // it has to be false
            else if(!iso.containsKey(alpha) && ts.contains(reverse)) {
                return false;
            }
            // Otherwise we haven't seen either and just add it onto the hashmap
            else {
                iso.put(alpha,reverse);
                ts.add(reverse);
            }
        }

        return true;
    }
}
