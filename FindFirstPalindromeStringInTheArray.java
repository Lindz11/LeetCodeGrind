class Solution {
    public String firstPalindrome(String[] words) {
        // This seems like a easier string problem 
        // Solution 0(nlogn) comparing characters for each string
        String ans = ""; 
        for(String s: words) {
            StringBuilder str = new StringBuilder(s); 
            str.reverse();
            String rev = str.toString();  
            if(s.equals(rev))
                return s;
        }

        return ans; 
    }
}
