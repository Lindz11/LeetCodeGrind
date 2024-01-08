class Solution {
    public boolean isAnagram(String s, String t) {
        int [] alpha = new int[26];
        if(s.length() != t.length())
            return false; 
        int length = s.length();
        // Since they are the same length loop through the string
        //  and add for string s and subtract for string t
        for(int i = 0; i < length; i++) {
            char c = s.charAt(i);
            char z = t.charAt(i);
            alpha[c - 'a']++;
            alpha[z - 'a']--;
        }

        // If it is a true anagram then the frequency 
        // after looping through the string should be 
        // 0 at every character
        for(int i = 0; i < 26; i++) {
            if(alpha[i] != 0)
                return false;
        }

        return true;
    }
}
