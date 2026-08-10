class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int ptr = 0;
        while(ptr < word1.length() || ptr < word2.length()){
            if(ptr < word1.length()){
                ans.append(word1.charAt(ptr));
            }
            if(ptr < word2.length()){
                ans.append(word2.charAt(ptr));
            }
            // even if one word exhausts the control transfers to the other string and pointer moves forward
            ptr++;
        }
        return ans.toString();
    }
}