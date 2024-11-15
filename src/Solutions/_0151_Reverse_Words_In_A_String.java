package Solutions;

public class _0151_Reverse_Words_In_A_String {

    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].trim() != "") {
                res.append(i != str.length - 1 ? " " : "");
                res.append(str[i].trim());
            }
        }
        return res.toString();
    }
}
