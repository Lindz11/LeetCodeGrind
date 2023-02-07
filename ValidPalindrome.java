class Solution {
    public boolean isPalindrome(String s) {
        // Need to put ever alphabetical character into a string 
        // Went just over 10 mins didn't realize its was also numeric 
        String alphas = ""; 
        for(Character c : s.toCharArray()) {
            if(Character.isLetter(c) || Character.isDigit(c)) {
                alphas+= Character.toLowerCase(c); 
            }
        }
        StringBuilder rev = new StringBuilder(alphas).reverse(); 
        String reverse = rev.toString(); 
        if(alphas.equals(reverse))
            return true; 

        return false; 
    }
}
