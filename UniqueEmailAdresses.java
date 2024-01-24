class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> addresses = new HashMap<>();
        for(String s : emails) {
            String [] split = s.split("@");
            StringBuilder str = new StringBuilder();
            for(Character c: split[0].toCharArray()) {
                if(c == '+')
                    break;
                if(Character.isAlphabetic(c)){
                    str.append(c);
                }
            }
            str.append('@');
            str.append(split[1]);
            addresses.put(str.toString(), addresses.getOrDefault(str.toString(), 0) + 1);
        }
        return addresses.size(); 
    }
}
