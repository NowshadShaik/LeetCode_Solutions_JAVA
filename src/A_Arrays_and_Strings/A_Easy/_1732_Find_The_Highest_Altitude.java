package A_Arrays_and_Strings.A_Easy;

public class _1732_Find_The_Highest_Altitude {

    public int largestAltitude(int[] gain) {
        int res = 0;
        int curr = 0;
        for (int i = 0; i < gain.length; i++) {
            curr += gain[i];
            res = Math.max(curr, res);
        }
        return res;
    }
}
