package Solutions;

import java.util.*;

public class _0752_Open_The_Lock {

    public int openLock(String[] deadends, String target) {

        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        if (visited.contains("0000"))
            return -1;

        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        visited.add("0000");

        int turns = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String curr = queue.poll();

                if (curr.equals(target))
                    return turns;

                for (String child : getChildren(curr)) {
                    if (visited.contains(child))
                        continue;
                    else {
                        queue.offer(child);
                        visited.add(child);
                    }
                }
            }
            turns++;
        }

        return -1;
    }

    private List<String> getChildren(String curr) {
        List<String> children = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            char[] arr = curr.toCharArray();
            arr[i] = (char) (((arr[i] - '0' + 1) % 10) + '0');
            children.add(new String(arr));

            arr = curr.toCharArray();
            arr[i] = (char) (((arr[i] - '0' - 1 + 10) % 10) + '0');
            children.add(new String(arr));
        }

        return children;
    }
}
