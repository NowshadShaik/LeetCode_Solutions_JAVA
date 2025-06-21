package Solutions;

public class _3085_Minimum_Deletions_To_Make_String_K_Special {

    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        int res = word.length();
        for (int i = 0; i < 26; i++) {
            int deletes = 0;

            for (int j = 0; j < 26; j++) {
                int a = freq[i];
                int b = freq[j];
                if (a > b)
                    deletes += b;
                else if (b > (a + k))
                    deletes += b - (a + k);

            }

            res = Math.min(res, deletes);
        }

        return res;
    }
}
