class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) {
                continue; // Skip if this string is already grouped
            }
            
            List<String> currentGroup = new ArrayList<>();
            currentGroup.add(strs[i]);
            visited[i] = true;
            
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    currentGroup.add(strs[j]);
                    visited[j] = true; // Mark as grouped
                }
            }
            result.add(currentGroup);
        }
        
        return result;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int val : count) {
            if (val != 0) return false;
        }
        return true;
    }
}