package Solutions;

import java.util.PriorityQueue;

public class _1792_Maximum_Average_Pass_Ratio {

    public double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b[0], a[0]));

        for(int i=0;i<classes.length;i++) {
            double gained = gain(classes[i]);
            maxHeap.offer(new double[] {gained, i});
        }

        for(int i=0;i<extraStudents;i++) {
            double[] curr = maxHeap.poll();
            int index = (int) curr[1];
            classes[index][0]++;
            classes[index][1]++;
            curr[0] = gain(classes[index]);
            maxHeap.offer(curr);
        }

        double res = 0;
        for(int[] clas: classes)
            res += (double) clas[0]/clas[1];

        return res/classes.length;
    }

    private double gain(int[] clas) {
        double p = clas[0] * 1.0;
        double t = clas[1] * 1.0;
        return ((p+1)/(t+1)) - (p/t);
    }
}
