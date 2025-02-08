package Solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2349_Design_a_Number_Container_System {

    Map<Integer, PriorityQueue<Integer>> containers;
    Map<Integer, Integer> values;

    public _2349_Design_a_Number_Container_System() {
        this.containers = new HashMap<>();
        this.values = new HashMap<>();
    }

    public void change(int index, int number) {
        values.put(index, number);
        containers.putIfAbsent(number, new PriorityQueue<>());
        containers.get(number).add(index);
    }

    public int find(int number) {
        if (containers.containsKey(number)) {

            PriorityQueue<Integer> currQueue = containers.get(number);
            while (!currQueue.isEmpty()) {

                if (values.get(currQueue.peek()) == number)
                    return currQueue.peek();

                currQueue.poll();
            }
            return -1;
        }

        return -1;
    }
}
