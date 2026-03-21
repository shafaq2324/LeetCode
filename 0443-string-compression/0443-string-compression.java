class Solution {
    public int compress(char[] chars) {
         int i = 0;
        int write = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // Count frequency
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // Write character
            chars[write++] = current;

            // Write count if > 1
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}