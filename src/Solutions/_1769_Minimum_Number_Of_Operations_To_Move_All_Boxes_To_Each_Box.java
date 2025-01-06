package Solutions;

public class _1769_Minimum_Number_Of_Operations_To_Move_All_Boxes_To_Each_Box {

    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];

        int balls = 0, moves = 0;
        for (int i = 0; i < boxes.length(); i++) {
            res[i] = balls + moves;
            moves += balls;
            balls += Character.getNumericValue(boxes.charAt(i));
        }

        balls = 0;
        moves = 0;
        for (int i = boxes.length() - 1; i >= 0; i--) {
            res[i] += balls + moves;
            moves += balls;
            balls += Character.getNumericValue(boxes.charAt(i));
        }

        return res;
    }
}
