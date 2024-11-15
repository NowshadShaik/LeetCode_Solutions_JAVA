package Solutions;

public class _0143_Reorder_List {

    public void reorderList(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p2!=null && p2.next!=null) {
            p2 = p2.next.next;
            p1 = p1.next;
        }

        ListNode second = p1.next;
        ListNode prev = p1.next = null;
        while(second!=null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        ListNode first = head;
        second = prev;
        while(second!=null) {
            ListNode temp1 = first.next;
            first.next = second;
            ListNode temp2 = second.next;
            second.next = temp1;
            first = temp1;
            second = temp2;

        }
    }
}
