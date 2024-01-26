class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // We can solve the problem in 0(n) time going through the middle and checking the for two edge cases at the end
        // Make sure anytime we find one make sure to flip the space to a 1
        int length = flowerbed.length;
        if(n == 0)
            return true;
        if(length == 1 && n == 1 && flowerbed[0] == 0)
            return true; 
        
        if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1; 
            n--;
        }

        for(int i = 1; i < length - 1; i++) {
            if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        if(flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
             flowerbed[length - 1] = 1; 
            n--;
        }

        if(n <= 0)
            return true;

        return false;
    }
}
