package C_Stacks.B_Medium;

import java.util.Stack;

public class _0394_Decode_String {

    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> results = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');
            } else if (c == '[') {
                counts.push(currNum);
                currNum = 0;

                results.push(currStr.toString());
                currStr = new StringBuilder();
            } else if (c == ']') {
                int times = counts.pop();

                StringBuilder temp = new StringBuilder(results.pop());
                for (int i = 0; i < times; i++) {
                    temp.append(currStr);
                }
                currStr = temp;
            } else {
                currStr.append(c);
            }
        }

        return currStr.toString();
    }
}
