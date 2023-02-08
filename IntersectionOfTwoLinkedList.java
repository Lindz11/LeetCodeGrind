public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Try to use a hashmap to test if the same node has been added memory 
        HashSet<ListNode> hSet = new HashSet<>(); 
        // Add everything we see in the first linked list into the hashset 
        while(headA != null) {
            hSet.add(headA); 
            headA = headA.next; 
        }
        // If we have already added something into the hashset 
        // Then just return the node that we are currently at 
        while(headB != null) {
            if(hSet.contains(headB))
                return headB; 
            headB = headB.next; 
        }

        return null; 


    }
}
