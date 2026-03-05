class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i, j + 1);
                String reversed = new StringBuilder(sub).reverse().toString();

                if(sub.equals(reversed) && sub.length() >= longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }
}