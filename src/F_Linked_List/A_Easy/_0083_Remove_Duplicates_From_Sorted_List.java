package F_Linked_List.A_Easy;


import F_Linked_List.ListNode;

public class _0083_Remove_Duplicates_From_Sorted_List {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode p1 = head;
        while (p1.next != null) {
            if (p1.next.val == p1.val) {
                p1.next = p1.next.next;
            } else {
                p1 = p1.next;
            }
        }

        return head;

    }
}
