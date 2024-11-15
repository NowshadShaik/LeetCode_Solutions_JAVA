package Solutions;

public class _1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {

    class Solution {
        public double average(int[] salary) {

            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            double sum = 0;
            int n=salary.length;
            for(int i=0;i<n;i++) {
                int a=salary[i];
                if(a>max) {
                    max = a;
                }
                if(a<min) {
                    min = a;
                }
                sum+=a;
            }
            return (sum-(max+min))/(n-2);
        }
    }
}
