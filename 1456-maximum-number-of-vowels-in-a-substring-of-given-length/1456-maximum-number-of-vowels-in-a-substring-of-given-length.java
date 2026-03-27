class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int l = 0;
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < n; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(i - l + 1 == k){
                maxCount = Math.max(count, maxCount);
                if(isVowel(s.charAt(l))) count--;
                l++; 
            }
        }
        return maxCount;
        
    }
    public boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}