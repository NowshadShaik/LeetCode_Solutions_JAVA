package Solutions;

import java.util.Stack;

public class _0682_Baseball_Game {

    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int a = score.peek();
                int b = score.get(score.size() - 2);
                score.push(a + b);
            } else if (operations[i].equals("C")) {
                score.pop();
            } else if (operations[i].equals("D")) {
                score.push(score.peek() * 2);
            } else {
                score.push(new Integer(operations[i]));
            }
        }
        int total = 0;
        for (int i : score) {
            total += i;
        }
        return total;
    }
}