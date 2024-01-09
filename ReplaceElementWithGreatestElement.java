class Solution {
    public int[] replaceElements(int[] arr) {
        // We can cut down on the naive 0(n^2) runtime but starting from the end and moving backward
        // Keeping track of the max number we see along the way 
        int [] ans = new int [arr.length];
        int length = arr.length;
        int max = arr[length - 1];
        for(int i = length - 1; i >=0; i--) {
            // We are at the very end 
            if(i == arr.length - 1) {
                ans[i] = -1; 
            }
            // We are somwhere in the middle
            else
                ans[i] = max; 
            // After every iteration we check for the max
            max = Math.max(arr[i], max);
        }

        return ans;
    }
}
