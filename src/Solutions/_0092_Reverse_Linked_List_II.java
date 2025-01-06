package Solutions;

public class _0092_Reverse_Linked_List_II {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode curr = head;
        ListNode temp = new ListNode(0, head);
        ListNode res = temp;

        for (int i = 1; i < left; i++) {
            curr = curr.next;
            temp = temp.next;
        }

        int revCou = right - left + 1;
        ListNode prev = null;
        for (int i = 1; i <= revCou; i++) {
            ListNode tem = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tem;
        }

        temp.next.next = curr;
        temp.next = prev;

        return res.next;
    }
}
