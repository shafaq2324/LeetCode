class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Step 1: skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            // Step 2: mark end of word
            int j = i;

            // Step 3: move to start of word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Step 4: append word
            sb.append(s.substring(i + 1, j + 1));
            sb.append(" ");
        }

        // Step 5: remove last extra space
        return sb.toString().trim();
        
    }
}