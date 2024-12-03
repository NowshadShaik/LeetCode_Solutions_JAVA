package Solutions;

public class _2109_Adding_Space_To_A_String {

    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();

        int p = 0;
        int sl = s.length(), sp = spaces.length;
        for (int i = 0; i < sl; i++) {
            if (p < sp && spaces[p] == i) {
                res.append(" ");
                p++;
            }
            res.append(s.charAt(i));
        }

        return res.toString();
    }
}
