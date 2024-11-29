package Solutions;

public class _0203_Remove_Linked_List_Elements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode temp = prev;

        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }

        return temp.next;
    }
}
