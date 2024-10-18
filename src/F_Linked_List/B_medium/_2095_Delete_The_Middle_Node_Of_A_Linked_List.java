package F_Linked_List.B_medium;

import F_Linked_List.ListNode;

public class _2095_Delete_The_Middle_Node_Of_A_Linked_List {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null || head == null) return null;
        ListNode sloPoi = head;
        ListNode fasPoi = head.next.next;

        while (fasPoi != null && fasPoi.next != null) {
            sloPoi = sloPoi.next;
            fasPoi = fasPoi.next.next;
        }
        sloPoi.next = sloPoi.next.next;
        return head;
    }
}
