package C_Stacks.B_Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class _0853_Car_Fleet {
    
        public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) return 1;

        Stack<Double> stack = new Stack<>();
        int[][] cars = new int[position.length][2];

        for(int i=0;i<position.length;i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, Comparator.comparingInt(i -> i[0]));

        for(int i=position.length-1; i>=0; i--) {
            double time = (double) (target-cars[i][0]) / cars[i][1];

            if(!stack.isEmpty() && stack.peek() >= time) {
                continue;
            } else {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
