class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Need to look through every character of the string make sure that 
        // Looking for UNIQUENESS so my brute force answer will involve HashSet
        // Use a flag to see if you unallowed words are included in the string
        HashSet<Character> allow = new HashSet<>(); 
        for(char c: allowed.toCharArray()) {
            allow.add(c); 
        }
        int ans = 0; 
        for(String s: words) {
            boolean flag = true; 
            for(char c: s.toCharArray()) {
                if(allow.contains(c) == false){
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                ans++; 
        }

        return ans; 
    }
}
