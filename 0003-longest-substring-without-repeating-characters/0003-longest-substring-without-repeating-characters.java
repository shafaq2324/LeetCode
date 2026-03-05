class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int maxlen = 0;
        int l = 0; 
        for(int r = 0; r < s.length(); r++){ // right goes till end
            char c = s.charAt(r); // extract the rightmost char of window
            if(seen.containsKey(c)){
                // if character repeats start new window from position one ahead of last occurence of left
                l = seen.get(c) + 1; // one ahead of the seen index
            }
            seen.put(c, r); // if new character add in map
            maxlen = Math.max(maxlen, r - l + 1); // calculate window size
        }
        return maxlen;
    }
}