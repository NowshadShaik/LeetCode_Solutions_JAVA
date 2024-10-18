package F_Linked_List.B_medium;

import F_Linked_List.ListNode;

public class _0328_Odd_Even_Linked_List {

    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode temp = head.next;
        while(p2!=null && p2.next!=null) {
            p1.next = p1.next.next;
            p2.next = p2.next.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = temp;
        return head;
    }
}
