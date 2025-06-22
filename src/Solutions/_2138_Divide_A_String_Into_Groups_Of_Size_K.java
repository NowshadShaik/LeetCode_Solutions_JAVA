package Solutions;

public class _2138_Divide_A_String_Into_Groups_Of_Size_K {

    public String[] divideString(String s, int k, char fill) {
        String[] res = new String[(s.length() + k - 1) / k];
        int c = 0;

        StringBuilder curr = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            curr.append(s.charAt(i - 1));

            if (i % k == 0) {
                res[c++] = curr.toString();
                curr = new StringBuilder();
            } else if (i == s.length()) {
                int a = k - curr.length();
                for (int j = 0; j < a; j++)
                    curr.append(fill);
            }
        }

        if (curr.length() > 0)
            res[c++] = curr.toString();

        return res;
    }
}
