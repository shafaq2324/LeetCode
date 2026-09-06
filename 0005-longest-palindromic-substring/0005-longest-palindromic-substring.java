class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 1) return "";
        else if(palindrome(s)) return s;
        int n = s.length();
        for(int len = n-1; len >= 1; len--){
            for(int i = 0; i <= n-len; i++){
                String sub = s.substring(i, i + len);
                if(palindrome(sub)){
                    return sub;
                }
            }
        }
        return "";
    }
    public boolean palindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}