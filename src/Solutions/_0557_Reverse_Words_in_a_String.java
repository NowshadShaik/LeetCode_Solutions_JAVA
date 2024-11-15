package Solutions;

public class _0557_Reverse_Words_in_a_String {
    
    public String reverseWords(String s) {
        
        int p1=0,p2=0;
        char[] str = s.toCharArray();
        while(p2<str.length) {
            while(p2<str.length && str[p2] != (' ')) {
                p2++;
            }
            int t1 = p2+1;
            p2--;

            while(p1<p2) {
                char c = str[p1];
                str[p1] = str[p2];
                str[p2] = c;
                p1++;
                p2--;
            }
            p1 = t1;
            p2 = t1;
        }
        return new String(str);
    }
}
