package Solutions;

public class _1518_Water_Bottles {

    public int numWaterBottles(int numBottles, int numExchange) {
        int res = 0;

        while (numBottles >= numExchange) {
            numBottles -= numExchange;
            numBottles++;
            res += numExchange;
        }
        res += numBottles;

        return res;
    }
}
