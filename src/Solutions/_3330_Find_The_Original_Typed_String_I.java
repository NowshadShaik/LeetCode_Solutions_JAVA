package Solutions;

public class _3330_Find_The_Original_Typed_String_I {

    public int possibleStringCount(String word) {
        int res = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1))
                res++;
        }

        return res;
    }
}
