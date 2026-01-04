package Solutions;

public class _1390_Four_Divisors {

    public int sumFourDivisors(int[] nums) {
        int res = 0;

        for (int n : nums) {
            int sum = 0;
            int count = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {

                    sum += i;
                    count++;

                    if (i * i != n) {
                        count++;
                        sum += n / i;
                    }

                    if (count > 4) break;
                }
            }

            res += count == 4 ? sum : 0;
        }
        return res;
    }
}
