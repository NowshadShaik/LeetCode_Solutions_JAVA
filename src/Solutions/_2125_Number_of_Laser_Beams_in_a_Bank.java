package Solutions;

public class _2125_Number_of_Laser_Beams_in_a_Bank {

    public int numberOfBeams(String[] bank) {
        int res = 0;

        int prev = 0;
        for (String row : bank) {
            int curr = 0;

            for (char cell : row.toCharArray()) {
                if (cell == '1') {
                    curr++;
                    res += prev;
                }
            }

            if (curr > 0)
                prev = curr;
        }

        return res;
    }
}
