package Solutions;

public class _0344_Reverse_String {

    public void reverseString(char[] s) {
        int p1 = 0;
        int p2 = s.length-1;

        while(p1<p2) {
            char c = s[p1];
            s[p1] = s[p2];
            s[p2] = c;
            p1++;
            p2--;
        }
    }
}