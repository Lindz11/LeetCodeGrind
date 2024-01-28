class Solution {
    public int strStr(String haystack, String needle) {
        int length = haystack.length();
        int nlength = needle.length();
        boolean first = false;
        for(int i = 0; i < length; i++) {
            if(haystack.charAt(i) == needle.charAt(0) && i + nlength - 1 < length) {
                String s = haystack.substring(i, i + nlength);
                first = tester(s,needle); 
                if(first == true)
                    return i;
            }
        }

        return -1;
    }

    public boolean tester(String test, String needle) {
        return test.equals(needle);
    }
}
