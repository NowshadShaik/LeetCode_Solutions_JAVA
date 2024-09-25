package B_Two_Pointers.A_Easy;

public class _0541_Reverse_String_II {
    
    public String reverseStr(String s, int k) {
        
        int twoK = 2*k;
        char[] str = s.toCharArray();

        for(int i=0;i<str.length;i+=twoK) {
            int p1 = i;
            int p2 = Math.min(str.length-1, i+k-1);
            while(p1<=p2) {
                char c = str[p1];
                str[p1] = str[p2];
                str[p2] = c;
                p1++;
                p2--;
            }
        }
        return new String(str);
    }
}
