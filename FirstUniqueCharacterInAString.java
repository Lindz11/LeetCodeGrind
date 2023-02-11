lass Solution {
    public int firstUniqChar(String s) {
        // Runtime: 0(n) Memory 0(n)
        // Use a hashmap to keep track of all of the frequencies of each character 
        HashMap<Character, Integer> freq = new HashMap<>(); 
        for(Character c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1); 
        }
        int length = s.length(); 
        for(int i = 0; i < length; i++) {
            // If the character we are at has a frequency of 1 then return it 
            if(freq.get(s.charAt(i)) == 1) {
                return i; 
            }
        }

        return -1; 
    }
}
