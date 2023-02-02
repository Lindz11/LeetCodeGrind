class Solution {
    public int romanToInt(String s) {
        // Solution can be solves in 0(n) time
        // Need to use a data structure to map characters to integers 
        Map<Character, Integer> rom = new HashMap<>(); 
        int length = s.length(); 
        int ans = 0; 
        rom.put('I', 1);
        rom.put('V', 5); 
        rom.put('X', 10); 
        rom.put('L', 50); 
        rom.put('C', 100); 
        rom.put('D', 500); 
        rom.put('M', 1000);
        for(int i = 0; i < length; i++) {
            if(i > 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I' || i > 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I')
                ans-= 2; 
            if(i > 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X' || i > 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X')
                ans-=20; 
            if(i > 0 && s.charAt(i) == 'D' && s.charAt(i - 1) == 'C' || i > 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C')
                ans-=200; 
            ans+=rom.get(s.charAt(i)); 
        }

        return ans; 
    }
