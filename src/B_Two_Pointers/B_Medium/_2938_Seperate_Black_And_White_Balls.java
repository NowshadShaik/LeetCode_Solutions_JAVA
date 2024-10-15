package B_Two_Pointers.B_Medium;

public class _2938_Seperate_Black_And_White_Balls {

    public long minimumSteps(String s) {
        int p1 = 0, p2 = 0;
        long res = 0;
        while (p2 < s.length()) {
            if (s.charAt(p2) == '0') {
                res += p2 - p1;
                p1++;
            }
            p2++;
        }

        return res;
    }
}
