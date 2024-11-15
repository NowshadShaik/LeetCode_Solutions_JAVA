package Solutions;

public class _2914_Minimum_Number_Of_Changes_To_Make_Binary_String_Beautiful {

    public int minChanges(String s) {
        int res = 0;

        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i - 1)) res++;
        }

        return res;
    }
}
