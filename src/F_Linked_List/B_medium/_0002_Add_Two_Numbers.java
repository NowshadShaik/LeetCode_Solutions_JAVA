package F_Linked_List.B_medium;

import F_Linked_List.ListNode;

public class _0002_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode l3 = new ListNode();
        ListNode p3 = l3;

        int carry = 0;
        while(p1!=null || p2!=null || carry!=0) {
            int x = (p1==null ? 0 : p1.val) + (p2==null ? 0 : p2.val) + carry;
            carry = x>=10 ? 1 : 0;
            p3.next = new ListNode(x>=10 ? x-10 : x);
            p1 = (p1==null? null : p1.next);
            p2 = (p2==null? null : p2.next);
            p3 = p3.next;
        }
        return l3.next;
    }
}
