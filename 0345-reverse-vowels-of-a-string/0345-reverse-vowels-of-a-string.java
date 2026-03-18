class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        
        while(l < r){
            if("aeiouAEIOU".indexOf(arr[l]) != -1 
            && "aeiouAEIOU".indexOf(arr[r]) != -1){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }
            else if("aeiouAEIOU".indexOf(arr[l]) == -1){
                l++;
            }
            else{
                r--;
            }
        }
        return new String(arr);
    }
}