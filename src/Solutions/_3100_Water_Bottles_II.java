package Solutions;

public class _3100_Water_Bottles_II {

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;

        while (numBottles >= numExchange) {
            numBottles -= numExchange;
            numBottles++;
            res++;
            numExchange++;
        }

        return res;
    }
}
