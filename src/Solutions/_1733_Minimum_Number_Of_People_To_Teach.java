package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _1733_Minimum_Number_Of_People_To_Teach {

    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> sadUsers = new HashSet<>();

        for (int[] friendship : friendships) {
            int a = friendship[0];
            int b = friendship[1];

            if (!knowCommonLang(a, b, languages)) {
                sadUsers.add(a);
                sadUsers.add(b);
            }
        }

        int maxCount = 0;
        int[] freq = new int[n + 1];
        for (int user : sadUsers) {
            for (int l : languages[user - 1]) {
                freq[l]++;
                maxCount = Math.max(maxCount, freq[l]);
            }
        }

        return sadUsers.size() - maxCount;

    }

    private boolean knowCommonLang(int a, int b, int[][] languages) {
        Set<Integer> lang = new HashSet<>();

        int[] aLang = languages[a - 1];
        int[] bLang = languages[b - 1];

        for (int l : aLang)
            lang.add(l);

        for (int l : bLang) {
            if (lang.contains(l))
                return true;
        }

        return false;
    }
}
