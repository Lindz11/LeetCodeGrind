class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Need to keep track of a new string that holds the first string and comapire it to that 
        int length = strs.length; 
        String common = strs[0]; 
        // Go through each string in the array strs
        for(int i = 1; i < length; i++) {
            // retireve the next string
            String nxt = strs[i]; 
            // Keep a count for the initial string
            int count = 0;
            // Keep a tempt string to hold all common characters 
            String temp = ""; 
            for(Character c : nxt.toCharArray()) {
                // If we go out of bounds of our known common string then instantly break
                if(count > common.length() - 1)
                    break; 
                if(common.charAt(count) == c){
                    count++; 
                    temp+=c; 
                }
                // If the characters are not the same instantly break
                else
                    break; 

            }
            common = temp;
        }
           
        return common;
    }
}
