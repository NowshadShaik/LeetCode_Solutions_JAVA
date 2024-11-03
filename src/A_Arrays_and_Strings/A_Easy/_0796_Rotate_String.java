package A_Arrays_and_Strings.A_Easy;

public class _0796_Rotate_String {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
