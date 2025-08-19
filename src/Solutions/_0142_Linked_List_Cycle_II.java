package Solutions;

public class _0142_Linked_List_Cycle_II {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        ListNode third = head;
        while(third != slow) {
            slow = slow.next;
            third = third.next;
        }

        return third;
    }
}
