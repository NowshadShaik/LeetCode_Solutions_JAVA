package Solutions;

public class _2337_Move_Pieces_To_Obtain_A_String {

    public boolean canChange(String start, String target) {
        int n = start.length();

        int sp = 0, tp = 0;

        while (sp < n || tp < n) {
            while (sp < n && start.charAt(sp) == '_') sp++;
            while (tp < n && target.charAt(tp) == '_') tp++;

            if (sp == n || tp == n) {
                return sp == n && tp == n;
            }

            if (start.charAt(sp) != target.charAt(tp)) return false;
            if (start.charAt(sp) == 'L' && sp < tp) return false;
            if (start.charAt(sp) == 'R' && sp > tp) return false;

            sp++;
            tp++;
        }

        return true;
    }
}
