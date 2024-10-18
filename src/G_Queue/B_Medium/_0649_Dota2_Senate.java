package G_Queue.B_Medium;

import java.util.LinkedList;
import java.util.Queue;

public class _0649_Dota2_Senate {

    public String predictPartyVictory(String senate) {
        Queue<Integer> queueRad = new LinkedList<>();
        Queue<Integer> queueDir = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') queueRad.add(i);
            else queueDir.add(i);
        }

        while (!queueDir.isEmpty() && !queueRad.isEmpty()) {
            if (queueRad.peek() < queueDir.peek()) {
                queueRad.add(n++);
            } else {
                queueDir.add(n++);
            }
            queueRad.poll();
            queueDir.poll();
        }
        return queueRad.isEmpty() ? "Dire" : "Radiant";
    }
}
