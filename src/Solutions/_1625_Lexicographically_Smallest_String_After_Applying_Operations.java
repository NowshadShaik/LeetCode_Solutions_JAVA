package Solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class _1625_Lexicographically_Smallest_String_After_Applying_Operations {

    public String findLexSmallestString(String s, int a, int b) {
        Deque<String> q = new ArrayDeque<>();
        q.offer(s);
        Set<String> visited = new HashSet<>();
        visited.add(s);

        String res = s;

        while (!q.isEmpty()) {
            String curr = q.poll();

            if (curr.compareTo(res) < 0)
                res = curr;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < curr.length(); i++)
                sb.append((i % 2 == 0) ? curr.charAt(i) : (char) ((curr.charAt(i) - '0' + a) % 10 + '0'));

            String added = sb.toString();
            if (visited.add(added))
                q.offer(added);

            String rotated = curr.substring(curr.length() - b) + curr.substring(0, curr.length() - b);
            if (visited.add(rotated))
                q.offer(rotated);
        }

        return res;
    }
}
