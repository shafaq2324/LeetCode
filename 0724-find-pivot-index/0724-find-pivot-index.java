class Solution {
    public int pivotIndex(int[] nums) {
        int sumleft[] = new int[nums.length];
        int sumright[] = new int[nums.length];
        for(int i = 0; i < sumleft.length - 1; i++){
            sumleft[i + 1] = sumleft[i] + nums[i];
            //current element + previous left sum = next left sum
        }
        for(int i = sumright.length - 1; i > 0; i--){
            sumright[i - 1] = nums[i] + sumright[i];
            // while filling the array from the end add previous sum along with current element 
        }
        for(int i = 0; i < sumleft.length; i++){
            if(sumleft[i] == sumright[i]){
                return i;
            }
        }
        return -1;
    }
}