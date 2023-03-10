class Solution {
    public List<String> fizzBuzz(int n) {
        // Solution: O(n)
        List<String> ans = new ArrayList<>(); 
        // Need to check from least to greatest priority and add to the arraylist in that order
        for(int i = 1; i <= n; i++) {
            if(i % 5 == 0 && i % 3 == 0)
                ans.add("FizzBuzz");
            else if(i % 5 == 0)
                ans.add("Buzz");
            else if(i % 3 == 0)
                ans.add("Fizz");
            else
                ans.add(Integer.toString(i)); 
        }

        return ans; 
    }
}
