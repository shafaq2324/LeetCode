class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int maxlen = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            if(seen.containsKey(c)){
                l = Math.max(l, seen.get(c) + 1); // one ahead of the seen index
            }
            seen.put(c, r);
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}