 public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0; 
        PriorityQueue<Integer> numbers = new PriorityQueue<>(); 
        helper(root, numbers); 
        int pop=0; 
        int val = 0; 
        while(!numbers.isEmpty() && pop!= k) {
            val = numbers.poll(); 
            pop++; 
        }
        return val; 
    }
    
    void helper( TreeNode root, PriorityQueue<Integer> numbers) {
        if(root == null)
            return; 
        numbers.add(root.val); 
        helper(root.left, numbers); 
        helper(root.right, numbers); 
    }
