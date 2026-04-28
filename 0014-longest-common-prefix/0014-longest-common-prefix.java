
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        // sort to separate the most different strings in the beginning 
        StringBuilder result = new StringBuilder();
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length - 1].toCharArray();
        // After sorting, we only need to compare the first and the last strings
        for(int i = 0; i < first.length; i++){
            if(i >= last.length || first[i] != last[i]){
                break;
            }
            // If they match, it's part of the common prefix
            result.append(first[i]);
        } 
        return result.toString();
    }
}