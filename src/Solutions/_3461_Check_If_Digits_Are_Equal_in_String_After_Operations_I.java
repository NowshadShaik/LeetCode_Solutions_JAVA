package Solutions;

public class _3461_Check_If_Digits_Are_Equal_in_String_After_Operations_I {

    public boolean hasSameDigits(String s) {

        while (s.length() > 2) {
            StringBuilder t = new StringBuilder();

            for (int i = 1; i < s.length(); i++) {
                int n = Integer.valueOf(s.charAt(i)) + Integer.valueOf(s.charAt(i - 1));
                n %= 10;
                t.append(n);
            }
            s = t.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }
}
