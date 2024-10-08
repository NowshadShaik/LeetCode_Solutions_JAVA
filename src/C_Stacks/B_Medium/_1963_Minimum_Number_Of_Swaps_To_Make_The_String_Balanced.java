package C_Stacks.B_Medium;

public class _1963_Minimum_Number_Of_Swaps_To_Make_The_String_Balanced {

    public int minSwaps(String s) {
        int extraClose = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                extraClose++;
                max = Math.max(max, extraClose);
            } else {
                extraClose--;
            }
        }
        return (max + 1) / 2;
    }
}
