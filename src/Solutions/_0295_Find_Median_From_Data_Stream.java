package Solutions;

import java.util.PriorityQueue;

public class _0295_Find_Median_From_Data_Stream {

    PriorityQueue<Integer> smallHeap;
    PriorityQueue<Integer> largeHeap;

    public _0295_Find_Median_From_Data_Stream() {
        this.smallHeap = new PriorityQueue<>((a, b) -> b - a);
        this.largeHeap = new PriorityQueue<>((a, b) -> a - b);
    }

    public void addNum(int num) {
        smallHeap.add(num);
        if (smallHeap.size() - largeHeap.size() > 1 || (!largeHeap.isEmpty() && smallHeap.peek() > largeHeap.peek())) {
            largeHeap.add(smallHeap.poll());
        }

        if (largeHeap.size() - smallHeap.size() > 1)
            smallHeap.add(largeHeap.poll());

    }

    public double findMedian() {
        if (smallHeap.size() == largeHeap.size()) {
            return (double) (largeHeap.peek() + smallHeap.peek()) / 2;
        } else if (smallHeap.size() > largeHeap.size()) {
            return (double) smallHeap.peek();
        } else {
            return (double) largeHeap.peek();
        }
    }
}
