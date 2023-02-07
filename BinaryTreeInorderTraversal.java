class Solution {
    // Inorder traversal is leftmost, root, rightmost
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>(); 
        inorder(root, ans); 
        return ans; 
    }

    public void inorder(TreeNode root, List<Integer> ans) {
        // If the root is null then return 
        if(root == null)
            return; 

        // If it is not null then go to the left most node 
        inorder(root.left, ans); 
        // After we have went to the left most node return and start adding every node we have seen to our list 
        ans.add(root.val); 
        // Then traverse right and do the same thing 
        inorder(root.right, ans); 
        return; 
    }
}
