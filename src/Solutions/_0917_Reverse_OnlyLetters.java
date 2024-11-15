package Solutions;

public class _0917_Reverse_OnlyLetters {

    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int p1 = 0, p2 = str.length - 1;

        while (p1 < p2) {
            while (p1 < p2 && !Character.isLetter(str[p1])) p1++;

            while (p1 < p2 && !Character.isLetter(str[p2])) p2--;

            char c = str[p1];
            str[p1] = str[p2];
            str[p2] = c;
            p1++;
            p2--;
        }
        return new String(str);
    }
}
