package Solutions;

public class _2601_Prime_Subtraction_Operation {

    public boolean primeSubOperation(int[] nums) {
        int prev = 0;

        for (int num : nums) {
            int upperBound = num - prev;
            int largestPrime = 0;

            for (int i = upperBound - 1; i >= 2; i--) {
                if (isPrime(i)) {
                    largestPrime = i;
                    break;
                }
            }
            if ((num - largestPrime) <= prev) return false;

            prev = num - largestPrime;
        }
        return true;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
