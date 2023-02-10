class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();
        list.add(head.val);

        // Add everything into an arraylist 
        while (head.next != null) {
            head = head.next;
            list.add(head.val);
        }

        // Come the node at the front to the node at the back 
        // You only need to chek the half of the list since it should be a reflection
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals( list.get( list.size() - i - 1 )))
                return false;
        }

        return true;
    }
}
