class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Need to transform string to char array and test if the lengths are at least the same 
        String [] second = s.split(" ");
        if(pattern.length() != second.length) 
            return false;

        int length = pattern.length();
        HashMap<Character, String> wrdPattern = new HashMap<>();
        HashSet<String> hSet = new HashSet<>(); 
        for(int i = 0; i < length; i++) {
            // If we have never seen the letter or the string map them to each other 
            if(!wrdPattern.containsKey(pattern.charAt(i)) && !hSet.contains(second[i])) {
                wrdPattern.put(pattern.charAt(i), second[i]);
                hSet.add(second[i]);
            }
            // If we have seen the letter before yet we have seen the strings arent equal then it is mapped to something else 
            // return false
            if(wrdPattern.containsKey(pattern.charAt(i))) {
                String one = wrdPattern.get(pattern.charAt(i)); 
                String two = second[i];
                if(!one.equals(two))
                    return false;
            }
            // If we have seen the string before yet we have seen the letter then it should be mapped to something else 
            // return false
            if(hSet.contains(second[i]) && !wrdPattern.containsKey(pattern.charAt(i))) {
                return false;
            }
        }

        return true; 
    }
}
