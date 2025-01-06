package Solutions;

public class _0622_Design_Circular_Queue {

    ListNode left;
    ListNode right;
    int freeSpace;

    public _0622_Design_Circular_Queue(int k) {
        this.freeSpace = k;
        this.left = new ListNode(0);
        this.right = left;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        ListNode node = new ListNode(value);
        if (isEmpty()) {
            this.left.next = node;
            this.right = node;
        } else {
            this.right.next = node;
            this.right = node;
        }
        freeSpace--;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        this.left.next = left.next.next;
        if (left.next == null)
            this.right = this.left;

        freeSpace++;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : this.left.next.val;
    }

    public int Rear() {
        return isEmpty() ? -1 : this.right.val;
    }

    public boolean isEmpty() {
        return this.left.next == null;
    }

    public boolean isFull() {
        return this.freeSpace == 0;
    }
}
