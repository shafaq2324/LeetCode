class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        // pointer at start and end
        int water = 0;
        int lMax = 0;
        int rMax = 0;
        // maximum heights on each side
        while(l < r){
            // if left side is lesser process lMax
            if(height[l] <= height[r]){
                lMax = Math.max(lMax, height[l]);
                water += lMax - height[l];
                // Water trapped is the difference between current wall and max wall
                l++;
            }
            else{
                // If the right side is lower, process the right pointer
                rMax = Math.max(rMax, height[r]);
                water += rMax - height[r];
                r--;
            }
        }
        return water;

    }
}