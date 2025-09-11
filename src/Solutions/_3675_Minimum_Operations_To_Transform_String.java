package Solutions;

public class _3675_Minimum_Operations_To_Transform_String {

    public int minOperations(String s) {
        int res = 26;

        for (char c : s.toCharArray())
            if (c != 'a')
                res = Math.min(res, c - 'a');

        return 26 - res;
    }
}
