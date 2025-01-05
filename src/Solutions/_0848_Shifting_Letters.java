package Solutions;

public class _0848_Shifting_Letters {

    public String shiftingLetters(String s, int[] shifts) {

        long totalShifts = 0;
        for (int shift : shifts)
            totalShifts += shift;

        char[] res = s.toCharArray();

        for (int i = 0; i < shifts.length; i++) {
            int shift = (int) (totalShifts % 26);
            int curr = (res[i] - 'a' + shift) % 26;
            res[i] = (char) (curr + 'a');
            totalShifts -= shifts[i];
        }

        return new String(res);
    }
}
