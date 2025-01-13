package Solutions;

public class _3223_Minimum_Length_Of_String_After_Operations {

    public int minimumLength(String s) {
        int[] freq = new int[26];
        int res = 0;

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                freq[i] = freq[i] % 2 == 0 ? 2 : 1;
                res += freq[i];
            }
        }

        return res;
    }
}
