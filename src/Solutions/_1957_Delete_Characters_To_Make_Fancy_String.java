package Solutions;

public class _1957_Delete_Characters_To_Make_Fancy_String {

    public String makeFancyString(String s) {
        if (s.length() <= 2) return s;

        StringBuilder res = new StringBuilder();
        int consecutive = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i - 1) == s.charAt(i)) consecutive++;
            else consecutive = 1;

            if (consecutive < 3) res.append(s.charAt(i));
        }

        return res.toString();
    }
}
