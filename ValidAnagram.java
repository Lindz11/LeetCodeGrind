class Solution {
    public boolean isAnagram(String s, String t) {
        // Since it is all lowercase we can convert them to ints with minues 'a'
        int [] alpha = new int[26]; 
        int length = s.length(); 
        for(char c: s.toCharArray()) {
            alpha[c - 'a']++;  
        }
        // Decrease everytime we see a character
        for(char c: t.toCharArray()) {
            alpha[c - 'a']--; 
        }

        // If it is a valid anagram then we know that all the array index's should be 0 
        for(int i: alpha) {
            if(i != 0)
            return false;
        }
        return true; 
    }
}
