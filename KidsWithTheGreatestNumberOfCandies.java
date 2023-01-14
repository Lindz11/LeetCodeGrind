class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Need to compare all kids potential candies to kids before and after him in the array
        // Need a flag to know if there is anything greater than the potential max within the array
        // Original answer : (0)n^2
        // Can seperate the for loops and find the max number of candies before adding to the extra candies before
        // Revised answer : (0)n 
        int length = candies.length; 
        int max = 0; 
        List<Boolean> ans = new ArrayList<>(); 
        for(int c: candies) {
            max = Math.max(c, max); 
        }

        for(int c : candies) {
            if(c + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans; 
    }
}
