package Solutions;

public class _2130_Maximum_Twin_Sum_Of_A_Linked_List {

    public int pairSum(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode pp = null;
        ListNode pc = p1;
        ListNode pn = p1.next;
        while (pn != null) {
            pc.next = pp;
            pp = pc;
            pc = pn;
            pn = pn.next;
        }
        pc.next = pp;

        int res = Integer.MIN_VALUE;
        p1 = head;
        p2 = pc;
        while (p2 != null) {
            res = Math.max(res, p2.val + p1.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        return res;
    }
}
