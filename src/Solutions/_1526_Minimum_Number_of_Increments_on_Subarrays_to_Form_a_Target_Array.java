package Solutions;

public class _1526_Minimum_Number_of_Increments_on_Subarrays_to_Form_a_Target_Array {

    public int minNumberOperations(int[] target) {
        int prev = 0;
        int res = 0;


        for (int curr : target) {
            if (curr > prev)
                res += curr - prev;

            prev = curr;
        }

        return res;
    }
}
