class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;

        if(l == 1){
            if(flowerbed[0] == 0 && n > 0){
                n--;
                flowerbed[0] = 1;
            }
            return n <= 0;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        for (int i = 1; i < l - 1; i++) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    i++;
                }
            }
        }

        if (flowerbed[l - 1] == 0 && flowerbed[l - 2] == 0) {
            flowerbed[l - 1] = 1;
            n--;
        }
        return n <= 0;
    }
}