class Solution {
    public int maxDepth(TreeNode root) {
        // Check if the initial root is null 
        if(root == null)
            return 0; 
        // Go as far left as possible counting the root we are currently at 
        int left = 1 + maxDepth(root.left); 
        // Go as far right as possible counting the root we are currently at 
        int right = 1 + maxDepth(root.right); 

        // return the bigger right if they are the same then by default return the right side 
        if(left > right)
            return left; 
        return right; 
    }
}
