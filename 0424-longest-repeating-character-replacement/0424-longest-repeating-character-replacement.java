class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxLen = 0;
        int result = 0;
        int left = 0, right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxLen = Math.max(maxLen, freq[ch - 'A']);
            while ((right - left + 1 - maxLen) > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}