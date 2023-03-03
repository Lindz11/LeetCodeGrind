class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head; 
        ListNode odd = head; 
        // We need to keep track of where even starts from 
        ListNode evenstart = head.next;
        ListNode even2 = head.next;
        while(odd.next != null && even2.next!=null ) {
            // Loop through point the node we are at to every other node
            odd.next = odd.next.next; 
            even2.next = even2.next.next; 
            odd = odd.next; 
            even2 = even2.next; 
        }
        // At the end connect the odd to the startpoint 
        odd.next = evenstart; 
        return head;

    }
}
