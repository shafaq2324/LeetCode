class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        for(int len = n; len > 0; len--) {

            for(int i = 0; i <= n - len; i++) {

                String sub = s.substring(i, i + len);

                if(isPalindrome(sub)) {
                    return sub;
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