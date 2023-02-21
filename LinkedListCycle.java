public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hSet = new HashSet<>(); 
        ListNode temp = head; 
        while(temp != null) {
            if(hSet.contains(temp.next))
                return true;
            hSet.add(temp); 
            temp = temp.next;
        }

        return false;
    }
}
