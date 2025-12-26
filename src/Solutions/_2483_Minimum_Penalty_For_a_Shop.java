package Solutions;

public class _2483_Minimum_Penalty_For_a_Shop {

    public int bestClosingTime(String customers) {
        int hours = customers.length();
        int rightCust = 0;
        int leftEmpty = 0;

        for (char c : customers.toCharArray())
            if (c == 'Y')
                rightCust++;

        int penalty = rightCust;
        int resDay = 0;

        for (int i = 0; i <= hours; i++) {
            int currPen = rightCust + leftEmpty;

            if (currPen < penalty) {
                penalty = currPen;
                resDay = i;
            }

            if (i == hours)
                break;

            if (customers.charAt(i) == 'Y')
                rightCust--;
            else
                leftEmpty++;
        }

        return resDay;
    }
}
