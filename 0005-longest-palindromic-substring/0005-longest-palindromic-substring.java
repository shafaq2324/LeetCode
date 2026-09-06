class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;

        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < len; i++) {
            // Check for odd-length palindromes (single character center)
            int l = i, r = i;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                int currentLen = r - l + 1;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    start = l;
                }
                l--; r++;
            }
            
            // Check for even-length palindromes (two character center)
            l = i; r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                int currentLen = r - l + 1;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    start = l;
                }
                l--; r++;
            }
        }
        
        return s.substring(start, start + maxLen);
    }
}