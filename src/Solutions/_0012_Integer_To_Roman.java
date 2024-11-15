package Solutions;

public class _0012_Integer_To_Roman {

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int[] v = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] s = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        for (int i = v.length - 1; i >= 0; i--) {
            int n = num / v[i];
            for (int j = 0; j < n; j++) {
                res.append(s[i]);
            }
            num = num % v[i];
        }

        return res.toString();
    }
}
