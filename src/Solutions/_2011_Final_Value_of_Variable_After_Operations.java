package Solutions;

public class _2011_Final_Value_of_Variable_After_Operations {

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (String op : operations) {
            if (op.contains("+"))
                res++;
            else
                res--;
        }

        return res;
    }
}
