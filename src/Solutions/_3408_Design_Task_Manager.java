package Solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _3408_Design_Task_Manager {

    private PriorityQueue<int[]> pq;
    private Map<Integer, Integer> taskPriority;
    private Map<Integer, Integer> taskOwner;

    public _3408_Design_Task_Manager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a, b) -> {
            if (b[0] == a[0])
                return b[1] - a[1];
            else
                return b[0] - a[0];
        });
        taskPriority = new HashMap<>();
        taskOwner = new HashMap<>();

        for (List<Integer> task : tasks)
            add(task.get(0), task.get(1), task.get(2));
    }

    public void add(int userId, int taskId, int priority) {
        pq.add(new int[]{priority, taskId});
        taskPriority.put(taskId, priority);
        taskOwner.put(taskId, userId);
    }

    public void edit(int taskId, int newPriority) {
        pq.add(new int[]{newPriority, taskId});
        taskPriority.put(taskId, newPriority);
    }

    public void rmv(int taskId) {
        taskPriority.put(taskId, -1);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] task = pq.poll();
            int p = task[0], id = task[1];

            if (taskPriority.getOrDefault(id, -1) == p) {
                taskPriority.put(id, -1);
                return taskOwner.getOrDefault(id, -1);
            }
        }
        return -1;
    }
}
