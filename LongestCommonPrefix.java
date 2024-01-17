class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int length = strs.length, count = 0;
        // Loop through all of the string in strs and naively use the first string as 
        // our tester against all of the other strings
        for(int i = 1; i < length; i++) {
            String s = strs[i];
            String temp = "";
            int t_length = ans.length();
            for(Character c: s.toCharArray()) {
                // Anytime we find characters that match increment 
                // and we are still in bounds of our naive answer 
                // add the string to temp and increment count
                if(count < t_length && c == ans.charAt(count)) {
                    count++;
                    temp+=c;
                }
                // otherwise break out of the loop 
                else {
                    break;
                }
            }
            count = 0;
            ans = temp;
        }

        return ans;
    }
}
