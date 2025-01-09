package Solutions;

public class _2185_Counting_Words_With_A_Given_Prefix {

    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words)
            if (word.startsWith(pref))
                res++;
        return res;
    }
}
