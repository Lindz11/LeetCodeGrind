class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // I think that this is solvable in 0(n) time 
        // I can build the answer while travering through both list and seeing if one value is greater than the other
        ListNode ans = new ListNode(0); 
        ListNode temp = ans; 
        while(list1 != null && list2 != null) {
            if(list2.val < list1.val) {
                temp.next = list2 ; 
                list2 = list2.next;
                temp = temp.next; 
            }
            else
            {
                temp.next = list1; 
                list1 = list1.next; 
                temp = temp.next;
            }
        }

        if(list1 == null && list2 !=null) {
            temp.next = list2; 
        }
        if(list2 == null && list1 !=null) {
            temp.next = list1; 
        }

        return ans.next; 
    }
}
