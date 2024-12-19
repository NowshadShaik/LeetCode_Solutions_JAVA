package Solutions;

public class _0007_Reverse_Integer {

    public int reverse(int x) {
        int y = Math.abs(x);
        int rev = 0;

        StringBuilder sb = new StringBuilder(String.valueOf(y)).reverse();

        try {
            rev = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return x < 0 ? -rev : rev;
    }
}
