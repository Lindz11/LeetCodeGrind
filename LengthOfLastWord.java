class Solution {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        int length = splited.length;
        return splited[length - 1].length();
    }
}
