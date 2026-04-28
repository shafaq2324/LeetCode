class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        for(int len = n; len > 0; len--) {
        // iterate via all lengths of palindromic strings
            for(int i = 0; i <= n - len; i++) {
                // slide window of len size 
                String sub = s.substring(i, i + len);
                // extract substring from current window 
                if(isPalindrome(sub)) {
                    return sub; // check if palindrome
                }
            }
        }

        return "";
    }

    public boolean isPalindrome(String str) {

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