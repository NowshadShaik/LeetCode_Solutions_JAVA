package F_Linked_List.B_medium;

import F_Linked_List.ListNode;

public class _0019_Remove_Nth_Node_from_End_Of_List {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0) return head;
        ListNode dummy = new ListNode(0,head);
        ListNode p1 = dummy;
        ListNode p2 = head;

        for(int i = 0;i<n;i++) p2 = p2.next;

        while(p2!=null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;

        return dummy.next;
    }
}
