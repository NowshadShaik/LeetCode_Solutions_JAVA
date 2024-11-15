package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0271_Encode_and_Decode_Strings {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for(String s : strs) {
             encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();

        int i=0;
        while(i<str.length()) {
            int j=i;
            while(str.charAt(j)!='#') j++;

            int n = Integer.valueOf(str.substring(i,j));
            i = j + 1 + n;

            decodedString.add(str.substring(j + 1, i));
        }
        return decodedString;
    }
}
