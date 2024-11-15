package Solutions;

public class _0796_Rotate_String {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
