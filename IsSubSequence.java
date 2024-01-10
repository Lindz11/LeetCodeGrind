class Solution {
    public boolean isSubsequence(String s, String t) {
        // A subsequence needs to be in order so because of that we can check to see 
        // If we ever get through the full length of s
        if(s.length() == 0 && t.length() > 0)
            return true;
        if(s.length() == 0 && t.length() == 0)
            return true;
        int sLength = s.length();
        int place = 0; 
        for(Character c: t.toCharArray()) {
            if(s.charAt(place) == c) {
                place++;
            }
            if(place == sLength)
                return true;
        }

        return false; 
    }
}
