class Solution {
    public int findNumbers(int[] nums) {
        // Simple math problm
        // Solution is 0(n^2)
        int ans = 0; 
        for(int i: nums) { 
            int temp = i; 
            int count = 0; 
            while(temp!=0) {
                temp = temp / 10; 
                count++; 
            }
            if(count % 2 == 0)
                ans++;
        }
        return ans; 
    }
}
