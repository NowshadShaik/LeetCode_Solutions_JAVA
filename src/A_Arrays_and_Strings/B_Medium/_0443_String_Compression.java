package A_Arrays_and_Strings.B_Medium;

public class _0443_String_Compression {

    public int compress(char[] chars) {
        int p = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == c) {
                ++count;
                ++i;
            }
            chars[p++] = c;

            if (count > 1) {
                for (char ch : Integer.toString(count).toCharArray()) {
                    chars[p++] = ch;
                }
            }
            --i;
        }
        return p;
    }
}
