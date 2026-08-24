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
                if(pile % mid != 0) hours++;
                if(hours > h) break;
            }
            if(hours <= h){
                ans = mid;
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return ans;
    }
}