package Solutions;

import java.util.Stack;

public class _2116_Check_If_Parentheses_String_Can_Be_Valid {

    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1)
            return false;

        Stack<Integer> stack_locked = new Stack<>();
        Stack<Integer> stack_unlocked = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0')
                stack_unlocked.push(i);
            else if (s.charAt(i) == '(')
                stack_locked.push(i);
            else {
                if (!stack_locked.isEmpty())
                    stack_locked.pop();
                else if (!stack_unlocked.isEmpty())
                    stack_unlocked.pop();
                else
                    return false;
            }
        }

        while (!stack_locked.isEmpty() && !stack_unlocked.isEmpty() && stack_locked.peek() < stack_unlocked.peek()) {
            stack_locked.pop();
            stack_unlocked.pop();
        }

        if (!stack_locked.isEmpty())
            return false;

        return true;
    }
}
