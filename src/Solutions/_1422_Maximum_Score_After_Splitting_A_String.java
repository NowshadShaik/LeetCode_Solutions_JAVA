package Solutions;

public class _1422_Maximum_Score_After_Splitting_A_String {

    public int maxScore(String s) {
        int res = 0;

        int total = 0;
        for (char c : s.toCharArray())
            if (c == '1') total++;

        int curr = 0;
        if (s.charAt(0) == '1')
            curr++;

        for (int i = 1; i < s.length(); i++) {
            int left = i - curr;
            int right = total - curr;
            res = Math.max(res, left + right);

            if (s.charAt(i) == '1') curr++;
        }

        return res;
    }
}
