class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int ans = max;
        // first assume Koko can eat max number of bananas 
        while(min <= max){
            int mid = min + (max - min) / 2;
            long hours = 0;
            for(int pile: piles){
                long div = pile / mid;
                hours += div;
                // add the number of hours koko will take to eat the bananas according to mid
                if(pile % mid != 0) hours++;
                // add remaining bananas too
            }
            if(hours <= h){
                ans = mid;
                max = mid - 1;
                // if hours less than h then decrease speed
            }
            else{
                min = mid + 1;
                // if hours greater than h then increase speed
            }
        }
        return ans;
    }
}