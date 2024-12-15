package Solutions;

import java.util.PriorityQueue;

public class _1792_Maximum_Average_Pass_Ratio {

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Pair<Integer, Double>> pq = new PriorityQueue<Pair<Integer, Double>>((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for(int i=0; i<classes.length; i++) {
            pq.offer(new Pair(i, ifStudentAdded(classes[i][0], classes[i][1])));
        }

        for(int i=0;i<extraStudents;i++) {
            Pair<Integer, Double> curr = pq.poll();
            int c = curr.getKey();
            classes[c][0]++;
            classes[c][1]++;
            pq.offer(new Pair(c, ifStudentAdded(classes[c][0], classes[c][1])));
        }

        double total = 0;
        while(pq.size() != 0) {
            int index = pq.poll().getKey();
            total += ((double)classes[index][0]) / ((double)classes[index][1]);
        }

        return total / classes.length;
    }

    private double ifStudentAdded(int a, int b) {
        return ((double)(a+1) / (double)(b + 1)) - ((double)a / (double)b);
    }
}
