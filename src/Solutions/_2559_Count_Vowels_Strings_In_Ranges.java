package Solutions;

import java.util.Arrays;

public class _2559_Count_Vowels_Strings_In_Ranges {

    String vowels = "aeiou";

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] counts = new int[words.length];
        counts[0] = check(words[0]) ? 1 : 0;

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            counts[i] = counts[i - 1] + (check(word) ? 1 : 0);
        }

        System.out.println(Arrays.toString(counts));

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            if (l == 0)
                res[i] = counts[r];
            else
                res[i] = counts[r] - counts[l - 1];
        }
        return res;
    }

    private boolean check(String str) {
        char s = str.charAt(0);
        char e = str.charAt(str.length() - 1);

        return vowels.indexOf(s) != -1 && vowels.indexOf(e) != -1;
    }
}
