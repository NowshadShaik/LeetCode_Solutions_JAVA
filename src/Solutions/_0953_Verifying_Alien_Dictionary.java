package Solutions;

public class _0953_Verifying_Alien_Dictionary {

    public boolean isAlienSorted(String[] words, String order) {
        int[] seq = new int[26];
        for (int i = 0; i < 26; i++)
            seq[order.charAt(i) - 'a'] = i;

        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];

            for (int j = 0; j < w1.length(); j++) {
                if (j == w2.length())
                    return false;

                if (w1.charAt(j) != w2.charAt(j)) {
                    if (seq[w1.charAt(j) - 'a'] > seq[w2.charAt(j) - 'a'])
                        return false;

                    break;
                }
            }
        }

        return true;
    }
}
