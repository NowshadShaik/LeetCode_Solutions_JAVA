package Solutions;

public class _1400_Construct_K_Palindrome_Strings {

    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;

        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int odds = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                if (freq[i] == 1 || freq[i] % 2 != 0)
                    odds++;
            }
        }

        return odds <= k;
    }
}
