package B_Two_Pointers.A_Easy;

public class _0125_Valid_Palindrome {

    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            while (p1 < p2 && !isAlphaNumeric(s.charAt(p1)))
                p1++;
            while (p1 < p2 && !isAlphaNumeric(s.charAt(p2)))
                p2--;

            if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}