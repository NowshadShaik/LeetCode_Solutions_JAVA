package Solutions;

public class _0605_Can_Place_Flowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n <= 0) return true;
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    n--;
                    i++;
                } else {
                    i += 2;
                }
            } else {
                i++;
            }
        }
        return n <= 0;
    }
}
