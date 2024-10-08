package C_Stacks.B_Medium;

public class _0921_Minimum_Add_To_Make_Parentheses_Valid {

    public int minAddToMakeValid(String s) {
        int open = 0;
        int closed = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') open++;
            else {
                if (open > 0) open--;
                else closed++;
            }
        }
        return open + closed;
    }
}
