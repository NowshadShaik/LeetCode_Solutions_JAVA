package Solutions;

import java.util.Stack;
import javafx.util.Pair;

public class _0087_Largest_Rectangle_In_Histogram {

    public int largestRectangleArea(int[] heights) {
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        int res = 0;

        for(int i=0;i<heights.length;i++) {
            int temp = -1;
            if(!stack.isEmpty()) {
                while(!stack.isEmpty() && stack.peek().getValue() > heights[i]) {
                    Pair<Integer, Integer> pair = stack.pop();
                    int area = (i - pair.getKey()) * pair.getValue();
                    res = Math.max(res, area);
                    temp = pair.getKey();
                }
            }
            stack.push(new Pair(temp==-1? i : temp, heights[i]));
        }

        int e = heights.length;
        while(!stack.isEmpty()) {
            Pair<Integer, Integer> pair = stack.pop();
            int area = (e - pair.getKey()) * pair.getValue();
            res = Math.max(res, area);
        }
        return res;
    }

}

