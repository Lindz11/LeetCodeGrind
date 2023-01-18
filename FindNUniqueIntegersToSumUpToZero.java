class Solution {
    public int[] sumZero(int n) {
        // Simple math problem 
        // Solution 0(n)
        // You need to check is the length is odd or even to decide if you're finish or if you need to add a 0
        int [] ans = new int [n];
        int num = 1; 
        int length = n; 
        while(length >= 2) {
            ans[length - 1] = num; 
            ans[length - 2] = num * -1; 
            num++; 
            length-=2; 
        }

        if(n % 2 == 1)
            ans[length - 1] = 0;  

        return ans; 
    }
}
