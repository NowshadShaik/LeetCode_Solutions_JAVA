package Solutions;

public class _0008_String_To_Integer_atoi {

    public int myAtoi(String s) {
        int res = 0;
        boolean negative = false;

        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') i++;

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-')
                negative = true;
            i++;
        }

        while (i < s.length() && s.charAt(i) >= 48 && s.charAt(i) <= 57) {
            int digit = Integer.valueOf(s.charAt(i)) - 48;

            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = (res * 10) + (digit);
            i++;
        }

        return negative ? -res : res;
    }
}
