class Solution {
    public int maxVowels(String s, int k) {
        int j = k - 1;
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        maxCount = count;
        for(int i = k; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            c = s.charAt(i - k); 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count--;  // do not include consonants from previous window
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}