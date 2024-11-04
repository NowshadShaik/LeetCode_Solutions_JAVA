package A_Arrays_and_Strings.B_Medium;

public class _3163_String_Compression_III {

    public String compressedString(String word) {
        StringBuilder res = new StringBuilder();

        int pos = 0;

        while(pos<word.length()) {
            int consCount = 0;
            char currChar = word.charAt(pos);
            while(pos<word.length() && consCount<9 && word.charAt(pos) == currChar) {
                consCount++;
                pos++;
            }
            res.append(consCount).append(currChar);
        }

        return res.toString();
    }
}
