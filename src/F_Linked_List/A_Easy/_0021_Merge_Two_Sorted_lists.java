package F_Linked_List.A_Easy;

import F_Linked_List.ListNode;

public class _0021_Merge_Two_Sorted_lists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1 == null && list2 == null) return null;

        ListNode list3 = new ListNode();
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p3 = list3;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p3.next = p1;
                p1 = p1.next;
            } else {
                p3.next = p2;
                p2 = p2.next;
            }
            p3 = p3.next;
        }

        while (p1 != null) {
            p3.next = p1;
            p1 = p1.next;
            p3 = p3.next;
        }
        while (p2 != null) {
            p3.next = p2;
            p2 = p2.next;
            p3 = p3.next;
        }
        return list3.next;
    }
}
