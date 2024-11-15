package Solutions;

public class _0206_Reverse_Linked_List {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
}
