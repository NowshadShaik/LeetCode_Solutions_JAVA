package Solutions;

public class _2487_Remove_Notes_From_Linked_List {

    public ListNode removeNodes(ListNode head) {
        ListNode revHead = reverse(head);

        ListNode temp = revHead;
        while (temp.next != null) {
            if (temp.next.val < temp.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return reverse(revHead);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
