package Solutions;

public class _3227_Vowels_Game_In_A_String {

    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray())
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return true;

        return false;
    }
}
