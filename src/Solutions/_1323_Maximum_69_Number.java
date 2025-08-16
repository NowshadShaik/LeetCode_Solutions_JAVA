package Solutions;

public class _1323_Maximum_69_Number {

    public int maximum69Number (int num) {

        char[] nums = String.valueOf(num).toCharArray();
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(nums));
    }

    /*
    More memory efficient solution

    Example: 9669
        Start with last digit:
        9 → skip
        6 (tens place, place=10) → toAdd = 3*10 = 30
        6 (hundreds place, place=100) → update toAdd = 3*100 = 300
        9 → skip
        After loop, toAdd = 300 (corresponds to the leftmost 6).
        Return 9669 + 300 = 9969.
     */
    public int maximum69Number1(int num) {
        int original = num;
        int place = 1;
        int toAdd = 0;

        while(num > 0) {
            int curr = num % 10;

            if(curr == 6)
                toAdd = 3 * place;

            place *= 10;
            num /= 10;
        }

        return original + toAdd;
    }
}
