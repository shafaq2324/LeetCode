class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        while(l !=  r){
            int area = Math.min(height[l], height[r]) * (r - l);
            // area calculated according to width x minimum height as the amount of water depends on the height
            maxarea = Math.max(maxarea, area);
            if(height[l] <= height[r]) l++;
            // move the pointer with the lesser value
            else r--;
        }
        return maxarea;
        
    }
}